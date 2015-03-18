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

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SearcherTest extends LuceneSqlSearchBase {

    private Searcher searcher;

    public SearcherTest() throws Exception{
        init();
        index_values_from_file("src/test/small_values.csv");
        doneAdding();
        searcher = new Searcher(ramDirectory);
        openSearcher();
    }

    @Test
    public void test_search_single_map_in_list() throws Exception {
        String query = "Select age,city from /path/to/index/ where first_name='john' and age='50'";
        List<Map<String,Object>> results = searcher.search(query);
        assertThat(results.size(),is(1));
        Map<String,Object> resultMap = results.get(0);
        assertThat(resultMap.keySet().size(),is(2));
        assertThat(resultMap.get("age"),is("50"));
        assertThat(resultMap.get("city"),is("Portsmith"));
    }

    @Test
    public void test_search_single_map_no_fields_specified() throws Exception {
        String query = "Select * from /path/to/index/ where first_name='john' and age ='50'";
        List<Map<String,Object>> results = searcher.search(query);
        assertThat(results.size(),is(1));
        Map<String,Object> resultMap = results.get(0);
        assertThat(resultMap.keySet().size(),is(5));
        assertThat(resultMap.get("first_name"),is("John"));
        assertThat(resultMap.get("last_name"),is("Smith"));
        assertThat(resultMap.get("city"),is("Portsmith"));
        assertThat(resultMap.get("age"),is("50"));
        assertThat(resultMap.get("ageN"),is(50));
    }
}