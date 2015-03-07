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
import com.google.common.base.Splitter;
import com.google.common.base.Suppliers;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.ScoreDoc;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: Bill Bejeck
 * Date: 1/20/15
 * Time: 9:48 PM
 */
public class LuceneQuerySearchTest extends LuceneSqlSearchBase {

    private Function<String, List<String>> splitDelimited = line -> Splitter.on(",").splitToList(line);
    private Function<FieldType, Function<String, Field>> toFieldFunction = ft -> s -> new Field(s, "", ft);
    private com.google.common.base.Supplier<Document> documentSupplier = Suppliers.memoize(Document::new);

    private Supplier<FieldType> fieldTypeSupplier = () -> {
        FieldType fieldType = new FieldType();
        fieldType.setStored(true);
        fieldType.setIndexOptions(IndexOptions.DOCS_AND_FREQS);
        return fieldType;
    };

    private Function<List<Field>,Function<List<String>,Document>> toFieldsToDocument = fields -> values -> {
        Document doc = documentSupplier.get();
        int indx = 0;
        for (Field column : fields) {
             column.setStringValue(values.get(indx++));
             doc.add(column);
        }
        return doc;
    };

    private Function<String, Field> toField = toFieldFunction.apply(fieldTypeSupplier.get());

    public LuceneQuerySearchTest() throws Exception {
        setUpAll();
    }

    private void setUpAll() throws Exception {
        init();
        index_values_from_file("src/test/small_values.csv");
        doneAdding();
        openSearcher();
    }

    @Test
    public void test_search_boolean_and_terms() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='beth' and last_name='bejeck'";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(1));
    }

    @Test
    public void test_search_between() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and age between '30' and '40'";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(3));
    }

    @Test
    public void test_search_in_list() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city in ('Portsmith', 'Rockville')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(3));
    }

    @Test
    public void test_search_in_listII() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city in ('Portsmith', 'Rockville','Cleveland')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(4));
    }

    @Test
    public void test_search_not_in_list_nested_boolean() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and not (city in ('Portsmith', 'Rockville','Cleveland'))";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(2));
    }

    @Test
    public void test_search_not_in_list() throws Exception {
        String query = "Select name,address from /path/to/index/ where first_name='john' and city not in ('Portsmith', 'Rockville','Cleveland')";
        BooleanQuery booleanQuery = AntlrLuceneFunctions.doParseLuceneQuery(query).booleanQuery;
        System.out.println(booleanQuery);
        ScoreDoc[] scoreDocs = search(booleanQuery, 10);
        assertThat(scoreDocs.length, is(2));
    }
    private void index_values_from_file(String path) throws Exception {
        Path fakeNames = Paths.get(path);
        List<String> lines = Files.readAllLines(fakeNames);
        List<Field> columnFields = splitDelimited.apply(lines.get(0)).stream().map(toField).collect(Collectors.toList());
        lines.stream().skip(1).map(splitDelimited).map(toFieldsToDocument.apply(columnFields)).forEach(this::addDocumentToIndex);
    }






}
