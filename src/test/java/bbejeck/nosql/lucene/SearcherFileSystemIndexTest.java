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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: Bill Bejeck
 * Date: 3/25/15
 * Time: 10:16 PM
 */
public class SearcherFileSystemIndexTest extends LuceneSqlFileSystemSearchBase {

    private String indexPath = "src/test/testindex";

    @Before
    public void setup() throws Exception {
        init(indexPath);
        index_values_from_file("src/test/small_values.csv");
        doneAdding();
    }

    @After
    public void teardown() throws Exception {
        File file = new File(indexPath);
        Stream.of(file.listFiles()).forEach(File::delete);
    }


    @Test
    public void test_search_opening_index_from_query() throws Exception {
        Searcher searcher = new Searcher();
        String query = "Select ageN,city from '"+indexPath+"/' where first_name='john' and ageN=50";
        List<Map<String,Object>> results = searcher.search(query);
        assertThat(results.size(), is(1));
        Map<String,Object> resultMap = results.get(0);
        assertThat(resultMap.keySet().size(), is(2));
        assertThat(resultMap.get("ageN"),is(50));
        assertThat(resultMap.get("city"), is("Portsmith"));
    }

    @Test
    public void test_search_opening_path_provided() throws Exception {
        Searcher searcher = new Searcher(indexPath);
        String query = "Select ageN,city where first_name='john' and ageN=50";
        List<Map<String,Object>> results = searcher.search(query);
        assertThat(results.size(), is(1));
        Map<String,Object> resultMap = results.get(0);
        assertThat(resultMap.keySet().size(), is(2));
        assertThat(resultMap.get("ageN"),is(50));
        assertThat(resultMap.get("city"), is("Portsmith"));
    }

    @Test
    public void test_search_opening_path_object_provided() throws Exception {
        Searcher searcher = new Searcher(Paths.get(indexPath));
        String query = "Select ageN,city where first_name='john' and ageN=50";
        List<Map<String,Object>> results = searcher.search(query);
        assertThat(results.size(), is(1));
        Map<String,Object> resultMap = results.get(0);
        assertThat(resultMap.keySet().size(), is(2));
        assertThat(resultMap.get("ageN"),is(50));
        assertThat(resultMap.get("city"), is("Portsmith"));
    }

}
