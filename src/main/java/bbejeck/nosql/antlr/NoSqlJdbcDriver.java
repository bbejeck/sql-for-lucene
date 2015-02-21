package bbejeck.nosql.antlr;

import bbejeck.nosql.antlr.generated.NoSqlJDBCLexer;
import bbejeck.nosql.antlr.generated.NoSqlJDBCParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * User: Bill Bejeck
 * Date: 6/2/14
 * Time: 9:50 PM
 */
public class NoSqlJdbcDriver {

    public static void main(String[] args) {
        String luceneQuery = "Select firstName, lastName from /foo/bar/index/ where name='Beth' and num_children <= 3" +
                " and not (workout='no lifting' and (uptight='ye?' or superficial='yes') ) ";
//        String luceneQuery = "describe /foo/bar/index";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(luceneQuery);
        NoSqlJDBCLexer lexer = new NoSqlJDBCLexer(antlrInputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        NoSqlJDBCParser parser = new NoSqlJDBCParser(tokenStream);
        ParseTree tree = parser.query();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PrintingLuceneListener(),tree);

    }
}
