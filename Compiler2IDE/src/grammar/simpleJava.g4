/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar simpleJava;

@header{
   import java.util.*;
}

@parser::members{
   Map<String, Float> memory = new HashMap<String, Float>();
}

prog: TCLASS ID SCOLON (declConst | declVars)* declFuncoes* principal
    ;

declConst: tipo ID EQUALS (expr|expr2|STR|BOOL) SCOLON
         ;

tipo: TINT
    | TFLOAT
    | TSTR
    | TBOOL
    ;

declVars: TVAR ID (COMMA ID)* COLON tipo SCOLON
        ;

declFuncoes: ID OB ((tipo ID) (COMMA tipo ID)*)? CB COLON tipo OCB (declConst | declVars)* comandos* CCB
           ;

declReturn: TRETURN OB (expr|expr2|chamadaFuncoes|STR|BOOL) CB
          ;

chamadaFuncoes: ID OB ((expr|expr2|STR|BOOL) (COMMA (expr|expr2|STR|BOOL))*)? CB
              ;

principal: TMAIN OB CB OCB comandos* CCB
         ;

comandos: atribuicao SCOLON
        | chamadaFuncoes SCOLON
        | declReturn SCOLON
        | print SCOLON
        | read SCOLON
        | cmdifelse
        | cmdfor
        | cmdwhile
        | expr SCOLON
        | expr2 SCOLON
        ;


cmdifelse: TIF OB expr2 CB OCB comandos* CCB (TELSE OCB comandos* CCB)?
      ;
          
cmdfor: TFOR OB ID EQUALS (expr|expr2) COLON (expr|expr2) (TSTEP (expr|expr2))? CB OCB (comandos|TEXIT)* CCB
   ;

cmdwhile: TWHILE OB expr2 CB OCB (comandos|TEXIT)* CCB
     ;

atribuicao: ID EQUALS (expr|expr2|STR|BOOL|chamadaFuncoes)
          ;

print: TPRINT OB (expr|expr2|STR|BOOL) (COMMA (expr|expr2|STR|BOOL) )* CB
     ;

read: TREAD OB ID (COMMA ID)* CB
    ;

expr: OB expr CB
    | expr (MUT|DIV) expr
    | expr (ADD|SUB) expr
    | INT
    | FLOAT
    | ID
    | chamadaFuncoes
    ;

expr2:  OB expr2 CB
    | expr BO expr
    | NOT expr2
    | BOOL
    | ID
    | chamadaFuncoes
    ;

TCLASS: 'class';
TVAR: 'var';
TMAIN: 'main';
TRETURN: 'return';
TPRINT: 'print';
TREAD: 'read';
TIF: 'if';
TELSE: 'else';
TFOR: 'for';
TSTEP: 'step';
TWHILE: 'while';
TEXIT: 'exit';
TINT: 'int';
TFLOAT: 'float';
TSTR: 'string';
TBOOL: 'boolean';
COMMA: ',';
COLON: ':';
SCOLON: ';';
EQUALS: '=';
OB: '('; 
CB: ')';
OCB: '{';
CCB: '}';
BO: ('>'|'>='|'<'|'<='|'=='|'<>'|'!=');
NOT: '!';
ADD: '+';
SUB: '-';
MUT: '*';
DIV: '/';
STR: ('"'|'“') .*? ('"'|'”');
BOOL: 'TRUE'|'FALSE';
ID: [a-zA-Z][a-zA-Z0-9_]*;
INT: SUB?[0-9]+;
FLOAT: SUB?[0-9]+'.'[0-9]+;
WS: [ \t\r\n]+ -> skip;