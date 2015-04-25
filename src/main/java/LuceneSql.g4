grammar LuceneSql;

query :  select_stmt? from_stmt? where_stmt limit_stmt?
      ;

select_stmt : SELECT (SPLAT | (FIELD (COMMA FIELD)*));

from_stmt : FROM PATH
          ;

where_stmt : WHERE search_condition+
           ;

limit_stmt : LIMIT NUMBER
           ;

search_condition : predicate (predicate | nested_predicate) *
                 ;

predicate : boolean_op? (comparison_predicate | function_predicate)
          ;

comparison_predicate : field (comparison_op value | range_op )
                     ;

function_predicate : regexp | between | like | in
                   ;

field : FIELD
      ;

comparison_op        :  EQ       # Equals
                     |  NE       # NotEqual
                     ;

range_op     : greater_than
             | greater_than_equals
             | less_than
             | less_than_equals
             ;


greater_than   :   GT NUMBER    #greaterThanNumber
               |   GT TERM      #greaterThanTerm
               |   GT DATE      #greaterThanDate
               ;

greater_than_equals : GTE NUMBER   #greaterThanEqNumber
                    | GTE TERM     #greaterThanEqTerm
                    | GTE DATE     #greaterThanEqDate
                    ;

less_than : LT NUMBER    #lessThanNumber
          | LT TERM      #lessThanTerm
          | LT DATE      #lessThanDate
          ;

less_than_equals : LTE NUMBER    #lessThanEqNumber
                 | LTE TERM      #lessThanEqTerm
                 | LTE DATE      #lessThanEqDate
                 ;


boolean_op         :  AND         # And
                   |  OR          # Or
                   |  NOT         # Not
                   |  AND NOT     # AndNot
                   |  OR NOT      # OrNot
                   ;

nested_predicate : boolean_op? RPAREN predicate (predicate | nested_predicate)* LPAREN
                 ;


value      : NUMBER               # Number
           | TERM                 # Term
           | PHRASE               # Phrase
           | DATE                 # Date
           | MULTI_PHRASE         # MULTI_PHRASE
           ;

regexp  : field MATCHES RPAREN WILD_CARD LPAREN
        ;

between : between_number | between_term
        ;

between_term : field BETWEEN TERM AND TERM
             ;

between_number : field BETWEEN NUMBER AND NUMBER
               ;

like : field LIKE WILD_CARD
     ;

in : field NOT? IN value_list
   ;

value_list : RPAREN (number_list | date_list | term_list | phrase_list ) LPAREN
           ;

number_list : NUMBER (COMMA NUMBER)*
            ;

date_list : DATE (COMMA DATE)*
          ;

term_list : TERM (COMMA TERM)*
          ;

phrase_list : (TERM | PHRASE) ( COMMA (TERM | PHRASE) ) *
               ;
//Parser Rules End

//Lexer Rules Start
SELECT : [Ss][Ee][Ll][Ee][Cc][Tt] ;
FROM : [Ff][Rr][Oo][Mm] ;
WHERE : [Ww][Hh][Ee][Rr][Ee] ;
AND : [Aa][Nn][Dd] ;
OR : [Oo][Rr] ;
NOT : [Nn][Oo][Tt] ;
DESCRIBE : [Dd][Ee][Ss][Cc][Rr][Ii][Bb][Ee] ;
MATCHES : [Mm][Aa][Tt][Cc][Hh][Ee][Ss] ;
BETWEEN : [Bb][Ee][Tt][Ww][Ee][Ee][Nn] ;
LIKE : [Ll][Ii][Kk][Ee] ;
LIMIT : [Ll][Ii][Mm][Ii][Tt] ;
EQ : '=' ;
NE : '!=';
GT : '>' ;
LT : '<' ;
GTE : '>=' ;
LTE : '<=' ;
IN : [Ii][Nn];
SPLAT : '*';
fragment
DIGIT : [0-9] ;
NUMBER : DIGIT(DIGIT*) ;
fragment
DATE_SEP : [-/] ;
DATE : (NUMBER+(DATE_SEP)?)+;
FIELD : [A-Za-z]+((':'|'_')[0-9]*[A-Za-z]*)* ;
PATH : '\''([A-Za-z]':')?('/')?((~[/])+'/')+ '\'';
TERM : '\''(~[' *?])*'\'' ;
PHRASE : '\''(~['*?])*'\'' ;
WILD_CARD :'\''(~[' ])*'\'' ;
MULTI_PHRASE : '\''(~[' *?])+(~['])+'\'';
DB_QUOTE_STRING_LIT : ('"'(~["])*'"');
//STRING_LIT : ('\''(~['])*'\'') ;

COMMA : ',' ;
RPAREN : '(' ;
LPAREN : ')' ;
WS : [ \t\r\n]+ -> skip;



