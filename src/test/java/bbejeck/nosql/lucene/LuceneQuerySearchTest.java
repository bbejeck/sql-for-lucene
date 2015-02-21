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

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.ScoreDoc;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * User: Bill Bejeck
 * Date: 1/20/15
 * Time: 9:48 PM
 */
public class LuceneQuerySearchTest extends LuceneSqlSearchBase {

    private AntlrFunctionsStub antlr = new AntlrFunctionsStub();

    public LuceneQuerySearchTest() throws Exception {
        setUpAll();
    }

    public  void setUpAll() throws Exception {
        init();
        Document doc = new Document();
        FieldType fieldType = new FieldType();
        fieldType.setIndexed(true);
        fieldType.setStored(true);
        doc.add(new Field("first_name", "Beth", fieldType));
        doc.add(new Field("last_name","Bejeck",fieldType));
        doc.add(new Field("type","Big",fieldType));
        doc.add(new Field("type","Cutie",fieldType));
        add(doc);

        doc = new Document();

        doc.add(new Field("first_name", "Beth", fieldType));
        doc.add(new Field("last_name","Niemic",fieldType));
        doc.add(new Field("type","Single",fieldType));
        doc.add(new Field("type","Cutie",fieldType));
        add(doc);
        doneAdding();

        openSearcher();
    }

    @Test
    public void test_search_boolean_and_terms() throws Exception{
        String query = "Select name,address from /path/to/index/ where first_name='beth' and last_name='bejeck'";
        BooleanQuery booleanQuery = antlr.doParseLuceneQuery(query).booleanQuery;
        ScoreDoc[] scoreDocs = search(booleanQuery,10);
        assertThat(scoreDocs.length, is(1));
    }


}
