package nl.saxion.cos;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

public class Checker extends JavaLiteBaseVisitor<DataType> {
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;

    private Scope currentScope;

    public Checker(ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols) {
        this.types = types;
        this.symbols = symbols;
        //initialize the global scope
        currentScope = new Scope(null, 0);
    }

    @Override
    public DataType visitProgram(JavaLiteParser.ProgramContext ctx) {

        for (JavaLiteParser.FunctionDeclarationContext context : ctx.functionDeclaration()) {
            visitFunctionDeclaration(context);
            //reset the index after every function because the local stack will start at 0 again.
            currentScope.setLastIndex(0);
        }

        //open the scope for the main method, these variable should not be in the global scope.
        currentScope = currentScope.openScope();
        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visit(context);
        }
        currentScope = currentScope.closeScope();


        return null;
    }

    @Override
    public DataType visitStatement(JavaLiteParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public DataType visitLoop(JavaLiteParser.LoopContext ctx) {
        DataType valueType = visit(ctx.value());
        if (valueType != DataType.INT) {
            throw new CompilerException("Unexpected data type: " + valueType.toString() + ", Expected: " + DataType.INT.toString());
        }

        currentScope = currentScope.openScope();

        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visitStatement(context);
        }

        currentScope = currentScope.closeScope();
        symbols.put(ctx, new VariableSymbol(null, currentScope.getNextIndex(), valueType));
        return null;
    }

    @Override
    public DataType visitFunctionDeclaration(JavaLiteParser.FunctionDeclarationContext ctx) {
        String name = ctx.ID().getText();

        if (name.equals("print") || name.equals("input")) {
            throw new CompilerException("Can not overwrite function \"" + name + "\"");
        }
        DataType[] parameterTypes;
        JavaLiteParser.DeclareParametersContext parameters = ctx.declareParameters();
        currentScope = currentScope.openScope();

        if (parameters != null) {
            List<JavaLiteParser.DeclareParameterContext> parameterList = ctx.declareParameters().declareParameter();
            parameterTypes = new DataType[parameterList.size()];

            //this for-loop declares all the parameters, also makes sure they are unique.
            for (int i = 0; i < parameterList.size(); i++) {
                parameterTypes[i] = visitDeclareParameter(parameterList.get(i));
            }
        } else parameterTypes = null;

        //this for-loop handles everything inside the function.
        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visitStatement(context);
        }
        DataType returnType = visitReturnStatement(ctx.returnStatement());
        currentScope = currentScope.closeScope();

        FunctionSymbol functionSymbol = new FunctionSymbol(name, parameterTypes, returnType);
        try {
            currentScope.declareFunction(functionSymbol);
        } catch (IdentifierAlreadyUsedException e) {
            throw new CompilerException(e.getMessage());
        }

        symbols.put(ctx, functionSymbol);
        return null;
    }

    @Override
    public DataType visitDeclareParameters(JavaLiteParser.DeclareParametersContext ctx) {
        return super.visitDeclareParameters(ctx);
    }

    @Override
    public DataType visitDeclareParameter(JavaLiteParser.DeclareParameterContext ctx) {
        String type = ctx.TYPE().getText();
        DataType dataType;
        switch (type) {
            case "int":
                dataType = DataType.INT;
                break;
            case "string":
                dataType = DataType.STRING;
                break;
            case "boolean":
                dataType = DataType.BOOLEAN;
                break;
            default:
                throw new CompilerException("Unknown type");
        }

        VariableSymbol variableSymbol = new VariableSymbol(ctx.ID().getText(), currentScope.getNextIndex(), dataType);
        try {
            currentScope.declareVariable(variableSymbol);
        } catch (IdentifierAlreadyUsedException e) {
            throw new CompilerException(e.getMessage());
        }
        symbols.put(ctx, variableSymbol);
        return dataType;
    }

    @Override
    public DataType visitReturnStatement(JavaLiteParser.ReturnStatementContext ctx) {
        if (ctx.value() == null) {
            return null;
        } else {
            DataType returnType = visit(ctx.value());
            types.put(ctx, returnType);
            return returnType;
        }
    }

    @Override
    public DataType visitPrintCall(JavaLiteParser.PrintCallContext ctx) {
        DataType[] printType = new DataType[1];
        printType[0] = visit(ctx.value());
        FunctionSymbol functionSymbol = new FunctionSymbol("print", printType, null);

        symbols.put(ctx, functionSymbol);
        return null;
    }

    @Override
    public DataType visitScannerCall(JavaLiteParser.ScannerCallContext ctx) {
        String type = ctx.TYPE().getText();
        DataType dataType;
        switch (type) {
            case "int":
                dataType = DataType.INT;
                break;
            case "string":
                dataType = DataType.STRING;
                break;
            case "boolean":
                dataType = DataType.BOOLEAN;
                break;
            default:
                throw new CompilerException("Unknown type");
        }
        DataType[] inputType = {dataType};
        FunctionSymbol functionSymbol = new FunctionSymbol("scanner", inputType, null);

        symbols.put(ctx, functionSymbol);
        return dataType;
    }

    @Override
    public DataType visitCustomFunctionCall(JavaLiteParser.CustomFunctionCallContext ctx) {
        String name = ctx.ID().getText();
        FunctionSymbol functionSymbol = currentScope.lookupFunction(name);

        DataType[] methodParamTypes = functionSymbol.getParameterTypes();

        if (methodParamTypes != null) {
            for (int i = 0; i < methodParamTypes.length; i++) {
                if (methodParamTypes[i] != visit(ctx.callParameters().value(i))) {
                    throw new CompilerException("Given parameters do not match parameters of function " + "\"" + name + "\"");
                }
            }
        } else if (ctx.callParameters() != null) {
            throw new CompilerException("Given parameters do not match parameters of function " + "\"" + name + "\"");
        }

        symbols.put(ctx, functionSymbol);
        return functionSymbol.getReturnType();
    }

    @Override
    public DataType visitCallParameters(JavaLiteParser.CallParametersContext ctx) {
        return super.visitCallParameters(ctx);
    }

    @Override
    public DataType visitDeclaration(JavaLiteParser.DeclarationContext ctx) {
        VariableSymbol variableSymbol;
        String name = ctx.ID().getText();

        if (ctx.TYPE() != null) {
            String type = ctx.TYPE().getText();
            DataType dataType;
            switch (type) {
                case "int":
                    dataType = DataType.INT;
                    break;
                case "string":
                    dataType = DataType.STRING;
                    break;
                case "boolean":
                    dataType = DataType.BOOLEAN;
                    break;
                default:
                    throw new CompilerException("Unknown type");
            }
            variableSymbol = new VariableSymbol(name, currentScope.getNextIndex(), dataType);
            try {
                currentScope.declareVariable(variableSymbol);
            } catch (IdentifierAlreadyUsedException e) {
                throw new CompilerException(e.getMessage());
            }
        } else {
            variableSymbol = currentScope.lookupVariable(name);
        }

        DataType valueType = visit(ctx.value());
        if (valueType != variableSymbol.getType()) {
            throw new CompilerException("Unexpected data type: " + valueType.toString() + ", Expected: " + variableSymbol.getType().toString());
        }

        symbols.put(ctx, variableSymbol);
        return null;
    }

    @Override
    public DataType visitIfStatement(JavaLiteParser.IfStatementContext ctx) {

        visitBooleanStatements(ctx.booleanStatements());

        currentScope = currentScope.openScope();

        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visit(context);
        }

        currentScope = currentScope.closeScope();

        if (ctx.elseStatement() != null) {
            visitElseStatement(ctx.elseStatement());
        }
        return null;
    }

    @Override
    public DataType visitElseStatement(JavaLiteParser.ElseStatementContext ctx) {
        currentScope = currentScope.openScope();

        if (ctx.ifStatement() != null) {
            visitIfStatement(ctx.ifStatement());
        } else {
            for (JavaLiteParser.StatementContext context : ctx.statement()) {
                visitStatement(context);
            }
        }

        currentScope = currentScope.closeScope();

        return null;
    }

    @Override
    public DataType visitBooleanStatements(JavaLiteParser.BooleanStatementsContext ctx) {
        return super.visitBooleanStatements(ctx);
    }

    @Override
    public DataType visitComparison(JavaLiteParser.ComparisonContext ctx) {
        String comparator = ctx.COMPARATOR().getText();

        if (comparator.equals("==") || comparator.equals("!=")) {
            DataType leftType = visit(ctx.left);
            DataType rightType = visit(ctx.right);

            if (leftType != rightType) {
                throw new CompilerException("Can only compare identical data types");
            } else if (leftType == DataType.STRING){
                throw new CompilerException("Can't compare string types");
            }

            return null;
        } else {
            DataType leftType = visit(ctx.left);
            DataType rightType = visit(ctx.right);

            if (leftType != DataType.INT || rightType != DataType.INT) {
                throw new CompilerException("Can only compare integer values using comparator: " + "\"" + comparator + "\"");
            }

            return null;
        }
    }

    @Override
    public DataType visitIDBoolean(JavaLiteParser.IDBooleanContext ctx) {
        VariableSymbol variableSymbol = currentScope.lookupVariable(ctx.ID().getText());
        if (variableSymbol.getType() != DataType.BOOLEAN) {
            throw new CompilerException("Unexpected data type: " + variableSymbol.getType().toString() + ", Expected: " + DataType.BOOLEAN.toString());
        }
        symbols.put(ctx, variableSymbol);
        return null;
    }

    @Override
    public DataType visitBooleanValue(JavaLiteParser.BooleanValueContext ctx) {
        return super.visitBooleanValue(ctx);
    }

    @Override
    public DataType visitStringLiteral(JavaLiteParser.StringLiteralContext ctx) {
        types.put(ctx, DataType.STRING);
        return DataType.STRING;
    }

    @Override
    public DataType visitBoolLiteral(JavaLiteParser.BoolLiteralContext ctx) {
        types.put(ctx, DataType.BOOLEAN);
        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitMultiplyExpr(JavaLiteParser.MultiplyExprContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != DataType.INT || rightType != DataType.INT) {
            throw new CompilerException("Can only multiply integer values");
        }
        types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitIDLiteral(JavaLiteParser.IDLiteralContext ctx) {
        VariableSymbol variableSymbol = currentScope.lookupVariable(ctx.ID().getText());
        DataType symbolType = variableSymbol.getType();
        symbols.put(ctx, variableSymbol);
        return symbolType;
    }

    @Override
    public DataType visitIntLiteral(JavaLiteParser.IntLiteralContext ctx) {
        types.put(ctx, DataType.INT);
        return DataType.INT;
    }

    @Override
    public DataType visitAddExpr(JavaLiteParser.AddExprContext ctx) {
        DataType leftType = visit(ctx.left);
        DataType rightType = visit(ctx.right);

        if (leftType != DataType.INT || rightType != DataType.INT) {
            throw new CompilerException("Can only add/subtract integer values");
        }
        types.put(ctx, leftType);
        return leftType;
    }

    @Override
    public DataType visitFunctionValue(JavaLiteParser.FunctionValueContext ctx) {
        return super.visitFunctionValue(ctx);
    }
}
