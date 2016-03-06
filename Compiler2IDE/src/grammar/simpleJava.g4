/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar simpleJava;

@header{
   package grammar;
   import java.util.*;
}

@parser::members{
   Map<String, Float> memory = new HashMap<String, Float>();
}

prog: TCLASS ID SCOLON (declConst | declVars)* declFuncoes* principal
    ;

declConst: tipo ID EQUALS inicVal SCOLON
         ;

inicVal: INT | FLOAT | STR | BOOL         
       ;

tipo: TINT
    | TFLOAT
    | TSTR
    | TBOOL
    ;

declVars: TVAR ID (COMMA ID)* COLON tipo SCOLON
        ;

declFuncoes: ID OB params CB COLON tipo OCB (declConst | declVars)* comandos* CCB
           	;
           
params: ((tipo ID) (COMMA tipo ID)*)?
			;

declReturn: TRETURN OB (expr|expr2|chamadaFuncoes|STR|BOOL) CB
          ;

chamadaFuncoes: ID OB (paramCall (COMMA paramCall)*)? CB
              ;

paramCall: (STR|BOOL)|expr|expr2
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
        ;


cmdifelse: TIF OB expr2 CB OCB comandos* CCB (TELSE OCB comandos* CCB)?
      ;
          
cmdfor: TFOR OB ID EQUALS INT COLON INT (TSTEP SUB?INT)? CB OCB (comandos|TEXIT)* CCB
   ;

cmdwhile: TWHILE OB expr2 CB OCB (comandos|TEXIT)* CCB
     ;

atribuicao: ID EQUALS inicAttrib
          ;

inicAttrib: (STR | BOOL ) | expr | expr2 | chamadaFuncoes
          ;

print: TPRINT OB paramCall (COMMA paramCall )* CB
     ;

read: TREAD OB ID (COMMA ID)* CB
    ;

expr: OB expr CB # Bracket
    | expr (MUT|DIV) expr # MultDiv
    | expr (ADD|SUB) expr # AddSub
    | SUB?INT # Int
    | SUB?FLOAT # Float
    | ID # Id
    | chamadaFuncoes # FunctionCall
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
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
WS: [ \t\r\n]+ -> skip;