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

import bbejeck.nosql.antlr.LuceneQueryParser;
import bbejeck.nosql.util.ThrowingFunction;
import com.google.common.base.Preconditions;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: Bill Bejeck
 * Date: 3/8/15
 * Time: 12:15 PM
 */
public class Searcher {

    private IndexSearcher indexSearcher;
    private static final int DEFAULT_LIMIT = 10000;

    private ThrowingFunction<String, Path> createPath = Paths::get;
    private ThrowingFunction<Path, Directory> createDirectory = FSDirectory::open;
    private ThrowingFunction<Directory, DirectoryReader> createDirectoryReader = DirectoryReader::open;
    private ThrowingFunction<DirectoryReader, IndexSearcher> openIndexSearcher = IndexSearcher::new;
    private ThrowingFunction<Directory, IndexSearcher> fromDirectoryToIndexSearcher = createDirectoryReader.andThen(openIndexSearcher);
    private ThrowingFunction<String, IndexSearcher> createIndexSearcherFromStringPath = createPath.andThen(createDirectory).andThen(createDirectoryReader).andThen(openIndexSearcher);
    private ThrowingFunction<Path, IndexSearcher> createIndexSearcherFromPath = createDirectory.andThen(createDirectoryReader).andThen(openIndexSearcher);

    private Function<Set<String>, Function<IndexSearcher, ThrowingFunction<ScoreDoc, Document>>> getSearchDocsWithSelectedFields = fields -> searcher -> scoreDoc -> searcher.doc(scoreDoc.doc, fields);
    private Function<IndexSearcher, ThrowingFunction<ScoreDoc, Document>> getSearchDocsWithAllFields = searcher -> scoreDoc -> searcher.doc(scoreDoc.doc);


    private Function<List<IndexableField>, Map<String, Object>> loadFieldIntoHashMap = list -> {
        Map<String, Object> valuesMap = new HashMap<>();
        list.forEach(field -> {
            Object value = (field.numericValue()!=null) ? field.numericValue() : field.stringValue();
            valuesMap.put(field.name(), value);
        });
        return valuesMap;
    };


    public Searcher() {
    }

    public Searcher(String indexPath){
        Preconditions.checkArgument(indexPath != null && !indexPath.trim().isEmpty(), "Index Path is can't be null or empty");
        this.indexSearcher = createIndexSearcherFromStringPath.apply(indexPath);
    }

    public Searcher(Path indexPath){
        Preconditions.checkNotNull(indexPath,"Index Path can't be null");
        this.indexSearcher = createIndexSearcherFromPath.apply(indexPath);
    }

    public Searcher(Directory directory) {
        Preconditions.checkNotNull(directory,"Directory can't be null");
        this.indexSearcher = fromDirectoryToIndexSearcher.apply(directory);
    }

    public List<Map<String, Object>> search(String query) throws IOException {

        QueryParseResults parseResults = LuceneQueryParser.parseQuery(query);

        if (indexSearcher == null) {
            indexSearcher = createIndexSearcherFromStringPath.apply(parseResults.getIndexPath());
        }

        int maxResults = parseResults.getLimit() == 0 ? DEFAULT_LIMIT : parseResults.getLimit();

        TopDocs topDocs = indexSearcher.search(parseResults.getBooleanQuery(), maxResults);
        Set<String> fields = parseResults.getSelectFields();
        ThrowingFunction<ScoreDoc, Document> retrieveDocFunction;

        if (fields.isEmpty()) {
            retrieveDocFunction = getSearchDocsWithAllFields.apply(indexSearcher);
        } else {
            retrieveDocFunction = getSearchDocsWithSelectedFields.apply(fields).apply(indexSearcher);

        }


        return Stream.of(topDocs.scoreDocs).map(retrieveDocFunction)
                                           .map(Document::getFields)
                                           .map(loadFieldIntoHashMap)
                                           .collect(Collectors.toList());

    }


}
