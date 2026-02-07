## Sql for Lucene ##

Originally a side project, I've decided to put this out there in case someone else
may find this useful.

### Project Dependencies

This project has been updated to use modern versions of its dependencies:

* **Java**: Java 21
* **Apache Lucene**: 10.3.2 (latest)
* **ANTLR**: 4.13.2 (latest)
* **JUnit**: 5 (Jupiter 6.0.1)
* **Gradle**: 9.1.0 as the build tool

Build the project with: `./gradlew build`

### Introduction
The `LuceneSqlParser` supports a subset of standard sql.  Here are some examples:

```
Select last_name from '/path/to/index/' where first_name='Foo' and age <=30 and city='Boston' limit 25

Select * from 'path/index/' where age in (31, 30, 50)

Select first_name, last_name from '/path/index/' where city in ('Cincinatti', 'New York', 'Boyds')

Select first_name from '/path/index/' where age between 35 and 50 and first_name like 'Br*'
-- Also takes paths from Windows OS
Select first_name from 'C:/path/index/' where first_name='John' and (age<=45 and city not in ('New York', 'Boston', 'Atlanta'))
```

The `LuceneSqlParser` returns a [BooleanQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/BooleanQuery.html). The `BooleanQuery` will contain different types of lucene query objects depending on the predicates used. There is a class `Searcher` available for use with the `LuceneSqlParser`.  The `Searcher` abstracts away the opening of a lucene [IndexSearcher](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/IndexSearcher.html), iterating over the [ScoreDoc](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/ScoreDoc.html) array and extracting results.    Next, we'll take a look at the rules used to parse the sql.

### LuceneSqlParser Functionality 
At high level a sql statement is broken down and parsed in the following manner:

1.  The 'Select' statement contains a comma sparated list of fields stored in a Lucene index.  The parser stores fields in a `Set<String>` for use by the `Searcher`. To retreive all fields we can specify a '*' operator, or omit the 'select' clause altogether.
2.  The 'From' clause takes a path in single quotes representing the location of a lucene index.
3.  The 'Where' clause contains the predicates for searching the data.
4. The parser analyzes values used for searching in a similar fashion as the [StandardAnalyzer](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/analysis/standard/StandardAnalyzer.html) (lower cased, whitespace and special characters removed).  There are exceptions to this rule.  The [PrefixQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/PrefixQuery.html), [RegexQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/RegexpQuery.html) and the [WildcardQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/WildcardQuery.html) are special cases and only removes characters not defined as special characters used by Lucene.
5. Predicates can be nested to an arbitrary depth. For example:  `where field='1' and (field2='2' and field3='3' and (field4='4' and (field5='5' and field='6')))`
6. The 'Select' and 'From' clauses are optional.

The `LuceneQueryParser` defines two static methods `toParse` and `toParseBooleanQuery`.  The `toParse` method is intended to be used in conjuction with the `Searcher`.  The `toParse` returns a `QueryParseResults` object that contains the path for the index, the set of fields to retrieve and the `BooleanQuery` to execute.  The `toParseBooleanQuery` is intended to be used for parsing only and returns a `BooleanQuery`.

### SQL to Lucene Query Functionality Mapping
We now will list the supported Lucene query objects and how they are mapped from the input sql.

*  `<field name> ='Foo'` converts to a [TermQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/TermQuery.html).
*  `<field name> ='Bar Baz'` converts to a [PhraseQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/PhraseQuery.html)
*  `<field name> like 'Fo*'` converts to a `PrefixQuery`
*  `<field name> like 'B?l?'` converts to a `WildcardQuery`
*  `<field name> matches('[Bb].*[hH]?')` converts to a `RegexpQuery`
*  `<field name> in ('foo', 'bar', 'baz')` converts to a `BooleanQuery` consisting of 3 [BooleanClause](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/BooleanClause.html) objects. Each clause is a `TermQuery` with a [BooleanClause.Occur](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/BooleanClause.Occur.html) of `SHOULD`.
*  `PhraseQuery` and `TermQuery` objects can be combined in the 'in' operator.  For example `city in ('New York', 'Boston', 'Los Angeles')`
*  `between 'Foo' AND 'Bar'` converts to a [TermRangeQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/TermRangeQuery.html) with both items being inclusive.
*  `between 25 and 40` converts to an [IntPoint range query](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/document/IntPoint.html#newRangeQuery(java.lang.String,int,int)) which is inclusive.
*  The >, <, >= <= operators are converted to either `TermRangeQuery` or `IntPoint` range query objects with one side of the range being unbounded.  The < and > operators are exclusive for terms. The <= and >= operators are inclusive for terms.

The AND,OR & NOT operators are mappped in the following manner.

*  AND converts to `BooleanClause.Occur.MUST`
*  OR  converts to `BooleanClause.Occur.SHOULD` 
*  NOT converts to `BooleanClause.Occur.MUST_NOT`

### Optimizations
In two cases the query is converted to something different from the mappings shown previously.  The first case is a query that contains a single predicate that *must not* match.  For example:

```
Select * from /index/path/ where last_name != 'Smith'
Select first_name, last_name where city not in ('Foo', 'Bar')
```
A query submitted in this format will not work in lucene.  This fix for this query is simple.  The parser takes the original `BooleanQuery` and adds an additional clause.  The underlying query object in the new clause is a [MatchAllDocsQuery](https://lucene.apache.org/core/10_3_2/core/org/apache/lucene/search/MatchAllDocsQuery.html).  The `MatchAllDocsQuery` returns all documents in the index and the original predicate will filter out the unwanted results.  The second case is when searching for a numeric field in the `TermQuery` format.  For example:

```
Select * from '/index/path' where age = 49
```

Normally a 'field=value' or 'field != value' predicate is converted to a `TermQuery`. But the way lucene searches for values it will not find a field if it is searching for a number versus a string.  In this case the parser constructs an `IntPoint` range query where the low and high value are equal.

### Limitations
There are a several limitations at this point.

*   Converting to a `PhraseQuery` does not allow for specifying any slop.  For a match with a `PhraseQuery` all terms must be located adjacent to each other.
*   Numeric type queries only support the Int type for now.
*   Range querries are inclusive when both a high and low value are specified.
*   If no limit clause is specified in the query, a default limit of 10,000 records is used.

### Searcher  

The second component of sql for lucene is the `Searcher`class.  The `Searcher` could be thought of as a convenience method for performing a lucene search and extracting the results.  The `Searcher` has one method `search` that takes a sql query and returns a `List<Map<String,Object>>` containing the search results.  Each map in the list represents a document with the keys being the field names and the values are the values stored in the retrieved fields.  

```
String query = "Select age,city from '/path/to/index/' where first_name='john' and age='50'";
List<Map<String,Object>> results = searcher.search(query);
```
It's worth noting the list and map returned from the searcher are of type [ImmutableList](http://docs.guava-libraries.googlecode.com/git-history/release/javadoc/com/google/common/collect/ImmutableList.html) and [ImmutableMap](http://docs.guava-libraries.googlecode.com/git-history/release/javadoc/com/google/common/collect/ImmutableMap.html) respectively. The `Searcher` has 4 constructors:

```

    public Searcher() {}

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

```
If the searcher is instantiated with the no-arg constructor, then the path for the index will be extracted from the query and used to open the `IndexSearcher`.  All subsequent queries can safely omit the from clause.  If the searcher is instantiated with any of the other 3 constructors, the 'from' clause will be ignored and can be omitted from the query.

### Features To Be Added

*   A JDBC Driver.
*   Insert, Update and Delete support.
*   Support all the numeric types supported by Lucene.
*   Syntax to support `FuzzyQuery` searches.
*   Support for filters.
*   Ability to specify *slop* for `PhraseQuery` searches.
