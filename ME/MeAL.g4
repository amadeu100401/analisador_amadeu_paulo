grammar MeAL;
import Lex;


prog: 'PROGRAM' IDENTIFIER PVIG decls cmdComp PONTO | 'PROGRAM' IDENTIFIER PVIG cmdComp PONTO;
decls: 'VAR' listDecl;
listDecl: declTip | declTip listDecl;
declTip: listId DPONTOS tip PVIG;
listId: IDENTIFIER | IDENTIFIER VIG listId;
tip: 'STRING' | 'INTEGER' | 'BOOLEAN';
cmdComp: 'BEGIN' listCmd 'END';
listCmd: cmd PVIG | cmd PVIG listCmd;
cmd: cmdIf | cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdAtrib | cmdComp;
cmdIf: 'IF' expr 'THEN' cmd |'IF' expr 'THEN' cmd 'ELSE' cmd;
cmdWhile: 'WHILE' expr 'DO' cmd | 'WHILE' exprBool 'DO' cmd;
cmdRead: 'READ' ABPAR listId FPAR;
cmdWrite: 'WRITE' ABPAR listW FPAR;
listW: elemW | elemW VIG listW;
elemW: expr | CADEIA;
cmdAtrib: IDENTIFIER ATRIB expr;
expr: CTE OPREL expr | CTE OPAD expr | CTE | CTE OPMULT expr | ABPAR expr FPAR | IDENTIFIER OPREL expr | IDENTIFIER OPAD expr | 
IDENTIFIER OPMULT expr | IDENTIFIER OPLOG expr | IDENTIFIER ATRIB expr| OPNEG? IDENTIFIER| OPNEG? ABPAR exprBool FPAR | exprBool |IDENTIFIER |CADEIA;
exprBool: IDENTIFIER | CTE | ABPAR exprBool FPAR | IDENTIFIER OPREL IDENTIFIER |
CTE OPREL CTE | CTE OPREL IDENTIFIER | IDENTIFIER OPREL CTE | IDENTIFIER OPREL BOOLEAN | OPNEG? BOOLEAN;






