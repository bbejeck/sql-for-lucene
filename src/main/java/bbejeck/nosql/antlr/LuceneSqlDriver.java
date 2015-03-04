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

package bbejeck.nosql.antlr;

import bbejeck.nosql.antlr.generated.LuceneSqlLexer;
import bbejeck.nosql.antlr.generated.LuceneSqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * User: Bill Bejeck
 * Date: 6/2/14
 * Time: 9:50 PM
 */
public class LuceneSqlDriver {

    public static void main(String[] args) {
        String luceneQuery = "Select firstName, lastName from /foo/bar/index/ where name='Beth' and num_children <= 3" +
                " and not (workout='no lifting' and (uptight='ye?' or superficial='yes') ) ";
//        String luceneQuery = "describe /foo/bar/index";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(luceneQuery);
        LuceneSqlLexer lexer = new LuceneSqlLexer(antlrInputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LuceneSqlParser parser = new LuceneSqlParser(tokenStream);
        ParseTree tree = parser.query();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PrintingLuceneListener(),tree);

    }
}
