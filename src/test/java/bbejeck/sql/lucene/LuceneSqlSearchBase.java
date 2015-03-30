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

package bbejeck.sql.lucene;

import com.google.common.base.Splitter;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.document.IntField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.Filter;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * User: Bill Bejeck
 * Date: 10/13/14
 * Time: 11:11 PM
 */
public abstract class LuceneSqlSearchBase {

    protected Analyzer analyzer = new StandardAnalyzer();
    protected Directory ramDirectory = new RAMDirectory();
    protected IndexWriterConfig config = new IndexWriterConfig(analyzer);
    protected IndexWriter iwriter;
    protected DirectoryReader ireader;
    protected IndexSearcher isearcher;

    private Function<String, List<String>> splitDelimited = line -> Splitter.on(",").splitToList(line);
    private Function<FieldType, Function<String, Field>> toFieldFunction = ft -> s -> new Field(s, "", ft);
    private com.google.common.base.Supplier<Document> documentSupplier = Document::new;

    private Supplier<FieldType> fieldTypeSupplier = () -> {
        FieldType fieldType = new FieldType();
        fieldType.setStored(true);
        fieldType.setIndexOptions(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS);
        return fieldType;
    };

    private Function<List<Field>,Function<List<String>,Document>> toFieldsToDocument = fields -> values -> {
        Document doc = documentSupplier.get();
        int indx = 0;
        for (Field column : fields) {
            String val = values.get(indx++);
            if(val.matches("\\d+")){
                 int num = Integer.parseInt(val);
                 IntField numberColumn  = new IntField(column.name()+"N",num, Field.Store.YES);
                 doc.add(numberColumn);
            }
            column.setStringValue(val);
            doc.add(column);
        }
        return doc;
    };

    private Function<String, Field> toField = toFieldFunction.apply(fieldTypeSupplier.get());



    public ScoreDoc[] search(Query query, int limit) throws Exception {
          if(ireader == null){
              openSearcher();
          }

        return isearcher.search(query,limit).scoreDocs;
    }

    public ScoreDoc[] search(Query query,Filter filter, int limit) throws Exception {
        if(ireader == null){
            openSearcher();
        }

        return isearcher.search(query,limit).scoreDocs;
    }

    public void init() throws Exception {
        iwriter = new IndexWriter(ramDirectory, config);
    }

    public void openSearcher() throws Exception {
        ireader = DirectoryReader.open(ramDirectory);
        isearcher = new IndexSearcher(ireader);
    }

    public void addDocumentToIndex(Document doc)  {
        try {
            iwriter.addDocument(doc);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void doneAdding() throws Exception {
        iwriter.close();
    }

    protected void index_values_from_file(String path) throws Exception {
        Path fakeNames = Paths.get(path);
        List<String> lines = Files.readAllLines(fakeNames);
        List<Field> columnFields = splitDelimited.apply(lines.get(0)).stream().map(toField).collect(Collectors.toList());
        lines.stream().skip(1).map(splitDelimited).map(toFieldsToDocument.apply(columnFields)).forEach(this::addDocumentToIndex);
    }
}
