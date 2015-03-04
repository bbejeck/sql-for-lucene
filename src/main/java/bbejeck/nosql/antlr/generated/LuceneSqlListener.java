/*
 * *
 *
 *
 * Copyright 2015 Bill Bejeck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/LuceneSql.g4 by ANTLR 4.5
package bbejeck.nosql.antlr.generated;
import org.antlr.v4.runtime.misc.NotNull;
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
	void enterQuery(@NotNull LuceneSqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull LuceneSqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(@NotNull LuceneSqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(@NotNull LuceneSqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhere_stmt(@NotNull LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhere_stmt(@NotNull LuceneSqlParser.Where_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(@NotNull LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(@NotNull LuceneSqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull LuceneSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull LuceneSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison_predicate(@NotNull LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#comparison_predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison_predicate(@NotNull LuceneSqlParser.Comparison_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 */
	void enterFunction_predicate(@NotNull LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#function_predicate}.
	 * @param ctx the parse tree
	 */
	void exitFunction_predicate(@NotNull LuceneSqlParser.Function_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull LuceneSqlParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull LuceneSqlParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterEquals(@NotNull LuceneSqlParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitEquals(@NotNull LuceneSqlParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(@NotNull LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(@NotNull LuceneSqlParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(@NotNull LuceneSqlParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(@NotNull LuceneSqlParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(@NotNull LuceneSqlParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(@NotNull LuceneSqlParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEquals(@NotNull LuceneSqlParser.GreaterThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEquals(@NotNull LuceneSqlParser.GreaterThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEquals(@NotNull LuceneSqlParser.LessThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanEquals}
	 * labeled alternative in {@link LuceneSqlParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEquals(@NotNull LuceneSqlParser.LessThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull LuceneSqlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull LuceneSqlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull LuceneSqlParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull LuceneSqlParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull LuceneSqlParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull LuceneSqlParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterAndNot(@NotNull LuceneSqlParser.AndNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitAndNot(@NotNull LuceneSqlParser.AndNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void enterOrNot(@NotNull LuceneSqlParser.OrNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrNot}
	 * labeled alternative in {@link LuceneSqlParser#boolean_op}.
	 * @param ctx the parse tree
	 */
	void exitOrNot(@NotNull LuceneSqlParser.OrNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void enterNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void exitNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull LuceneSqlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull LuceneSqlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull LuceneSqlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Term}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull LuceneSqlParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(@NotNull LuceneSqlParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Phrase}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(@NotNull LuceneSqlParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull LuceneSqlParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Date}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull LuceneSqlParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMULTI_PHRASE(@NotNull LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTI_PHRASE}
	 * labeled alternative in {@link LuceneSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMULTI_PHRASE(@NotNull LuceneSqlParser.MULTI_PHRASEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(@NotNull LuceneSqlParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(@NotNull LuceneSqlParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 */
	void enterBetween(@NotNull LuceneSqlParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between}.
	 * @param ctx the parse tree
	 */
	void exitBetween(@NotNull LuceneSqlParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 */
	void enterBetween_term(@NotNull LuceneSqlParser.Between_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between_term}.
	 * @param ctx the parse tree
	 */
	void exitBetween_term(@NotNull LuceneSqlParser.Between_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 */
	void enterBetween_number(@NotNull LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#between_number}.
	 * @param ctx the parse tree
	 */
	void exitBetween_number(@NotNull LuceneSqlParser.Between_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 */
	void enterLike(@NotNull LuceneSqlParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#like}.
	 * @param ctx the parse tree
	 */
	void exitLike(@NotNull LuceneSqlParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(@NotNull LuceneSqlParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(@NotNull LuceneSqlParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(@NotNull LuceneSqlParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(@NotNull LuceneSqlParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 */
	void enterNumber_list(@NotNull LuceneSqlParser.Number_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#number_list}.
	 * @param ctx the parse tree
	 */
	void exitNumber_list(@NotNull LuceneSqlParser.Number_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 */
	void enterDate_list(@NotNull LuceneSqlParser.Date_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#date_list}.
	 * @param ctx the parse tree
	 */
	void exitDate_list(@NotNull LuceneSqlParser.Date_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(@NotNull LuceneSqlParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuceneSqlParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(@NotNull LuceneSqlParser.Term_listContext ctx);
}