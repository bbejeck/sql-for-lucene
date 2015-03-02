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

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

/**
 * User: Bill Bejeck
 * Date: 10/13/14
 * Time: 11:11 PM
 */
public abstract class LuceneSqlSearchBase {

    protected Analyzer analyzer = new StandardAnalyzer();
    protected Directory directory = new RAMDirectory();
    protected IndexWriterConfig config = new IndexWriterConfig(analyzer);
    protected IndexWriter iwriter;
    protected DirectoryReader ireader;
    protected IndexSearcher isearcher;


    public ScoreDoc[] search(Query query, int limit) throws Exception {
          if(ireader == null){
              openSearcher();
          }

        return isearcher.search(query,limit).scoreDocs;
    }

    public void init() throws Exception {
        iwriter = new IndexWriter(directory, config);
    }

    public void openSearcher() throws Exception {
        ireader = DirectoryReader.open(directory);
        isearcher = new IndexSearcher(ireader);
    }

    public void add(Document doc) throws Exception {
        iwriter.addDocument(doc);
    }

    public void doneAdding() throws Exception {
        iwriter.close();
    }
}
