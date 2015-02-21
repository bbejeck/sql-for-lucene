// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/NoSqlJDBC.g4 by ANTLR 4.5
package bbejeck.nosql.antlr.generated;
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
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#from_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#where_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stmt(@NotNull NoSqlJDBCParser.Where_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull NoSqlJDBCParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#comparison_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_predicate(@NotNull NoSqlJDBCParser.Comparison_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#function_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_predicate(@NotNull NoSqlJDBCParser.Function_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull NoSqlJDBCParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(@NotNull NoSqlJDBCParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(@NotNull NoSqlJDBCParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(@NotNull NoSqlJDBCParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanEquals}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEquals(@NotNull NoSqlJDBCParser.GreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEquals}
	 * labeled alternative in {@link NoSqlJDBCParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link NoSqlJDBCParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull NoSqlJDBCParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link NoSqlJDBCParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull NoSqlJDBCParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link NoSqlJDBCParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull NoSqlJDBCParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link NoSqlJDBCParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNot(@NotNull NoSqlJDBCParser.AndNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link NoSqlJDBCParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNot(@NotNull NoSqlJDBCParser.OrNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#nested_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link NoSqlJDBCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull NoSqlJDBCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link NoSqlJDBCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull NoSqlJDBCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link NoSqlJDBCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link NoSqlJDBCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull NoSqlJDBCParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link NoSqlJDBCParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI_PHRASE(@NotNull NoSqlJDBCParser.MULTI_PHRASEContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(@NotNull NoSqlJDBCParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(@NotNull NoSqlJDBCParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#between_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_term(@NotNull NoSqlJDBCParser.Between_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#between_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_number(@NotNull NoSqlJDBCParser.Between_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(@NotNull NoSqlJDBCParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(@NotNull NoSqlJDBCParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(@NotNull NoSqlJDBCParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(@NotNull NoSqlJDBCParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#date_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_list(@NotNull NoSqlJDBCParser.Date_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NoSqlJDBCParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(@NotNull NoSqlJDBCParser.Term_listContext ctx);
}