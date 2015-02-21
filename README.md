##NOSQL JDBC Driver

This project aims to provide a JDBC driver that can be used to run SQL against non-database data-stores.  The first of which will
be [Lucene](http://lucene.apache.org/).  As time goes on the ultimate goal is to support HBase, Cassandra, Accumulo etc.

The underlying technology used to translate from SQL to the native query language will be [ANTLR4](http://www.antlr.org/index.html).  Actually the purpose for starting this project
is to find a useful way to really learn/understand how to use [ANTLR4](http://www.antlr.org/index.html).

A standalone mode will also be provided for those that want to leverage SQL, but don't want to go through the JDBC
interface.