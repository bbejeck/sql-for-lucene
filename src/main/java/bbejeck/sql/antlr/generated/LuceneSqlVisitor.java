// Generated from /Users/bbejeck/dev/github_clones/sql-for-lucene/src/main/java/LuceneSql.g4 by ANTLR 4.5.1
package bbejeck.sql.antlr.generated;
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
	T visitQuery(LuceneSqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_stmt(LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_stmt(LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#limit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_stmt(LuceneSqlParser.Limit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(LuceneSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_predicate(LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_predicate(LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LuceneSqlParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(LuceneSqlParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#range_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_op(LuceneSqlParser.Range_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanNumber(LuceneSqlParser.GreaterThanNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanTerm(LuceneSqlParser.GreaterThanTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanDate(LuceneSqlParser.GreaterThanDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqNumber(LuceneSqlParser.GreaterThanEqNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqTerm(LuceneSqlParser.GreaterThanEqTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqDate(LuceneSqlParser.GreaterThanEqDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanNumber(LuceneSqlParser.LessThanNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanTerm(LuceneSqlParser.LessThanTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanDate(LuceneSqlParser.LessThanDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqNumber(LuceneSqlParser.LessThanEqNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqTerm(LuceneSqlParser.LessThanEqTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqDate(LuceneSqlParser.LessThanEqDateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LuceneSqlParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LuceneSqlParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LuceneSqlParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNot(LuceneSqlParser.AndNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrNot(LuceneSqlParser.OrNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_predicate(LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LuceneSqlParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LuceneSqlParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(LuceneSqlParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(LuceneSqlParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI_PHRASE(LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(LuceneSqlParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(LuceneSqlParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_term(LuceneSqlParser.Between_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_number(LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(LuceneSqlParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(LuceneSqlParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(LuceneSqlParser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_list(LuceneSqlParser.Number_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_list(LuceneSqlParser.Date_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(LuceneSqlParser.Term_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuceneSqlParser#phrase_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase_list(LuceneSqlParser.Phrase_listContext ctx);
}