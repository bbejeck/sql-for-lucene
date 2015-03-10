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
import com.google.common.collect.Sets;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.ScoreDoc;
import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: Bill Bejeck
 * Date: 1/20/15
 * Time: 9:48 PM
 */
public class LuceneQuerySearchTest extends LuceneSqlSearchBase {


    public LuceneQuerySearchTest() throws Exception {
        init();
        index_values_from_file("src/test/small_values.csv");
        doneAdding();
        openSearcher();
    }

    @Test
    public void test_search_boolean_and_terms() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='beth' and last_name='bejeck'";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(1));
    }

    @Test
    public void test_search_between() throws Exception {
        String query = "Select first_name,last_name,address from /path/to/index/ where first_name='john' and age between '30' and '40'";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(3));
    }

    @Test
    public void test_search_in_list() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city in ('Portsmith', 'Rockville')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(3));
    }

    @Test
    public void test_search_in_listII() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city in ('Portsmith', 'Rockville','Cleveland')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(4));
    }

    @Test
    public void test_search_not_in_list_nested_boolean() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and not (city in ('Portsmith', 'Rockville','Cleveland'))";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(2));
    }

    @Test
    public void test_search_not_in_list() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city not in ('Portsmith', 'Rockville','Cleveland')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.parseQuery(query).getBooleanQuery();
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(2));
        Set<String> fields = Sets.newHashSet("first_name","last_name","age");
        System.out.println(isearcher.doc(scoreDocs[0].doc,fields).getFields());
    }







}
