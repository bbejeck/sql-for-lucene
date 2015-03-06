/*
 * *
 *
 *
 * Copyright 2015 Bill Bejeck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package bbejeck.nosql.lucene;

import bbejeck.nosql.antlr.generated.LuceneSqlBaseListener;
import bbejeck.nosql.antlr.generated.LuceneSqlParser;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.lucene.queries.BooleanFilter;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;

import java.util.List;
import java.util.Stack;
import java.util.function.Function;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 9:54 PM
 */
public class LuceneQueryListener extends LuceneSqlBaseListener {

    private String indexPath;
    private List<FilterClause> filterClauses = Lists.newArrayList();
    private Stack<LuceneQueryBuilder> queryBuilders = new Stack<>();
    private Stack<List<BooleanClause>> booleanClausesListStack = new Stack<>();
    private Function<Joiner,Function<Iterable<TerminalNode>,String>> toJoinedFunction = j -> j::join;
    private Function<Iterable<TerminalNode>,String> toJoinedString = toJoinedFunction.apply(Joiner.on(':'));

    public LuceneQueryListener() {
        booleanClausesListStack.push(Lists.newArrayList());
    }

    public void exitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx) {

    }

    @Override
    public void exitQuery(@NotNull LuceneSqlParser.QueryContext ctx) {
        super.exitQuery(ctx);
    }

    @Override
    public void exitPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
            booleanClausesListStack.peek().add(queryBuilders.pop().build());
    }

    @Override
    public void enterPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
        queryBuilders.push(new LuceneQueryBuilder());
    }

    @Override
    public void enterAnd(@NotNull LuceneSqlParser.AndContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.MUST);
    }

    @Override
    public void enterAndNot(@NotNull LuceneSqlParser.AndNotContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterNot(@NotNull LuceneSqlParser.NotContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterOr(@NotNull LuceneSqlParser.OrContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.SHOULD);
    }

    @Override
    public void enterRegexp(@NotNull LuceneSqlParser.RegexpContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.REGEXP);
    }

    @Override
    public void enterTerm(@NotNull LuceneSqlParser.TermContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.TERM().getText());
        builder.setQueryType(QueryType.TERM);
    }

    @Override
    public void enterPhrase(@NotNull LuceneSqlParser.PhraseContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.PHRASE().getText());
        builder.setQueryType(QueryType.PHRASE);
    }

    @Override
    public void enterBetween_term(@NotNull LuceneSqlParser.Between_termContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.TERM()));
        builder.setQueryType(QueryType.TERM_RANGE);
    }

    @Override
    public void enterBetween_number(@NotNull LuceneSqlParser.Between_numberContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.NUMBER()));
        builder.setQueryType(QueryType.INTEGER_RANGE);
    }

    @Override
    public void enterLike(@NotNull LuceneSqlParser.LikeContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.WILDCARD);
    }

    @Override
    public void enterNumber_list(@NotNull LuceneSqlParser.Number_listContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.NUMBER()));
        builder.setQueryType(QueryType.BOOLEAN_OR_LIST);
    }

    @Override
    public void enterTerm_list(@NotNull LuceneSqlParser.Term_listContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.TERM()));
        builder.setQueryType(QueryType.BOOLEAN_OR_LIST);
    }

    @Override
    public void enterNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
               booleanClausesListStack.push(Lists.newArrayList());
               queryBuilders.push(new LuceneQueryBuilder());
    }

    @Override
    public void exitNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
               List<BooleanClause> nestedClauses = booleanClausesListStack.pop();
               LuceneQueryBuilder queryBuilder = queryBuilders.pop();
               queryBuilder.setBooleanClauses(nestedClauses);
               booleanClausesListStack.peek().add(queryBuilder.build());
    }

    @Override
    public void enterField(@NotNull LuceneSqlParser.FieldContext ctx) {
        queryBuilders.peek().setField(ctx.FIELD().getText());
    }

    @Override
    public void exitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx) {
        this.indexPath = ctx.PATH().toString();
    }


    public BooleanQuery getQuery() {
        return LuceneQueryFunctions.toBooleanQuery.apply(booleanClausesListStack.pop());
    }
    public BooleanFilter getFilter() { return LuceneQueryFunctions.toBooleanFilter.apply(filterClauses);}


}
