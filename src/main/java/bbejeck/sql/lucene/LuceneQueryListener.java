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

package bbejeck.sql.lucene;

import bbejeck.sql.antlr.generated.LuceneSqlBaseListener;
import bbejeck.sql.antlr.generated.LuceneSqlParser;
import com.carrotsearch.ant.tasks.junit4.dependencies.com.google.common.collect.Sets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.search.BooleanClause;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 9:54 PM
 */
public class LuceneQueryListener extends LuceneSqlBaseListener {

    private String indexPath;
    private int limit;
    private Set<String> selectedFields = Sets.newHashSet();
    private List<FilterClause> filterClauses = Lists.newArrayList();
    private Stack<BooleanClauseBuilder> booleanClauseBuilders = new Stack<>();
    private Stack<List<BooleanClause>> booleanClausesListStack = new Stack<>();
    private List<BooleanClause> completeBooleanClauseList = Lists.newArrayList();
    private Function<Joiner, Function<Iterable<TerminalNode>, String>> toJoinedFunction = j -> j::join;
    private Function<Iterable<TerminalNode>, String> toJoinedString = toJoinedFunction.apply(Joiner.on(':').skipNulls());
    private QueryParseResults.Builder queryResultsBuilder = QueryParseResults.newBuilder();


    @Override
    public void exitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx) {
        selectedFields = ctx.FIELD().stream().map(TerminalNode::getText).collect(Collectors.toSet());
    }

    @Override
    public void enterQuery(@NotNull LuceneSqlParser.QueryContext ctx) {
        booleanClausesListStack.push(Lists.newArrayList());
    }

    @Override
    public void exitQuery(@NotNull LuceneSqlParser.QueryContext ctx) {
        List<BooleanClause> booleanClauses = booleanClausesListStack.pop();
        completeBooleanClauseList = Lists.newArrayList(booleanClauses);
    }

    @Override
    public void exitPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
        booleanClausesListStack.peek().add(booleanClauseBuilders.pop().build());
    }

    @Override
    public void enterPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
        booleanClauseBuilders.push(new BooleanClauseBuilder());
    }


    @Override
    public void enterLessThanNumber(@NotNull LuceneSqlParser.LessThanNumberContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.NUMBER()+":false");
        builder.setQueryType(QueryType.INTEGER_RANGE_UNBOUNDED);
    }

    @Override
    public void enterLessThanTerm(@NotNull LuceneSqlParser.LessThanTermContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.TERM()+":false");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterLessThanDate(@NotNull LuceneSqlParser.LessThanDateContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.DATE()+":false");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterLessThanEqNumber(@NotNull LuceneSqlParser.LessThanEqNumberContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.NUMBER()+":true");
        builder.setQueryType(QueryType.INTEGER_RANGE_UNBOUNDED);
    }

    @Override
    public void enterLessThanEqTerm(@NotNull LuceneSqlParser.LessThanEqTermContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.TERM()+":true");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterLessThanEqDate(@NotNull LuceneSqlParser.LessThanEqDateContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(QueryType.UNBOUNDED + ":" + ctx.DATE()+":true");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanNumber(@NotNull LuceneSqlParser.GreaterThanNumberContext ctx) {
           BooleanClauseBuilder builder = booleanClauseBuilders.peek();
           builder.setText(ctx.NUMBER().getText()+":"+QueryType.UNBOUNDED+":false");
           builder.setQueryType(QueryType.INTEGER_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanTerm(@NotNull LuceneSqlParser.GreaterThanTermContext ctx) {
          BooleanClauseBuilder builder = booleanClauseBuilders.peek();
          builder.setText(ctx.TERM()+":"+QueryType.UNBOUNDED+":false");
          builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanDate(@NotNull LuceneSqlParser.GreaterThanDateContext ctx) {
          BooleanClauseBuilder builder = booleanClauseBuilders.peek();
          builder.setText(ctx.DATE().getText()+":"+QueryType.UNBOUNDED+":false");
          builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanEqNumber(@NotNull LuceneSqlParser.GreaterThanEqNumberContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.NUMBER().getText()+":"+QueryType.UNBOUNDED+":true");
        builder.setQueryType(QueryType.INTEGER_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanEqTerm(@NotNull LuceneSqlParser.GreaterThanEqTermContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.TERM()+":"+QueryType.UNBOUNDED+":true");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterGreaterThanEqDate(@NotNull LuceneSqlParser.GreaterThanEqDateContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.DATE().getText()+":"+QueryType.UNBOUNDED+":true");
        builder.setQueryType(QueryType.TERM_RANGE_UNBOUNDED);
    }

    @Override
    public void enterAnd(@NotNull LuceneSqlParser.AndContext ctx) {
        booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.MUST);
    }

    @Override
    public void enterIn(@NotNull LuceneSqlParser.InContext ctx) {
        if (ctx.NOT() != null) {
            booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
        }
    }

    @Override
    public void enterNotEqual(@NotNull LuceneSqlParser.NotEqualContext ctx) {
        booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterAndNot(@NotNull LuceneSqlParser.AndNotContext ctx) {
        booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterNot(@NotNull LuceneSqlParser.NotContext ctx) {
        booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterOr(@NotNull LuceneSqlParser.OrContext ctx) {
        booleanClauseBuilders.peek().setOccur(BooleanClause.Occur.SHOULD);
    }

    @Override
    public void enterRegexp(@NotNull LuceneSqlParser.RegexpContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.REGEXP);
    }

    @Override
    public void enterTerm(@NotNull LuceneSqlParser.TermContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.TERM().getText());
        builder.setQueryType(QueryType.TERM);
    }

    @Override
    public void enterNumber(@NotNull LuceneSqlParser.NumberContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.NUMBER().getText());
        builder.setQueryType(QueryType.TERM   );
    }

    @Override
    public void enterDate(@NotNull LuceneSqlParser.DateContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.DATE().getText());
        builder.setQueryType(QueryType.TERM);
    }

    @Override
    public void enterPhrase(@NotNull LuceneSqlParser.PhraseContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.PHRASE().getText());
        builder.setQueryType(QueryType.PHRASE);
    }

    @Override
    public void enterBetween_term(@NotNull LuceneSqlParser.Between_termContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.TERM()));
        builder.setQueryType(QueryType.TERM_RANGE);
    }

    @Override
    public void enterBetween_number(@NotNull LuceneSqlParser.Between_numberContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.NUMBER()));
        builder.setQueryType(QueryType.INTEGER_RANGE);
    }

    @Override
    public void enterLike(@NotNull LuceneSqlParser.LikeContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.WILDCARD);
    }

    @Override
    public void enterNumber_list(@NotNull LuceneSqlParser.Number_listContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.NUMBER()));
        builder.setQueryType(QueryType.BOOLEAN_OR_LIST);
    }

    @Override
    public void enterTerm_list(@NotNull LuceneSqlParser.Term_listContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        builder.setText(toJoinedString.apply(ctx.TERM()));
        builder.setQueryType(QueryType.BOOLEAN_OR_LIST);
    }

    @Override
    public void enterPhrase_list(@NotNull LuceneSqlParser.Phrase_listContext ctx) {
        BooleanClauseBuilder builder = booleanClauseBuilders.peek();
        List<TerminalNode> inputs = Lists.newArrayList();
        inputs.addAll(ctx.PHRASE());
        inputs.addAll(ctx.TERM());
        builder.setText(toJoinedString.apply(inputs));
        builder.setQueryType(QueryType.BOOLEAN_PHRASE_LIST);
    }

    @Override
    public void enterNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
        booleanClausesListStack.push(Lists.newArrayList());
        booleanClauseBuilders.push(new BooleanClauseBuilder());
    }

    @Override
    public void exitNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
        List<BooleanClause> nestedClauses = booleanClausesListStack.pop();
        BooleanClauseBuilder queryBuilder = booleanClauseBuilders.pop();
        queryBuilder.setBooleanClauses(nestedClauses);
        booleanClausesListStack.peek().add(queryBuilder.build());
    }

    @Override
    public void enterField(@NotNull LuceneSqlParser.FieldContext ctx) {
        booleanClauseBuilders.peek().setField(ctx.FIELD().getText());
    }

    @Override
    public void enterLimit_stmt(@NotNull LuceneSqlParser.Limit_stmtContext ctx) {
        this.limit = Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public void exitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx) {
        this.indexPath = ctx.PATH().toString();
    }

    public QueryParseResults getParseResults() {
        return queryResultsBuilder.withBooleanClausesList(this.completeBooleanClauseList)
                .withFilterClausesList(this.filterClauses)
                .withIndexPath(this.indexPath)
                .withLimit(this.limit)
                .withSelectFields(this.selectedFields).build();

    }


}
