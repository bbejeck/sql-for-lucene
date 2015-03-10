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

package bbejeck.nosql.lucene;

import bbejeck.nosql.antlr.AntlrLuceneFunctions;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * User: Bill Bejeck
 * Date: 10/9/14
 * Time: 11:12 PM
 */
public class LuceneQueryParsingTest {


    @Test
    public void test_parse_term_and_phrase_query() {
        String query = "Select name,address from /path/to/index/ where first_name='Beth' and last_name='Bejeck' or type='Big   Cutie '";
        BooleanQuery booleanQuery = parseQuery(query);
        BooleanClause[] clauses = booleanQuery.getClauses();
        assertThat(clauses.length, is(3));
        assertThat(clauses[0].getOccur(), is(BooleanClause.Occur.MUST));
        assertThat(clauses[1].getOccur(), is(BooleanClause.Occur.MUST));
        assertThat(clauses[2].getOccur(), is(BooleanClause.Occur.SHOULD));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("first_name"));
        assertThat(termQuery.getTerm().text(), is("beth"));

        termQuery = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery.getTerm().field(), is("last_name"));
        assertThat(termQuery.getTerm().text(), is("bejeck"));

        assertThat(clauses[2].getQuery().getClass().isAssignableFrom(PhraseQuery.class), is(true));
        assertThat(clauses[2].getOccur(), is(BooleanClause.Occur.SHOULD));
        PhraseQuery phraseQuery = (PhraseQuery) clauses[2].getQuery();
        assertArrayEquals(phraseQuery.getTerms(), new Term[]{new Term("type", "big"), new Term("type", "cutie")});
    }

    @Test
    public void test_parse_term_correctly() {
        String query = "select foo from /path/index/ where foo='Na,ME'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("foo"));
        assertThat(termQuery.getTerm().text(), is("name"));

    }

    @Test
    public void test_parse_regex_query() {
        String query = "Select foo from /path/index/ where foo matches('[Bb].*[hH]?')";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        RegexpQuery regexpQuery = (RegexpQuery) clauses[0].getQuery();
        assertThat(regexpQuery.getField(), is("foo"));
//        assertThat(regexpQuery.getTerm().text(),is("name"));
    }

    @Test
    public void test_parse_between_query() {
        String query = "Select foo from /path/index/ where foo between 'Beth' and 'Elizabeth'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        TermRangeQuery termRangeQuery = (TermRangeQuery) clauses[0].getQuery();
        assertThat(termRangeQuery.getField(), is("foo"));
        assertThat(new String(termRangeQuery.getLowerTerm().bytes).trim(), is("beth"));
        assertThat(new String(termRangeQuery.getUpperTerm().bytes).trim(), is("elizabeth"));
    }

    @Test
    public void test_parse_between_integer_query() {
        String query = "Select foo from /path/index/ where age between 33 and 48";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        NumericRangeQuery numericRangeQuery = (NumericRangeQuery) clauses[0].getQuery();
        assertThat(numericRangeQuery.getField(), is("age"));
        assertThat(numericRangeQuery.getMin().intValue(), is(33));
        assertThat(numericRangeQuery.getMax().intValue(), is(48));
    }

    @Test
    public void test_parse_like_wildcard_query() {
        String query = "select foo from /path/index/ where name like 'B?t?'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        WildcardQuery wildcardQuery = (WildcardQuery) clauses[0].getQuery();
        assertThat(wildcardQuery.getField(), is("name"));
        assertThat(wildcardQuery.getTerm().text(), is("b?t?"));
    }

    @Test
    public void test_parse_like_wildcard_query_with_asteric() {
        String query = "select foo from /path/index/ where name like 'B*th'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        WildcardQuery wildcardQuery = (WildcardQuery) clauses[0].getQuery();
        assertThat(wildcardQuery.getField(), is("name"));
        assertThat(wildcardQuery.getTerm().text(), is("b*th"));
    }

    @Test
    public void test_parse_like_prefix_query() {
        String query = "select foo from /path/index/ where name like 'Bet*'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        PrefixQuery prefixQuery = (PrefixQuery) clauses[0].getQuery();
        assertThat(prefixQuery.getField(), is("name"));
        assertThat(prefixQuery.getPrefix().text(), is("bet*"));
    }


    @Test
    public void test_parse_in_listquery() throws Exception {
        String query = "select foo from /path/index/ where name='Beth' and score in (0, 50, 55)";
        QueryParseResults qc = parseQueryAndFilter(query);
        BooleanClause[] clauses = qc.getBooleanQuery().getClauses();
        assertThat(clauses.length,is(2));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("name"));
        assertThat(termQuery.getTerm().text(), is("beth"));

        BooleanQuery booleanQuery = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery.clauses().size(),is(3));

        clauses = booleanQuery.getClauses();

        TermQuery termQuery1 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery1.getTerm().field(), is("score"));
        assertThat(termQuery1.getTerm().text(), is("0"));

        TermQuery termQuery2 = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery2.getTerm().field(), is("score"));
        assertThat(termQuery2.getTerm().text(), is("50"));

        TermQuery termQuery3 = (TermQuery) clauses[2].getQuery();
        assertThat(termQuery3.getTerm().field(), is("score"));
        assertThat(termQuery3.getTerm().text(), is("55"));

    }

    @Test
    public void test_parse_in_term_listquery() throws Exception {
        String query = "select foo from /path/index/ where name='Beth' and score in ('0', '50', '55')";
        QueryParseResults qc = parseQueryAndFilter(query);
        BooleanClause[] clauses = qc.getBooleanQuery().getClauses();
        assertThat(clauses.length,is(2));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("name"));
        assertThat(termQuery.getTerm().text(), is("beth"));

        BooleanQuery booleanQuery = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery.clauses().size(),is(3));

        clauses = booleanQuery.getClauses();

        TermQuery termQuery1 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery1.getTerm().field(), is("score"));
        assertThat(termQuery1.getTerm().text(), is("0"));

        TermQuery termQuery2 = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery2.getTerm().field(), is("score"));
        assertThat(termQuery2.getTerm().text(), is("50"));

        TermQuery termQuery3 = (TermQuery) clauses[2].getQuery();
        assertThat(termQuery3.getTerm().field(), is("score"));
        assertThat(termQuery3.getTerm().text(), is("55"));

    }

    @Test
    public void test_parse_nested_query() throws Exception{
        String query = "select foo from D:/some/path/ where a='1' and (b='2' and c='3' and d='4')";
        QueryParseResults qc = parseQueryAndFilter(query);
        BooleanClause[] clauses = qc.getBooleanQuery().getClauses();
        assertThat(clauses.length,is(2));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("a"));
        assertThat(termQuery.getTerm().text(), is("1"));

        BooleanQuery booleanQuery = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery.clauses().size(),is(3));

        clauses = booleanQuery.getClauses();

        TermQuery termQuery1 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery1.getTerm().field(), is("b"));
        assertThat(termQuery1.getTerm().text(), is("2"));

        TermQuery termQuery2 = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery2.getTerm().field(), is("c"));
        assertThat(termQuery2.getTerm().text(), is("3"));

        TermQuery termQuery3 = (TermQuery) clauses[2].getQuery();
        assertThat(termQuery3.getTerm().field(), is("d"));
        assertThat(termQuery3.getTerm().text(), is("4"));
    }

    @Test
    public void test_parse_deeper_nested_query() throws Exception{
        String query = "select foo from /some/path/ where a='1' and (b='2' and (c='3' and (d='4' and e='5')))";
        QueryParseResults qc = parseQueryAndFilter(query);
        //Overall query
        BooleanClause[] clauses = qc.getBooleanQuery().getClauses();
        assertThat(clauses.length,is(2));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("a"));
        assertThat(termQuery.getTerm().text(), is("1"));

        BooleanQuery booleanQuery = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery.clauses().size(),is(2));

        //First nesting
        clauses = booleanQuery.getClauses();

        TermQuery termQuery1 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery1.getTerm().field(), is("b"));
        assertThat(termQuery1.getTerm().text(), is("2"));

        BooleanQuery booleanQuery1 = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery1.clauses().size(),is(2));

        //Second nesting
        clauses = booleanQuery1.getClauses();

        TermQuery termQuery2 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery2.getTerm().field(), is("c"));
        assertThat(termQuery2.getTerm().text(), is("3"));

        BooleanQuery booleanQuery2 = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery2.clauses().size(),is(2));

        //Third nesting
        clauses = booleanQuery2.getClauses();

        TermQuery termQuery3 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery3.getTerm().field(), is("d"));
        assertThat(termQuery3.getTerm().text(), is("4"));

        TermQuery termQuery4 = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery4.getTerm().field(), is("e"));
        assertThat(termQuery4.getTerm().text(), is("5"));
    }

    @Test
    public void test_parse_deeper_nested_with_in_term_clause_query() throws Exception{
        String query = "select foo from /some/path/ where a='1' and (b='2' and (c='3' and (d='4' and e in (5,6,7))))";
        QueryParseResults qc = parseQueryAndFilter(query);
        //Overall query
        BooleanClause[] clauses = qc.getBooleanQuery().getClauses();
        assertThat(clauses.length,is(2));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("a"));
        assertThat(termQuery.getTerm().text(), is("1"));

        BooleanQuery booleanQuery = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery.clauses().size(),is(2));

        //First nesting
        clauses = booleanQuery.getClauses();

        TermQuery termQuery1 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery1.getTerm().field(), is("b"));
        assertThat(termQuery1.getTerm().text(), is("2"));

        BooleanQuery booleanQuery1 = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery1.clauses().size(),is(2));

        //Second nesting
        clauses = booleanQuery1.getClauses();

        TermQuery termQuery2 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery2.getTerm().field(), is("c"));
        assertThat(termQuery2.getTerm().text(), is("3"));

        BooleanQuery booleanQuery2 = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery2.clauses().size(),is(2));

        //Third nesting
        clauses = booleanQuery2.getClauses();

        TermQuery termQuery3 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery3.getTerm().field(), is("d"));
        assertThat(termQuery3.getTerm().text(), is("4"));

        BooleanQuery booleanQuery3 = (BooleanQuery) clauses[1].getQuery();
        assertThat(booleanQuery3.clauses().size(),is(3));

        clauses = booleanQuery3.getClauses();

        TermQuery termQuery4 = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery4.getTerm().field(), is("e"));
        assertThat(termQuery4.getTerm().text(), is("5"));

        TermQuery termQuery5 = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery5.getTerm().field(), is("e"));
        assertThat(termQuery5.getTerm().text(), is("6"));

        TermQuery termQuery6 = (TermQuery) clauses[2].getQuery();
        assertThat(termQuery6.getTerm().field(), is("e"));
        assertThat(termQuery6.getTerm().text(), is("7"));
    }


    private BooleanQuery parseQuery(String luceneQuery) {
        return AntlrLuceneFunctions.parseQuery(luceneQuery).getBooleanQuery();
    }

    private QueryParseResults parseQueryAndFilter(String luceneQuery){
        return AntlrLuceneFunctions.parseQuery(luceneQuery);
    }


}
