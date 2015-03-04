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

import bbejeck.nosql.antlr.generated.LuceneSqlBaseVisitor;
import bbejeck.nosql.antlr.generated.LuceneSqlParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 9:58 PM
 */
public class LuceneQueryVisitor extends LuceneSqlBaseVisitor<LuceneQueryAssembler> {

    @Override
    public LuceneQueryAssembler visitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx) {
        return super.visitFrom_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitWhere_stmt(@NotNull LuceneSqlParser.Where_stmtContext ctx) {
        return super.visitWhere_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx) {
        return super.visitSelect_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitDescribe_stmt(@NotNull LuceneSqlParser.Describe_stmtContext ctx) {
        return super.visitDescribe_stmt(ctx);
    }

    @Override
    public LuceneQueryAssembler visitQuery(@NotNull LuceneSqlParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }


}
