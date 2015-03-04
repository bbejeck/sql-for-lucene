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


import bbejeck.nosql.antlr.generated.LuceneSqlBaseListener;
import bbejeck.nosql.antlr.generated.LuceneSqlParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Bill Bejeck
 * Date: 6/2/14
 * Time: 10:20 PM
 */
public class PrintingLuceneListener extends LuceneSqlBaseListener {

    @Override
    public void exitDescribe_stmt(@NotNull LuceneSqlParser.Describe_stmtContext ctx) {
        System.out.println("Describe stmt "+ctx.getText());
    }

    @Override
    public void exitQuery(@NotNull LuceneSqlParser.QueryContext ctx) {
        System.out.println("Done parsing query "+ctx.getText());
    }

    @Override
    public void exitFrom_stmt(@NotNull LuceneSqlParser.From_stmtContext ctx) {
        System.out.println("Exiting from "+ctx.PATH().toString());
    }

    @Override
    public void enterAnd(@NotNull LuceneSqlParser.AndContext ctx) {
        System.out.println("enterAnd");
    }

    @Override
    public void exitAnd(@NotNull LuceneSqlParser.AndContext ctx) {
        System.out.println("exitAnd");
    }

    @Override
    public void enterOr(@NotNull LuceneSqlParser.OrContext ctx) {
        System.out.println("enterOr");
    }

    @Override
    public void exitPhrase(@NotNull LuceneSqlParser.PhraseContext ctx) {
        System.out.println("phrase "+ctx.getText());
    }

    @Override
    public void enterAndNot(@NotNull LuceneSqlParser.AndNotContext ctx) {
        System.out.println("enter and not");
    }


    @Override
    public void exitMULTI_PHRASE(@NotNull LuceneSqlParser.MULTI_PHRASEContext ctx) {
        System.out.println("multi-phrase "+ctx.getText());
    }

    @Override
    public void exitTerm(@NotNull LuceneSqlParser.TermContext ctx) {
        System.out.println("term "+ctx.TERM().getText());
    }

    @Override
    public void enterPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
        System.out.println("entered predicate");
    }

    @Override
    public void exitNumber(@NotNull LuceneSqlParser.NumberContext ctx) {
        System.out.println("exit number "+ctx.NUMBER());
    }

    @Override
    public void enterField(@NotNull LuceneSqlParser.FieldContext ctx) {
        System.out.println("entered field "+ctx.FIELD());
    }

    @Override
    public void enterNumber(@NotNull LuceneSqlParser.NumberContext ctx) {
        System.out.println("enter number "+ctx.NUMBER());
    }

    @Override
    public void exitPredicate(@NotNull LuceneSqlParser.PredicateContext ctx) {
        System.out.println("exiting predicate ");
    }

    @Override
    public void enterEquals(@NotNull LuceneSqlParser.EqualsContext ctx) {
        System.out.println("entered equals ");
    }

    @Override
    public void enterLessThanEquals(@NotNull LuceneSqlParser.LessThanEqualsContext ctx) {
        System.out.println("enter lessThanEquals");
    }


    @Override
    public void enterNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
        System.out.println("entering nested query %%%%%%%%%%%%");
    }
    @Override
    public void exitNested_predicate(@NotNull LuceneSqlParser.Nested_predicateContext ctx) {
        System.out.println("exiting nested query %%%%%%%%%%%% "+ctx.getText());
    }



    @Override
    public void exitSelect_stmt(@NotNull LuceneSqlParser.Select_stmtContext ctx) {
        System.out.println("exitSelect_stmt "+ctx.FIELD());
    }


//    @Override
//    public void exitAnd(@NotNull LuceneSqlParser.AndContext ctx) {
//        System.out.println("exitAnd "+ctx.getText());
//    }

//    @Override
//    public void exitEquals(@NotNull LuceneSqlParser.EqualsContext ctx) {
//        System.out.println("exitEquals "+ctx.getText());
//    }
//
//
    @Override
    public void exitLessThanEquals(@NotNull LuceneSqlParser.LessThanEqualsContext ctx) {
        System.out.println("exit lessThanEquals");
    }

}
