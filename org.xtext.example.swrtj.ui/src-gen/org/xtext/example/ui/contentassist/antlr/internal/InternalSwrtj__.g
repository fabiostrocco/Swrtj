lexer grammar InternalSwrtj;
@header {
package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '+' ;
T12 : '-' ;
T13 : '*' ;
T14 : '/' ;
T15 : '%' ;
T16 : 'import' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'extends' ;
T20 : ',' ;
T21 : 'is' ;
T22 : 'implements' ;
T23 : 'by' ;
T24 : 'and' ;
T25 : '[' ;
T26 : ']' ;
T27 : '(' ;
T28 : ')' ;
T29 : 'exclude' ;
T30 : 'renameTo' ;
T31 : 'renameF' ;
T32 : 'aliasAs' ;
T33 : 'renameM' ;
T34 : 'renameFieldTo' ;
T35 : ';' ;
T36 : 'return' ;
T37 : 'if' ;
T38 : 'else' ;
T39 : 'while' ;
T40 : '=' ;
T41 : '.' ;
T42 : 'new' ;
T43 : 'interface' ;
T44 : 'record' ;
T45 : 'trait' ;
T46 : 'class' ;
T47 : 'program' ;
T48 : 'transient' ;
T49 : 'volatile' ;
T50 : 'synchronized' ;
T51 : 'byte' ;
T52 : 'char' ;
T53 : 'boolean' ;
T54 : 'short' ;
T55 : 'int' ;
T56 : 'long' ;
T57 : 'float' ;
T58 : 'double' ;
T59 : 'void' ;
T60 : '&' ;
T61 : '&&' ;
T62 : '|' ;
T63 : '||' ;
T64 : '^' ;
T65 : '!' ;
T66 : '<' ;
T67 : '<=' ;
T68 : '==' ;
T69 : '!=' ;
T70 : '>' ;
T71 : '>=' ;
T72 : 'null' ;
T73 : 'in' ;
T74 : 'args' ;
T75 : 'out' ;
T76 : 'true' ;
T77 : 'false' ;
T78 : 'this' ;

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14947
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14949
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14951
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14953
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14955
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14957
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.swrtj.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSwrtj.g" 14959
RULE_ANY_OTHER : .;


