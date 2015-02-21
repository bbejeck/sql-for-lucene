// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/NoSqlJDBC.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NoSqlJDBCParser}.
 */
public interface NoSqlJDBCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#LessThan}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(@NotNull NoSqlJDBCParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#LessThan}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(@NotNull NoSqlJDBCParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull NoSqlJDBCParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull NoSqlJDBCParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull NoSqlJDBCParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Wild_Card}.
	 * @param ctx the parse tree
	 */
	void enterWild_Card(@NotNull NoSqlJDBCParser.Wild_CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Wild_Card}.
	 * @param ctx the parse tree
	 */
	void exitWild_Card(@NotNull NoSqlJDBCParser.Wild_CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(@NotNull NoSqlJDBCParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(@NotNull NoSqlJDBCParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(@NotNull NoSqlJDBCParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#LessThanEquals}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#LessThanEquals}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEquals(@NotNull NoSqlJDBCParser.LessThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#AndNot}.
	 * @param ctx the parse tree
	 */
	void enterAndNot(@NotNull NoSqlJDBCParser.AndNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#AndNot}.
	 * @param ctx the parse tree
	 */
	void exitAndNot(@NotNull NoSqlJDBCParser.AndNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull NoSqlJDBCParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void enterNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#nested_predicate}.
	 * @param ctx the parse tree
	 */
	void exitNested_predicate(@NotNull NoSqlJDBCParser.Nested_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#GreaterThanEquals}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEquals(@NotNull NoSqlJDBCParser.GreaterThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#GreaterThanEquals}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEquals(@NotNull NoSqlJDBCParser.GreaterThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#NotEqual}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(@NotNull NoSqlJDBCParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#NotEqual}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(@NotNull NoSqlJDBCParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(@NotNull NoSqlJDBCParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(@NotNull NoSqlJDBCParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(@NotNull NoSqlJDBCParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhere_stmt(@NotNull NoSqlJDBCParser.Where_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#where_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhere_stmt(@NotNull NoSqlJDBCParser.Where_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#GreaterThan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(@NotNull NoSqlJDBCParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#GreaterThan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(@NotNull NoSqlJDBCParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#InList}.
	 * @param ctx the parse tree
	 */
	void enterInList(@NotNull NoSqlJDBCParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#InList}.
	 * @param ctx the parse tree
	 */
	void exitInList(@NotNull NoSqlJDBCParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull NoSqlJDBCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull NoSqlJDBCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull NoSqlJDBCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull NoSqlJDBCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull NoSqlJDBCParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull NoSqlJDBCParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull NoSqlJDBCParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull NoSqlJDBCParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#OrNot}.
	 * @param ctx the parse tree
	 */
	void enterOrNot(@NotNull NoSqlJDBCParser.OrNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#OrNot}.
	 * @param ctx the parse tree
	 */
	void exitOrNot(@NotNull NoSqlJDBCParser.OrNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#MULTI_PHRASE}.
	 * @param ctx the parse tree
	 */
	void enterMULTI_PHRASE(@NotNull NoSqlJDBCParser.MULTI_PHRASEContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#MULTI_PHRASE}.
	 * @param ctx the parse tree
	 */
	void exitMULTI_PHRASE(@NotNull NoSqlJDBCParser.MULTI_PHRASEContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull NoSqlJDBCParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull NoSqlJDBCParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#ValueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull NoSqlJDBCParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#ValueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull NoSqlJDBCParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#from_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stmt(@NotNull NoSqlJDBCParser.From_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#Equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#Equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(@NotNull NoSqlJDBCParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoSqlJDBCParser#And}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull NoSqlJDBCParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoSqlJDBCParser#And}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull NoSqlJDBCParser.AndContext ctx);
}