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
import bbejeck.nosql.util.ThrowingFunction;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.IntField;
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
    private static final int DEFAULT_LIMIT = 100;

    private ThrowingFunction<String, Path> createPath = s -> Paths.get(s);
    private ThrowingFunction<Path, Directory> createDirectory = FSDirectory::open;
    private ThrowingFunction<Directory, DirectoryReader> createDirectoryReader = DirectoryReader::open;
    private ThrowingFunction<DirectoryReader, IndexSearcher> openIndexSearcher = IndexSearcher::new;
    private ThrowingFunction<Directory, IndexSearcher> fromDirectoryToIndexSearcher = createDirectoryReader.andThen(openIndexSearcher);
    private ThrowingFunction<String, IndexSearcher> createIndexSearcher = createPath.andThen(createDirectory).andThen(createDirectoryReader).andThen(openIndexSearcher);

    private Function<Set<String>, Function<IndexSearcher, ThrowingFunction<ScoreDoc, Document>>> getSearchDocsWithFields = fields -> searcher -> scoreDoc -> searcher.doc(scoreDoc.doc, fields);
    private Function<IndexSearcher, ThrowingFunction<ScoreDoc, Document>> getSearchDocsNoFields = searcher -> scoreDoc -> searcher.doc(scoreDoc.doc);


    private Function<List<IndexableField>, Map<String, Object>> toMapFromIndexList = list -> {
        Map<String, Object> valuesMap = new HashMap<>();
        list.forEach(field -> {
            Object value = (field instanceof IntField) ? field.numericValue() : field.stringValue();
            valuesMap.put(field.name(), value);
        });
        return valuesMap;
    };


    public Searcher() {
    }

    public Searcher(Directory directory) {
        this.indexSearcher = fromDirectoryToIndexSearcher.apply(directory);
    }

    public List<Map<String, Object>> search(String query) throws IOException {

        QueryParseResults parseResults = AntlrLuceneFunctions.parseQuery(query);

        if (indexSearcher == null) {
            indexSearcher = createIndexSearcher.apply(parseResults.getIndexPath());
        }

        int maxResults = parseResults.getLimit() == 0 ? DEFAULT_LIMIT : parseResults.getLimit();

        TopDocs topDocs = indexSearcher.search(parseResults.getBooleanQuery(), maxResults);
        Set<String> fields = parseResults.getSelectFields();
        ThrowingFunction<ScoreDoc, Document> getDocument;

        if (fields.isEmpty()) {
            getDocument = getSearchDocsNoFields.apply(indexSearcher);
        } else {
            getDocument = getSearchDocsWithFields.apply(fields).apply(indexSearcher);

        }


        return Stream.of(topDocs.scoreDocs).map(getDocument)
                .map(Document::getFields)
                .map(toMapFromIndexList)
                .collect(Collectors.toList());

    }


}
