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

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.nio.file.Paths;

/**
 * User: Bill Bejeck
 * Date: 3/25/15
 * Time: 10:08 PM
 */
public abstract class LuceneSqlFileSystemSearchBase extends LuceneSqlSearchBase {

    protected Directory fsDirectory;


    public void init(String path) throws Exception {
         fsDirectory = FSDirectory.open(Paths.get(path));
         iwriter = new IndexWriter(fsDirectory, config);

    }

    @Override
    public void openSearcher() throws Exception {
        ireader = DirectoryReader.open(fsDirectory);
        isearcher = new IndexSearcher(ireader);
    }
}
