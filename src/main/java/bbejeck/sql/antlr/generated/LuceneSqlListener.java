// Generated from /Users/bbejeck/dev/github_clones/sql-for-lucene/src/main/java/LuceneSql.g4 by ANTLR 4.5.1
package bbejeck.sql.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuceneSqlParser}.
 */
public interface LuceneSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(LuceneSqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(LuceneSqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stmt(LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stmt(LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhere_stmt(LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhere_stmt(LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#limit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLimit_stmt(LuceneSqlParser.Limit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#limit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLimit_stmt(LuceneSqlParser.Limit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LuceneSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LuceneSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison_predicate(LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison_predicate(LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_predicate(LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_predicate(LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LuceneSqlParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LuceneSqlParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterEquals(LuceneSqlParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitEquals(LuceneSqlParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#range_op}.
	 * @param ctx the parse tree
	 */
	void enterRange_op(LuceneSqlParser.Range_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#range_op}.
	 * @param ctx the parse tree
	 */
	void exitRange_op(LuceneSqlParser.Range_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanNumber(LuceneSqlParser.GreaterThanNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanNumber(LuceneSqlParser.GreaterThanNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanTerm(LuceneSqlParser.GreaterThanTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanTerm(LuceneSqlParser.GreaterThanTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanDate(LuceneSqlParser.GreaterThanDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanDate(LuceneSqlParser.GreaterThanDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqNumber(LuceneSqlParser.GreaterThanEqNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqNumber(LuceneSqlParser.GreaterThanEqNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqTerm(LuceneSqlParser.GreaterThanEqTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqTerm(LuceneSqlParser.GreaterThanEqTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqDate(LuceneSqlParser.GreaterThanEqDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#greater_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqDate(LuceneSqlParser.GreaterThanEqDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void enterLessThanNumber(LuceneSqlParser.LessThanNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void exitLessThanNumber(LuceneSqlParser.LessThanNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void enterLessThanTerm(LuceneSqlParser.LessThanTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void exitLessThanTerm(LuceneSqlParser.LessThanTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void enterLessThanDate(LuceneSqlParser.LessThanDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than}.
	 * @param ctx the parse tree
	 */
	void exitLessThanDate(LuceneSqlParser.LessThanDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqNumber(LuceneSqlParser.LessThanEqNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEqNumber}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqNumber(LuceneSqlParser.LessThanEqNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqTerm(LuceneSqlParser.LessThanEqTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEqTerm}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqTerm(LuceneSqlParser.LessThanEqTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqDate(LuceneSqlParser.LessThanEqDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEqDate}
	 * labeled alternative in {@link LuceneSqlParser#less_than_equals}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqDate(LuceneSqlParser.LessThanEqDateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LuceneSqlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LuceneSqlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterOr(LuceneSqlParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitOr(LuceneSqlParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterNot(LuceneSqlParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitNot(LuceneSqlParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterAndNot(LuceneSqlParser.AndNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitAndNot(LuceneSqlParser.AndNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterOrNot(LuceneSqlParser.OrNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitOrNot(LuceneSqlParser.OrNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void enterNested_predicate(LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void exitNested_predicate(LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LuceneSqlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LuceneSqlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LuceneSqlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LuceneSqlParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(LuceneSqlParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(LuceneSqlParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDate(LuceneSqlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDate(LuceneSqlParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMULTI_PHRASE(LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMULTI_PHRASE(LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(LuceneSqlParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(LuceneSqlParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(LuceneSqlParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(LuceneSqlParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 */
	void enterBetween_term(LuceneSqlParser.Between_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 */
	void exitBetween_term(LuceneSqlParser.Between_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 */
	void enterBetween_number(LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 */
	void exitBetween_number(LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 */
	void enterLike(LuceneSqlParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 */
	void exitLike(LuceneSqlParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(LuceneSqlParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(LuceneSqlParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(LuceneSqlParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(LuceneSqlParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(LuceneSqlParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(LuceneSqlParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 */
	void enterDate_list(LuceneSqlParser.Date_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 */
	void exitDate_list(LuceneSqlParser.Date_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(LuceneSqlParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(LuceneSqlParser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#phrase_list}.
	 * @param ctx the parse tree
	 */
	void enterPhrase_list(LuceneSqlParser.Phrase_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#phrase_list}.
	 * @param ctx the parse tree
	 */
	void exitPhrase_list(LuceneSqlParser.Phrase_listContext ctx);
}