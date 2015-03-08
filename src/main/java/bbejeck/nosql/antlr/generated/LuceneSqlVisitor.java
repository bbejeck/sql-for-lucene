// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/LuceneSql.g4 by ANTLR 4.5
package bbejeck.nosql.antlr.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuceneSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuceneSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull LuceneSqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(@NotNull LuceneSqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stmt(@NotNull LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(@NotNull LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(@NotNull LuceneSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_predicate(@NotNull LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_predicate(@NotNull LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull LuceneSqlParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(@NotNull LuceneSqlParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(@NotNull LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(@NotNull LuceneSqlParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(@NotNull LuceneSqlParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEquals(@NotNull LuceneSqlParser.GreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEquals(@NotNull LuceneSqlParser.LessThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull LuceneSqlParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull LuceneSqlParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull LuceneSqlParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNot(@NotNull LuceneSqlParser.AndNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNot(@NotNull LuceneSqlParser.OrNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull LuceneSqlParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull LuceneSqlParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(@NotNull LuceneSqlParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull LuceneSqlParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI_PHRASE(@NotNull LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(@NotNull LuceneSqlParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(@NotNull LuceneSqlParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_term(@NotNull LuceneSqlParser.Between_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_number(@NotNull LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(@NotNull LuceneSqlParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(@NotNull LuceneSqlParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(@NotNull LuceneSqlParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(@NotNull LuceneSqlParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_list(@NotNull LuceneSqlParser.Date_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(@NotNull LuceneSqlParser.Term_listContext ctx);
}