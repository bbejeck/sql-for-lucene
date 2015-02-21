package bbejeck.nosql.antlr;

import bbejeck.nosql.antlr.generated.NoSqlJDBCLexer;
import bbejeck.nosql.antlr.generated.NoSqlJDBCParser;
import bbejeck.nosql.lucene.LuceneQueryListener;
import bbejeck.nosql.lucene.QueryContainer;
import bbejeck.nosql.util.TriFunction;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * User: Bill Bejeck
 * Date: 10/14/14
 * Time: 10:10 PM
 */
public interface AntlrFunctions {

    Function<String,ANTLRInputStream> toAntlrInputStream = ANTLRInputStream::new;
    Function<ANTLRInputStream,NoSqlJDBCLexer>  toLexer = NoSqlJDBCLexer::new;
    Function<NoSqlJDBCLexer,CommonTokenStream>  toTokenStream = CommonTokenStream::new;
    Function<CommonTokenStream,NoSqlJDBCParser> toNoSqlJDBCParser = NoSqlJDBCParser::new;
    Function<NoSqlJDBCParser,NoSqlJDBCParser.QueryContext> toParseTree = NoSqlJDBCParser::query;
    Supplier<ParseTreeWalker> parseTreeWalkerSupplier = ParseTreeWalker::new;
    Supplier<LuceneQueryListener> luceneQueryListenerSupplier = LuceneQueryListener::new;

   TriFunction<NoSqlJDBCParser,Supplier<ParseTreeWalker>,Supplier<LuceneQueryListener>,QueryContainer> parse = (p,s1,s2)->{
       LuceneQueryListener listener = s2.get();
       ParseTree parseTree = toParseTree.apply(p);
       ParseTreeWalker walker = s1.get();
       walker.walk(listener,parseTree);
       return new QueryContainer(listener.getQuery(),listener.getFilter());
   };



//    Function<NoSqlJDBCParser,Function<Supplier<ParseTreeWalker>,Function<Supplier<LuceneQueryListener>,LuceneQueryListener>>> parse =
//            parser -> ptws -> lql -> {
//                ParseTreeWalker walker = ptws.get();
//                LuceneQueryListener listener = lql.get();
//                ParseTree parseTree = toParseTree.apply(parser);
//                walker.walk(listener,parseTree);
//                return listener;
//            };

    Function<String,NoSqlJDBCParser> toParser = toAntlrInputStream.andThen(toLexer).andThen(toTokenStream).andThen(toNoSqlJDBCParser);

    default QueryContainer doParseLuceneQuery(String query){
           return parse.apply(toParser.apply(query),parseTreeWalkerSupplier,luceneQueryListenerSupplier);
    }
}
