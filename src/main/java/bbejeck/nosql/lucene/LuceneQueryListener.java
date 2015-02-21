package bbejeck.nosql.lucene;

import bbejeck.nosql.antlr.generated.NoSqlJDBCBaseListener;
import bbejeck.nosql.antlr.generated.NoSqlJDBCParser;
import com.google.common.collect.Lists;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.lucene.queries.BooleanFilter;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 9:54 PM
 */
public class LuceneQueryListener extends NoSqlJDBCBaseListener {

    private String indexPath;
    private List<BooleanClause> booleanClauses = Lists.newArrayList();
    private List<FilterClause> filterClauses = Lists.newArrayList();
    private Stack<LuceneQueryBuilder> queryBuilders = new Stack<>();
    private boolean isFilter = false;


    public void exitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx) {

    }

    @Override
    public void exitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx) {
        super.exitQuery(ctx);
    }

    @Override
    public void exitPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx) {
        if (isFilter) {
            filterClauses.add(queryBuilders.pop().buildFilter());
            isFilter = false;
        } else {
            booleanClauses.add(queryBuilders.pop().build());
        }
    }

    @Override
    public void enterPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx) {
        queryBuilders.push(new LuceneQueryBuilder());
    }

    @Override
    public void enterAnd(@NotNull NoSqlJDBCParser.AndContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.MUST);
    }

    @Override
    public void enterNot(@NotNull NoSqlJDBCParser.NotContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.MUST_NOT);
    }

    @Override
    public void enterOr(@NotNull NoSqlJDBCParser.OrContext ctx) {
        queryBuilders.peek().setOccur(BooleanClause.Occur.SHOULD);
    }

    @Override
    public void enterRegexp(@NotNull NoSqlJDBCParser.RegexpContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.REGEXP);
    }

    @Override
    public void enterTerm(@NotNull NoSqlJDBCParser.TermContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.TERM().getText());
        builder.setQueryType(QueryType.TERM);
    }

    @Override
    public void enterPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.PHRASE().getText());
        builder.setQueryType(QueryType.PHRASE);
    }

    @Override
    public void enterBetween_term(@NotNull NoSqlJDBCParser.Between_termContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        String firstTerm = ctx.TERM(0).getText();
        String secondTerm = ctx.TERM(1).getText();
        builder.setText(firstTerm + ":" + secondTerm);
        builder.setQueryType(QueryType.TERM_RANGE);
    }

    @Override
    public void enterBetween_number(@NotNull NoSqlJDBCParser.Between_numberContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        String firstTerm = ctx.NUMBER(0).getText();
        String secondTerm = ctx.NUMBER(1).getText();
        builder.setText(firstTerm + ":" + secondTerm);
        builder.setQueryType(QueryType.INTEGER_RANGE);
    }

    @Override
    public void enterLike(@NotNull NoSqlJDBCParser.LikeContext ctx) {
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setText(ctx.WILD_CARD().getText());
        builder.setQueryType(QueryType.WILDCARD);
    }

    @Override
    public void enterIn(@NotNull NoSqlJDBCParser.InContext ctx) {
        isFilter = true;
    }

    @Override
    public void enterNumber_list(@NotNull NoSqlJDBCParser.Number_listContext ctx) {
        List<String> numbers = ctx.NUMBER().stream().map(ParseTree::getText).collect(Collectors.toList());
        LuceneQueryBuilder builder = queryBuilders.peek();
        builder.setTextValues(numbers);
        builder.setFilterType(FilterType.TERMS_FILTER);
    }

    @Override
    public void enterField(@NotNull NoSqlJDBCParser.FieldContext ctx) {
        queryBuilders.peek().setField(ctx.FIELD().getText());
    }

    @Override
    public void exitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx) {
        this.indexPath = ctx.PATH().toString();
    }


    public BooleanQuery getQuery() {
        return LuceneQueryFunctions.toBooleanQuery.apply(booleanClauses);
    }
    public BooleanFilter getFilter() { return LuceneQueryFunctions.toBooleanFilter.apply(filterClauses);}


}
