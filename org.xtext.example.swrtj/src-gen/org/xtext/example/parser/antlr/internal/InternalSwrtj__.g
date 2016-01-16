lexer grammar InternalSwrtj;
@header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'interface' ;
T13 : 'extends' ;
T14 : ',' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'record' ;
T18 : 'is' ;
T19 : 'trait' ;
T20 : 'class' ;
T21 : 'implements' ;
T22 : 'by' ;
T23 : 'and' ;
T24 : 'program' ;
T25 : '+' ;
T26 : '[' ;
T27 : ']' ;
T28 : '(' ;
T29 : ')' ;
T30 : 'exclude' ;
T31 : 'renameTo' ;
T32 : 'renameF' ;
T33 : 'aliasAs' ;
T34 : 'renameM' ;
T35 : 'renameFieldTo' ;
T36 : 'transient' ;
T37 : 'volatile' ;
T38 : ';' ;
T39 : 'synchronized' ;
T40 : 'return' ;
T41 : 'byte' ;
T42 : 'char' ;
T43 : 'boolean' ;
T44 : 'short' ;
T45 : 'int' ;
T46 : 'long' ;
T47 : 'float' ;
T48 : 'double' ;
T49 : 'void' ;
T50 : 'if' ;
T51 : 'else' ;
T52 : 'while' ;
T53 : '&' ;
T54 : '&&' ;
T55 : '|' ;
T56 : '||' ;
T57 : '^' ;
T58 : '!' ;
T59 : '<' ;
T60 : '<=' ;
T61 : '==' ;
T62 : '!=' ;
T63 : '>' ;
T64 : '>=' ;
T65 : '=' ;
T66 : '-' ;
T67 : '*' ;
T68 : '/' ;
T69 : '%' ;
T70 : '.' ;
T71 : 'null' ;
T72 : 'in' ;
T73 : 'args' ;
T74 : 'out' ;
T75 : 'true' ;
T76 : 'false' ;
T77 : 'this' ;
T78 : 'new' ;

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6809
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6811
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6813
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6815
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6817
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6819
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.swrtj/src-gen/org/xtext/example/parser/antlr/internal/InternalSwrtj.g" 6821
RULE_ANY_OTHER : .;


