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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuceneSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, NOT=6, DESCRIBE=7, MATCHES=8, 
		BETWEEN=9, LIKE=10, LIMIT=11, MEMORY=12, EQ=13, NE=14, GT=15, LT=16, GTE=17, 
		LTE=18, IN=19, SPLAT=20, NUMBER=21, DATE=22, FIELD=23, PATH=24, TERM=25, 
		PHRASE=26, WILD_CARD=27, MULTI_PHRASE=28, DB_QUOTE_STRING_LIT=29, COMMA=30, 
		RPAREN=31, LPAREN=32, WS=33;
	public static final int
		RULE_query = 0, RULE_select_stmt = 1, RULE_from_stmt = 2, RULE_where_stmt = 3, 
		RULE_limit_stmt = 4, RULE_search_condition = 5, RULE_predicate = 6, RULE_comparison_predicate = 7, 
		RULE_function_predicate = 8, RULE_field = 9, RULE_comparison_op = 10, 
		RULE_range_op = 11, RULE_greater_than = 12, RULE_greater_than_equals = 13, 
		RULE_less_than = 14, RULE_less_than_equals = 15, RULE_boolean_op = 16, 
		RULE_nested_predicate = 17, RULE_value = 18, RULE_regexp = 19, RULE_between = 20, 
		RULE_between_term = 21, RULE_between_number = 22, RULE_like = 23, RULE_in = 24, 
		RULE_value_list = 25, RULE_number_list = 26, RULE_date_list = 27, RULE_term_list = 28, 
		RULE_phrase_list = 29;
	public static final String[] ruleNames = {
		"query", "select_stmt", "from_stmt", "where_stmt", "limit_stmt", "search_condition", 
		"predicate", "comparison_predicate", "function_predicate", "field", "comparison_op", 
		"range_op", "greater_than", "greater_than_equals", "less_than", "less_than_equals", 
		"boolean_op", "nested_predicate", "value", "regexp", "between", "between_term", 
		"between_number", "like", "in", "value_list", "number_list", "date_list", 
		"term_list", "phrase_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'='", "'!='", "'>'", "'<'", "'>='", "'<='", null, "'*'", null, 
		null, null, null, null, null, null, null, null, "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "LIMIT", "MEMORY", "EQ", "NE", "GT", "LT", "GTE", "LTE", 
		"IN", "SPLAT", "NUMBER", "DATE", "FIELD", "PATH", "TERM", "PHRASE", "WILD_CARD", 
		"MULTI_PHRASE", "DB_QUOTE_STRING_LIT", "COMMA", "RPAREN", "LPAREN", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LuceneSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuceneSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public Where_stmtContext where_stmt() {
			return getRuleContext(Where_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public From_stmtContext from_stmt() {
			return getRuleContext(From_stmtContext.class,0);
		}
		public Limit_stmtContext limit_stmt() {
			return getRuleContext(Limit_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(60); 
				select_stmt();
				}
			}

			setState(64);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(63); 
				from_stmt();
				}
			}

			setState(66); 
			where_stmt();
			setState(68);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(67); 
				limit_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(LuceneSqlParser.SELECT, 0); }
		public TerminalNode SPLAT() { return getToken(LuceneSqlParser.SPLAT, 0); }
		public List<TerminalNode> FIELD() { return getTokens(LuceneSqlParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(LuceneSqlParser.FIELD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			match(SELECT);
			setState(80);
			switch (_input.LA(1)) {
			case SPLAT:
				{
				setState(71); 
				match(SPLAT);
				}
				break;
			case FIELD:
				{
				{
				setState(72); 
				match(FIELD);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(73); 
					match(COMMA);
					setState(74); 
					match(FIELD);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_stmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(LuceneSqlParser.FROM, 0); }
		public TerminalNode PATH() { return getToken(LuceneSqlParser.PATH, 0); }
		public From_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterFrom_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitFrom_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitFrom_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_stmtContext from_stmt() throws RecognitionException {
		From_stmtContext _localctx = new From_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			match(FROM);
			setState(83); 
			match(PATH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(LuceneSqlParser.WHERE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterWhere_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitWhere_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitWhere_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			match(WHERE);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86); 
				search_condition();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_stmtContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(LuceneSqlParser.LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public Limit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLimit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLimit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLimit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_stmtContext limit_stmt() throws RecognitionException {
		Limit_stmtContext _localctx = new Limit_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			match(LIMIT);
			setState(92); 
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Search_conditionContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_search_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			predicate();
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(97);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(95); 
						predicate();
						}
						break;
					case 2:
						{
						setState(96); 
						nested_predicate();
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Comparison_predicateContext comparison_predicate() {
			return getRuleContext(Comparison_predicateContext.class,0);
		}
		public Function_predicateContext function_predicate() {
			return getRuleContext(Function_predicateContext.class,0);
		}
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(102); 
				boolean_op();
				}
			}

			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105); 
				comparison_predicate();
				}
				break;
			case 2:
				{
				setState(106); 
				function_predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_predicateContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Range_opContext range_op() {
			return getRuleContext(Range_opContext.class,0);
		}
		public Comparison_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterComparison_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitComparison_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitComparison_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_predicateContext comparison_predicate() throws RecognitionException {
		Comparison_predicateContext _localctx = new Comparison_predicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			field();
			setState(114);
			switch (_input.LA(1)) {
			case EQ:
			case NE:
				{
				setState(110); 
				comparison_op();
				setState(111); 
				value();
				}
				break;
			case GT:
			case LT:
			case GTE:
			case LTE:
				{
				setState(113); 
				range_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_predicateContext extends ParserRuleContext {
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public LikeContext like() {
			return getRuleContext(LikeContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public Function_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterFunction_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitFunction_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitFunction_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_predicateContext function_predicate() throws RecognitionException {
		Function_predicateContext _localctx = new Function_predicateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_predicate);
		try {
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); 
				regexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); 
				between();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); 
				like();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); 
				in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(LuceneSqlParser.FIELD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			match(FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_opContext extends ParserRuleContext {
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
	 
		public Comparison_opContext() { }
		public void copyFrom(Comparison_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualContext extends Comparison_opContext {
		public TerminalNode NE() { return getToken(LuceneSqlParser.NE, 0); }
		public NotEqualContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends Comparison_opContext {
		public TerminalNode EQ() { return getToken(LuceneSqlParser.EQ, 0); }
		public EqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_op);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				match(EQ);
				}
				break;
			case NE:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); 
				match(NE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_opContext extends ParserRuleContext {
		public Greater_thanContext greater_than() {
			return getRuleContext(Greater_thanContext.class,0);
		}
		public Greater_than_equalsContext greater_than_equals() {
			return getRuleContext(Greater_than_equalsContext.class,0);
		}
		public Less_thanContext less_than() {
			return getRuleContext(Less_thanContext.class,0);
		}
		public Less_than_equalsContext less_than_equals() {
			return getRuleContext(Less_than_equalsContext.class,0);
		}
		public Range_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterRange_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitRange_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitRange_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_opContext range_op() throws RecognitionException {
		Range_opContext _localctx = new Range_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range_op);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); 
				greater_than();
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); 
				greater_than_equals();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); 
				less_than();
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(131); 
				less_than_equals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_thanContext extends ParserRuleContext {
		public Greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than; }
	 
		public Greater_thanContext() { }
		public void copyFrom(Greater_thanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanNumberContext extends Greater_thanContext {
		public TerminalNode GT() { return getToken(LuceneSqlParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public GreaterThanNumberContext(Greater_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanTermContext extends Greater_thanContext {
		public TerminalNode GT() { return getToken(LuceneSqlParser.GT, 0); }
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public GreaterThanTermContext(Greater_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanDateContext extends Greater_thanContext {
		public TerminalNode GT() { return getToken(LuceneSqlParser.GT, 0); }
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public GreaterThanDateContext(Greater_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greater_thanContext greater_than() throws RecognitionException {
		Greater_thanContext _localctx = new Greater_thanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_greater_than);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new GreaterThanNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); 
				match(GT);
				setState(135); 
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new GreaterThanTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136); 
				match(GT);
				setState(137); 
				match(TERM);
				}
				break;
			case 3:
				_localctx = new GreaterThanDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138); 
				match(GT);
				setState(139); 
				match(DATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_than_equalsContext extends ParserRuleContext {
		public Greater_than_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than_equals; }
	 
		public Greater_than_equalsContext() { }
		public void copyFrom(Greater_than_equalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanEqTermContext extends Greater_than_equalsContext {
		public TerminalNode GTE() { return getToken(LuceneSqlParser.GTE, 0); }
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public GreaterThanEqTermContext(Greater_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanEqTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanEqTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanEqTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanEqNumberContext extends Greater_than_equalsContext {
		public TerminalNode GTE() { return getToken(LuceneSqlParser.GTE, 0); }
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public GreaterThanEqNumberContext(Greater_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanEqNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanEqNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanEqNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanEqDateContext extends Greater_than_equalsContext {
		public TerminalNode GTE() { return getToken(LuceneSqlParser.GTE, 0); }
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public GreaterThanEqDateContext(Greater_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterGreaterThanEqDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitGreaterThanEqDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitGreaterThanEqDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Greater_than_equalsContext greater_than_equals() throws RecognitionException {
		Greater_than_equalsContext _localctx = new Greater_than_equalsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_greater_than_equals);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new GreaterThanEqNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142); 
				match(GTE);
				setState(143); 
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new GreaterThanEqTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144); 
				match(GTE);
				setState(145); 
				match(TERM);
				}
				break;
			case 3:
				_localctx = new GreaterThanEqDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146); 
				match(GTE);
				setState(147); 
				match(DATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_thanContext extends ParserRuleContext {
		public Less_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than; }
	 
		public Less_thanContext() { }
		public void copyFrom(Less_thanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanTermContext extends Less_thanContext {
		public TerminalNode LT() { return getToken(LuceneSqlParser.LT, 0); }
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public LessThanTermContext(Less_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanNumberContext extends Less_thanContext {
		public TerminalNode LT() { return getToken(LuceneSqlParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public LessThanNumberContext(Less_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanDateContext extends Less_thanContext {
		public TerminalNode LT() { return getToken(LuceneSqlParser.LT, 0); }
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public LessThanDateContext(Less_thanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_thanContext less_than() throws RecognitionException {
		Less_thanContext _localctx = new Less_thanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_less_than);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new LessThanNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150); 
				match(LT);
				setState(151); 
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new LessThanTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152); 
				match(LT);
				setState(153); 
				match(TERM);
				}
				break;
			case 3:
				_localctx = new LessThanDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154); 
				match(LT);
				setState(155); 
				match(DATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_than_equalsContext extends ParserRuleContext {
		public Less_than_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than_equals; }
	 
		public Less_than_equalsContext() { }
		public void copyFrom(Less_than_equalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanEqDateContext extends Less_than_equalsContext {
		public TerminalNode LTE() { return getToken(LuceneSqlParser.LTE, 0); }
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public LessThanEqDateContext(Less_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanEqDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanEqDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanEqDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqTermContext extends Less_than_equalsContext {
		public TerminalNode LTE() { return getToken(LuceneSqlParser.LTE, 0); }
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public LessThanEqTermContext(Less_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanEqTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanEqTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanEqTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqNumberContext extends Less_than_equalsContext {
		public TerminalNode LTE() { return getToken(LuceneSqlParser.LTE, 0); }
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public LessThanEqNumberContext(Less_than_equalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLessThanEqNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLessThanEqNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLessThanEqNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_than_equalsContext less_than_equals() throws RecognitionException {
		Less_than_equalsContext _localctx = new Less_than_equalsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_less_than_equals);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LessThanEqNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158); 
				match(LTE);
				setState(159); 
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new LessThanEqTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160); 
				match(LTE);
				setState(161); 
				match(TERM);
				}
				break;
			case 3:
				_localctx = new LessThanEqDateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162); 
				match(LTE);
				setState(163); 
				match(DATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_opContext extends ParserRuleContext {
		public Boolean_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_op; }
	 
		public Boolean_opContext() { }
		public void copyFrom(Boolean_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndNotContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public AndNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterAndNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitAndNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitAndNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNotContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(LuceneSqlParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public OrNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitOrNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(LuceneSqlParser.OR, 0); }
		public OrContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public AndContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends Boolean_opContext {
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public NotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_opContext boolean_op() throws RecognitionException {
		Boolean_opContext _localctx = new Boolean_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean_op);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166); 
				match(AND);
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167); 
				match(OR);
				}
				break;
			case 3:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168); 
				match(NOT);
				}
				break;
			case 4:
				_localctx = new AndNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169); 
				match(AND);
				setState(170); 
				match(NOT);
				}
				break;
			case 5:
				_localctx = new OrNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171); 
				match(OR);
				setState(172); 
				match(NOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_predicateContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public Nested_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNested_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNested_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNested_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_predicateContext nested_predicate() throws RecognitionException {
		Nested_predicateContext _localctx = new Nested_predicateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nested_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(175); 
				boolean_op();
				}
			}

			setState(178); 
			match(RPAREN);
			setState(179); 
			predicate();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD) | (1L << RPAREN))) != 0)) {
				{
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(180); 
					predicate();
					}
					break;
				case 2:
					{
					setState(181); 
					nested_predicate();
					}
					break;
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); 
			match(LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MULTI_PHRASEContext extends ValueContext {
		public TerminalNode MULTI_PHRASE() { return getToken(LuceneSqlParser.MULTI_PHRASE, 0); }
		public MULTI_PHRASEContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterMULTI_PHRASE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitMULTI_PHRASE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitMULTI_PHRASE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateContext extends ValueContext {
		public TerminalNode DATE() { return getToken(LuceneSqlParser.DATE, 0); }
		public DateContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(LuceneSqlParser.NUMBER, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhraseContext extends ValueContext {
		public TerminalNode PHRASE() { return getToken(LuceneSqlParser.PHRASE, 0); }
		public PhraseContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermContext extends ValueContext {
		public TerminalNode TERM() { return getToken(LuceneSqlParser.TERM, 0); }
		public TermContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189); 
				match(NUMBER);
				}
				break;
			case TERM:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190); 
				match(TERM);
				}
				break;
			case PHRASE:
				_localctx = new PhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191); 
				match(PHRASE);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192); 
				match(DATE);
				}
				break;
			case MULTI_PHRASE:
				_localctx = new MULTI_PHRASEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193); 
				match(MULTI_PHRASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexpContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(LuceneSqlParser.MATCHES, 0); }
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public TerminalNode WILD_CARD() { return getToken(LuceneSqlParser.WILD_CARD, 0); }
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			field();
			setState(197); 
			match(MATCHES);
			setState(198); 
			match(RPAREN);
			setState(199); 
			match(WILD_CARD);
			setState(200); 
			match(LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BetweenContext extends ParserRuleContext {
		public Between_numberContext between_number() {
			return getRuleContext(Between_numberContext.class,0);
		}
		public Between_termContext between_term() {
			return getRuleContext(Between_termContext.class,0);
		}
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_between);
		try {
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); 
				between_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); 
				between_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_termContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(LuceneSqlParser.BETWEEN, 0); }
		public List<TerminalNode> TERM() { return getTokens(LuceneSqlParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(LuceneSqlParser.TERM, i);
		}
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public Between_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_termContext between_term() throws RecognitionException {
		Between_termContext _localctx = new Between_termContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_between_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			field();
			setState(207); 
			match(BETWEEN);
			setState(208); 
			match(TERM);
			setState(209); 
			match(AND);
			setState(210); 
			match(TERM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_numberContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(LuceneSqlParser.BETWEEN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(LuceneSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LuceneSqlParser.NUMBER, i);
		}
		public TerminalNode AND() { return getToken(LuceneSqlParser.AND, 0); }
		public Between_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterBetween_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitBetween_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitBetween_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_numberContext between_number() throws RecognitionException {
		Between_numberContext _localctx = new Between_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_between_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			field();
			setState(213); 
			match(BETWEEN);
			setState(214); 
			match(NUMBER);
			setState(215); 
			match(AND);
			setState(216); 
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(LuceneSqlParser.LIKE, 0); }
		public TerminalNode WILD_CARD() { return getToken(LuceneSqlParser.WILD_CARD, 0); }
		public LikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeContext like() throws RecognitionException {
		LikeContext _localctx = new LikeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_like);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			field();
			setState(219); 
			match(LIKE);
			setState(220); 
			match(WILD_CARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IN() { return getToken(LuceneSqlParser.IN, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LuceneSqlParser.NOT, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			field();
			setState(224);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(223); 
				match(NOT);
				}
			}

			setState(226); 
			match(IN);
			setState(227); 
			value_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(LuceneSqlParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LuceneSqlParser.LPAREN, 0); }
		public Number_listContext number_list() {
			return getRuleContext(Number_listContext.class,0);
		}
		public Date_listContext date_list() {
			return getRuleContext(Date_listContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public Phrase_listContext phrase_list() {
			return getRuleContext(Phrase_listContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); 
			match(RPAREN);
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(230); 
				number_list();
				}
				break;
			case 2:
				{
				setState(231); 
				date_list();
				}
				break;
			case 3:
				{
				setState(232); 
				term_list();
				}
				break;
			case 4:
				{
				setState(233); 
				phrase_list();
				}
				break;
			}
			setState(236); 
			match(LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_listContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(LuceneSqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LuceneSqlParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Number_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterNumber_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitNumber_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitNumber_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_listContext number_list() throws RecognitionException {
		Number_listContext _localctx = new Number_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); 
			match(NUMBER);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(239); 
				match(COMMA);
				setState(240); 
				match(NUMBER);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_listContext extends ParserRuleContext {
		public List<TerminalNode> DATE() { return getTokens(LuceneSqlParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(LuceneSqlParser.DATE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Date_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterDate_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitDate_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitDate_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_listContext date_list() throws RecognitionException {
		Date_listContext _localctx = new Date_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_date_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); 
			match(DATE);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247); 
				match(COMMA);
				setState(248); 
				match(DATE);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_listContext extends ParserRuleContext {
		public List<TerminalNode> TERM() { return getTokens(LuceneSqlParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(LuceneSqlParser.TERM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			match(TERM);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255); 
				match(COMMA);
				setState(256); 
				match(TERM);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Phrase_listContext extends ParserRuleContext {
		public List<TerminalNode> TERM() { return getTokens(LuceneSqlParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(LuceneSqlParser.TERM, i);
		}
		public List<TerminalNode> PHRASE() { return getTokens(LuceneSqlParser.PHRASE); }
		public TerminalNode PHRASE(int i) {
			return getToken(LuceneSqlParser.PHRASE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LuceneSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LuceneSqlParser.COMMA, i);
		}
		public Phrase_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).enterPhrase_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuceneSqlListener ) ((LuceneSqlListener)listener).exitPhrase_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuceneSqlVisitor ) return ((LuceneSqlVisitor<? extends T>)visitor).visitPhrase_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Phrase_listContext phrase_list() throws RecognitionException {
		Phrase_listContext _localctx = new Phrase_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_phrase_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==TERM || _la==PHRASE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263); 
				match(COMMA);
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==TERM || _la==PHRASE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\5\2C\n\2\3\2\3\2\5\2G\n\2\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\5\3S\n\3\3\4\3\4\3\4\3\5\3\5\6\5Z\n\5\r\5\16\5[\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\b\5\bj\n\b\3\b\3\b\5\bn\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\tu\n\t\3\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\f\3\f\5\f"+
		"\u0081\n\f\3\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u008f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3"+
		"\23\5\23\u00b3\n\23\3\23\3\23\3\23\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00c5\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\5\26\u00cf\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32"+
		"\u00e3\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00ed\n\33\3"+
		"\33\3\33\3\34\3\34\3\34\7\34\u00f4\n\34\f\34\16\34\u00f7\13\34\3\35\3"+
		"\35\3\35\7\35\u00fc\n\35\f\35\16\35\u00ff\13\35\3\36\3\36\3\36\7\36\u0104"+
		"\n\36\f\36\16\36\u0107\13\36\3\37\3\37\3\37\7\37\u010c\n\37\f\37\16\37"+
		"\u010f\13\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<\2\3\3\2\33\34\u0120\2?\3\2\2\2\4H\3\2\2\2\6T\3\2\2\2"+
		"\bW\3\2\2\2\n]\3\2\2\2\f`\3\2\2\2\16i\3\2\2\2\20o\3\2\2\2\22z\3\2\2\2"+
		"\24|\3\2\2\2\26\u0080\3\2\2\2\30\u0086\3\2\2\2\32\u008e\3\2\2\2\34\u0096"+
		"\3\2\2\2\36\u009e\3\2\2\2 \u00a6\3\2\2\2\"\u00af\3\2\2\2$\u00b2\3\2\2"+
		"\2&\u00c4\3\2\2\2(\u00c6\3\2\2\2*\u00ce\3\2\2\2,\u00d0\3\2\2\2.\u00d6"+
		"\3\2\2\2\60\u00dc\3\2\2\2\62\u00e0\3\2\2\2\64\u00e7\3\2\2\2\66\u00f0\3"+
		"\2\2\28\u00f8\3\2\2\2:\u0100\3\2\2\2<\u0108\3\2\2\2>@\5\4\3\2?>\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2AC\5\6\4\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\5\b\5"+
		"\2EG\5\n\6\2FE\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HR\7\3\2\2IS\7\26\2\2JO\7\31"+
		"\2\2KL\7 \2\2LN\7\31\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2RI\3\2\2\2RJ\3\2\2\2S\5\3\2\2\2TU\7\4\2\2UV\7\32\2\2V\7"+
		"\3\2\2\2WY\7\5\2\2XZ\5\f\7\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\\t\3\2\2\2]^\7\r\2\2^_\7\27\2\2_\13\3\2\2\2`e\5\16\b\2ad\5\16\b\2bd"+
		"\5$\23\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2"+
		"ge\3\2\2\2hj\5\"\22\2ih\3\2\2\2ij\3\2\2\2jm\3\2\2\2kn\5\20\t\2ln\5\22"+
		"\n\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2ot\5\24\13\2pq\5\26\f\2qr\5&\24\2"+
		"ru\3\2\2\2su\5\30\r\2tp\3\2\2\2ts\3\2\2\2u\21\3\2\2\2v{\5(\25\2w{\5*\26"+
		"\2x{\5\60\31\2y{\5\62\32\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\23"+
		"\3\2\2\2|}\7\31\2\2}\25\3\2\2\2~\u0081\7\17\2\2\177\u0081\7\20\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\27\3\2\2\2\u0082\u0087\5\32\16\2\u0083"+
		"\u0087\5\34\17\2\u0084\u0087\5\36\20\2\u0085\u0087\5 \21\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\31\3\2\2\2\u0088\u0089\7\21\2\2\u0089\u008f\7\27\2\2\u008a\u008b\7\21"+
		"\2\2\u008b\u008f\7\33\2\2\u008c\u008d\7\21\2\2\u008d\u008f\7\30\2\2\u008e"+
		"\u0088\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\33\3\2\2"+
		"\2\u0090\u0091\7\23\2\2\u0091\u0097\7\27\2\2\u0092\u0093\7\23\2\2\u0093"+
		"\u0097\7\33\2\2\u0094\u0095\7\23\2\2\u0095\u0097\7\30\2\2\u0096\u0090"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097\35\3\2\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009f\7\27\2\2\u009a\u009b\7\22\2\2\u009b\u009f"+
		"\7\33\2\2\u009c\u009d\7\22\2\2\u009d\u009f\7\30\2\2\u009e\u0098\3\2\2"+
		"\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2\2\2\u009f\37\3\2\2\2\u00a0\u00a1"+
		"\7\24\2\2\u00a1\u00a7\7\27\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a7\7\33\2"+
		"\2\u00a4\u00a5\7\24\2\2\u00a5\u00a7\7\30\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7!\3\2\2\2\u00a8\u00b0\7\6\2\2"+
		"\u00a9\u00b0\7\7\2\2\u00aa\u00b0\7\b\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00b0"+
		"\7\b\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00b0\7\b\2\2\u00af\u00a8\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0#\3\2\2\2\u00b1\u00b3\5\"\22\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7!\2\2\u00b5\u00ba\5\16\b\2\u00b6"+
		"\u00b9\5\16\b\2\u00b7\u00b9\5$\23\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\"\2\2\u00be%\3\2\2\2"+
		"\u00bf\u00c5\7\27\2\2\u00c0\u00c5\7\33\2\2\u00c1\u00c5\7\34\2\2\u00c2"+
		"\u00c5\7\30\2\2\u00c3\u00c5\7\36\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3"+
		"\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\'\3\2\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7!\2"+
		"\2\u00c9\u00ca\7\35\2\2\u00ca\u00cb\7\"\2\2\u00cb)\3\2\2\2\u00cc\u00cf"+
		"\5.\30\2\u00cd\u00cf\5,\27\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"+\3\2\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\13\2\2\u00d2\u00d3\7\33"+
		"\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\33\2\2\u00d5-\3\2\2\2\u00d6\u00d7"+
		"\5\24\13\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\7\6\2"+
		"\2\u00da\u00db\7\27\2\2\u00db/\3\2\2\2\u00dc\u00dd\5\24\13\2\u00dd\u00de"+
		"\7\f\2\2\u00de\u00df\7\35\2\2\u00df\61\3\2\2\2\u00e0\u00e2\5\24\13\2\u00e1"+
		"\u00e3\7\b\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6\5\64\33\2\u00e6\63\3\2\2\2\u00e7"+
		"\u00ec\7!\2\2\u00e8\u00ed\5\66\34\2\u00e9\u00ed\58\35\2\u00ea\u00ed\5"+
		":\36\2\u00eb\u00ed\5<\37\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\""+
		"\2\2\u00ef\65\3\2\2\2\u00f0\u00f5\7\27\2\2\u00f1\u00f2\7 \2\2\u00f2\u00f4"+
		"\7\27\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\67\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fd"+
		"\7\30\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fc\7\30\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe9\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\7\33\2\2\u0101\u0102\7 \2\2\u0102"+
		"\u0104\7\33\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106;\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d"+
		"\t\2\2\2\u0109\u010a\7 \2\2\u010a\u010c\t\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e=\3\2\2\2"+
		"\u010f\u010d\3\2\2\2 ?BFOR[ceimtz\u0080\u0086\u008e\u0096\u009e\u00a6"+
		"\u00af\u00b2\u00b8\u00ba\u00c4\u00ce\u00e2\u00ec\u00f5\u00fd\u0105\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}