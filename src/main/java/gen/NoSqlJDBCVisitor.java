// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/NoSqlJDBC.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NoSqlJDBCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NoSqlJDBCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#LessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(@NotNull NoSqlJDBCParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Wild_Card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWild_Card(@NotNull NoSqlJDBCParser.Wild_CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(@NotNull NoSqlJDBCParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#LessThanEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#AndNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNot(@NotNull NoSqlJDBCParser.AndNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#nested_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#GreaterThanEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEquals(@NotNull NoSqlJDBCParser.GreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#NotEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(@NotNull NoSqlJDBCParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull NoSqlJDBCParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#where_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stmt(@NotNull NoSqlJDBCParser.Where_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#GreaterThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(@NotNull NoSqlJDBCParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#InList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(@NotNull NoSqlJDBCParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull NoSqlJDBCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull NoSqlJDBCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull NoSqlJDBCParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull NoSqlJDBCParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#OrNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNot(@NotNull NoSqlJDBCParser.OrNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#MULTI_PHRASE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI_PHRASE(@NotNull NoSqlJDBCParser.MULTI_PHRASEContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull NoSqlJDBCParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#ValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(@NotNull NoSqlJDBCParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#from_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#Equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull NoSqlJDBCParser.AndContext ctx);
}