grammar JavaLite;

program : (statement | functionDeclaration)+;

statement :   ifStatement
            | printStatement
            | declaration
            | functionCall
            | loop
            ;


loop: LOOP PAREN_OPEN value PAREN_CLOSE CURLY_OPEN statement* CURLY_CLOSE;

functionDeclaration: ID PAREN_OPEN declareParameters? PAREN_CLOSE CURLY_OPEN statement* returnStatement CURLY_CLOSE;

declareParameters: declareParameter (COMMA declareParameter)*;
declareParameter: TYPE ID;

returnStatement: RETURN value?;

printStatement: PRINT PAREN_OPEN value PAREN_CLOSE              # PrintCall;

functionCall:  INPUT PAREN_OPEN TYPE PAREN_CLOSE                # ScannerCall
             | ID PAREN_OPEN callParameters? PAREN_CLOSE        # CustomFunctionCall
             ;

callParameters : value (COMMA value)*;

declaration: TYPE? ID EQUALS value;

ifStatement : IF PAREN_OPEN booleanStatements PAREN_CLOSE CURLY_OPEN statement* CURLY_CLOSE elseStatement?;
elseStatement : ELSE CURLY_OPEN statement* CURLY_CLOSE
              | ELSE ifStatement;

booleanStatements : left=booleanStatement (log_op=LOGIC_OP right=booleanStatement)?;
booleanStatement : left=value COMPARATOR right=value            # Comparison
                   | NOTOP? ID                                  # IDBoolean
                   | NOTOP? (TRUE|FALSE)                        # BooleanValue
                   ;

value :   left=value MULTI right=value                          # MultiplyExpr
        | left=value op=(PLUS|MINUS) right=value                # AddExpr
        | NUM                                                   # IntLiteral
        | LITERALTEXT                                           # StringLiteral
        | (TRUE|FALSE)                                          # BoolLiteral
        | functionCall                                          # FunctionValue
        | ID                                                    # IDLiteral
        ;

PLUS: '+';
MINUS: '-';
MULTI: '*';
NOTOP: '!';
LOGIC_OP: '&&' | '||';
EQUALS: '=';
COMPARATOR : '>' EQUALS? | '<' EQUALS? | '==' | '!=';
PAREN_OPEN : '(';
PAREN_CLOSE : ')';
CURLY_OPEN : '{';
CURLY_CLOSE : '}';
COMMA : ',';
DOUBLE_QUOTE: '"';

TYPE : (INT|BOOL|STRING);
INT : 'int';
BOOL : 'boolean';
STRING : 'string';
TRUE: 'true';
FALSE: 'false';
LOOP : 'loop';
RETURN : 'return';
IF : 'if';
ELSE : 'else';
PRINT: 'print';
INPUT: 'input';


ID : [a-zA-Z]+;
NUM: '-'? [0-9]+;

LITERALTEXT: '"' (~["\r\n] | '""')* '"' ;

COMMENT: '//' ~[\r\n]* -> skip;
WS :[ \r\n\t]+ -> skip;

OTHER : . ;