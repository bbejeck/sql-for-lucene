package bbejeck.nosql.lucene;

import bbejeck.nosql.antlr.generated.NoSqlJDBCBaseVisitor;
import bbejeck.nosql.antlr.generated.NoSqlJDBCParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 9:58 PM
 */
public class LuceneQueryVisitor extends NoSqlJDBCBaseVisitor<LuceneQueryAssembler> {

    @Override
    public LuceneQueryAssembler visitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx) {
        return super.visitFrom_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitWhere_stmt(@NotNull NoSqlJDBCParser.Where_stmtContext ctx) {
        return super.visitWhere_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx) {
        return super.visitSelect_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx) {
        return super.visitDescribe_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }


}
