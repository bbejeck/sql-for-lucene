package bbejeck.nosql.antlr;


import bbejeck.nosql.antlr.generated.NoSqlJDBCBaseListener;
import bbejeck.nosql.antlr.generated.NoSqlJDBCParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Bill Bejeck
 * Date: 6/2/14
 * Time: 10:20 PM
 */
public class PrintingLuceneListener extends NoSqlJDBCBaseListener {

    @Override
    public void exitDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx) {
        System.out.println("Describe stmt "+ctx.getText());
    }

    @Override
    public void exitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx) {
        System.out.println("Done parsing query "+ctx.getText());
    }

    @Override
    public void exitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx) {
        System.out.println("Exiting from "+ctx.PATH().toString());
    }

    @Override
    public void enterAnd(@NotNull NoSqlJDBCParser.AndContext ctx) {
        System.out.println("enterAnd");
    }

    @Override
    public void exitAnd(@NotNull NoSqlJDBCParser.AndContext ctx) {
        System.out.println("exitAnd");
    }

    @Override
    public void enterOr(@NotNull NoSqlJDBCParser.OrContext ctx) {
        System.out.println("enterOr");
    }

    @Override
    public void exitPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx) {
        System.out.println("phrase "+ctx.getText());
    }

    @Override
    public void enterAndNot(@NotNull NoSqlJDBCParser.AndNotContext ctx) {
        System.out.println("enter and not");
    }


    @Override
    public void exitMULTI_PHRASE(@NotNull NoSqlJDBCParser.MULTI_PHRASEContext ctx) {
        System.out.println("multi-phrase "+ctx.getText());
    }

    @Override
    public void exitTerm(@NotNull NoSqlJDBCParser.TermContext ctx) {
        System.out.println("term "+ctx.TERM().getText());
    }

    @Override
    public void enterPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx) {
        System.out.println("entered predicate");
    }

    @Override
    public void exitNumber(@NotNull NoSqlJDBCParser.NumberContext ctx) {
        System.out.println("exit number "+ctx.NUMBER());
    }

    @Override
    public void enterField(@NotNull NoSqlJDBCParser.FieldContext ctx) {
        System.out.println("entered field "+ctx.FIELD());
    }

    @Override
    public void enterNumber(@NotNull NoSqlJDBCParser.NumberContext ctx) {
        System.out.println("enter number "+ctx.NUMBER());
    }

    @Override
    public void exitPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx) {
        System.out.println("exiting predicate ");
    }

    @Override
    public void enterEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx) {
        System.out.println("entered equals ");
    }

    @Override
    public void enterLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx) {
        System.out.println("enter lessThanEquals");
    }


    @Override
    public void enterNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx) {
        System.out.println("entering nested query %%%%%%%%%%%%");
    }
    @Override
    public void exitNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx) {
        System.out.println("exiting nested query %%%%%%%%%%%% "+ctx.getText());
    }



    @Override
    public void exitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx) {
        System.out.println("exitSelect_stmt "+ctx.FIELD());
    }


//    @Override
//    public void exitAnd(@NotNull NoSqlJDBCParser.AndContext ctx) {
//        System.out.println("exitAnd "+ctx.getText());
//    }

//    @Override
//    public void exitEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx) {
//        System.out.println("exitEquals "+ctx.getText());
//    }
//
//
    @Override
    public void exitLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx) {
        System.out.println("exit lessThanEquals");
    }

}
