package nl.saxion.cos;

import jas.Var;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class CodeGenerator extends JavaLiteBaseVisitor<Void> {
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private JasminBytecode jasminBytecode;

    private int labelCount;


    public CodeGenerator(JasminBytecode jasminBytecode, ParseTreeProperty<DataType> types, ParseTreeProperty<Symbol> symbols) {
        this.jasminBytecode = jasminBytecode;
        this.types = types;
        this.symbols = symbols;
    }

    public JasminBytecode getJasminBytecode() {
        return jasminBytecode;
    }

    @Override
    public Void visitProgram(JavaLiteParser.ProgramContext ctx) {
        jasminBytecode.add(".class public " + jasminBytecode.getClassName());
        jasminBytecode.add(".super java/lang/Object");
        jasminBytecode.add("");
        jasminBytecode.add(".method public <init>()V");
        jasminBytecode.add(".limit stack 1");
        jasminBytecode.add("aload_0");
        jasminBytecode.add("invokenonvirtual java/lang/Object/<init>()V");
        jasminBytecode.add("return");
        jasminBytecode.add(".end method");
        jasminBytecode.add("");
        jasminBytecode.add(".method public static main([Ljava/lang/String;)V");
        jasminBytecode.add(".limit stack 99");
        jasminBytecode.add(".limit locals 99");
        jasminBytecode.add("");

        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visit(context);
        }

        jasminBytecode.add("");
        jasminBytecode.add("return");
        jasminBytecode.add(".end method");

        for (JavaLiteParser.FunctionDeclarationContext context : ctx.functionDeclaration()) {
            visitFunctionDeclaration(context);
        }

        return null;
    }

    @Override
    public Void visitStatement(JavaLiteParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitLoop(JavaLiteParser.LoopContext ctx) {
        visit(ctx.value());
        int index = ((VariableSymbol) symbols.get(ctx)).getIndex();
        jasminBytecode.add("istore " + index);

        int uniqueLabel = labelCount++;
        jasminBytecode.add("goto check" + uniqueLabel);
        jasminBytecode.add("begin" + uniqueLabel + ":");

        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visit(context);
        }

        jasminBytecode.add("iinc " + index + " -1");
        jasminBytecode.add("check" + uniqueLabel + ":");
        jasminBytecode.add("iload " + index);
        jasminBytecode.add("ifgt begin" + uniqueLabel);
        return null;
    }

    @Override
    public Void visitFunctionDeclaration(JavaLiteParser.FunctionDeclarationContext ctx) {
        FunctionSymbol symbol = (FunctionSymbol) symbols.get(ctx);

        //first, we need to construct the method signature
        String methodSignature = constructSignature(symbol);

        //then we declare the method
        jasminBytecode.add(".method public " + symbol.getName() + methodSignature);
        jasminBytecode.add(".limit stack 99");
        jasminBytecode.add(".limit locals 99");
        jasminBytecode.add("");

        //perform all operations in the method
        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visitStatement(context);
        }

        //finally we execute the return statement.
        visitReturnStatement(ctx.returnStatement());
        jasminBytecode.add(".end method");

        return null;
    }

    @Override
    public Void visitReturnStatement(JavaLiteParser.ReturnStatementContext ctx) {
        DataType returnType = types.get(ctx);
        String type = "";
        if (returnType != null) {
            switch (returnType) {
                case STRING:
                    type = "a";
                    break;
                case INT:
                    type = "i";
                    break;
                case BOOLEAN:
                    type = "i";
                    break;
            }
            visit(ctx.value());
        }

        jasminBytecode.add(type + "return");
        return null;
    }

    @Override
    public Void visitDeclareParameters(JavaLiteParser.DeclareParametersContext ctx) {
        return super.visitDeclareParameters(ctx);
    }

    @Override
    public Void visitDeclareParameter(JavaLiteParser.DeclareParameterContext ctx) {
        return super.visitDeclareParameter(ctx);
    }

    @Override
    public Void visitPrintCall(JavaLiteParser.PrintCallContext ctx) {
        FunctionSymbol symbol = (FunctionSymbol) symbols.get(ctx);

        jasminBytecode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.value());
        switch (symbol.getParameterTypes()[0]) {
            case INT:
                jasminBytecode.add("invokevirtual java/io/PrintStream/println(I)V");
                break;
            case STRING:
                jasminBytecode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                break;
            case BOOLEAN:
                jasminBytecode.add("invokevirtual java/io/PrintStream/println(Z)V");
        }
        return null;
    }

    @Override
    public Void visitScannerCall(JavaLiteParser.ScannerCallContext ctx) {
        FunctionSymbol symbol = (FunctionSymbol) symbols.get(ctx);

        jasminBytecode.add("new java/util/Scanner");
        jasminBytecode.add("dup");
        jasminBytecode.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        jasminBytecode.add("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");

        switch (symbol.getParameterTypes()[0]) {
            case INT:
                jasminBytecode.add("invokevirtual java/util/Scanner/nextInt()I");
                break;
            case STRING:
                jasminBytecode.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
                break;
            case BOOLEAN:
                jasminBytecode.add("invokevirtual java/util/Scanner/nextBoolean()Z");
        }
        return null;
    }

    @Override
    public Void visitCustomFunctionCall(JavaLiteParser.CustomFunctionCallContext ctx) {
        FunctionSymbol symbol = (FunctionSymbol) symbols.get(ctx);

        String method = symbol.getName() + constructSignature(symbol);

        jasminBytecode.add("new " + jasminBytecode.getClassName());
        jasminBytecode.add("dup");
        jasminBytecode.add("invokenonvirtual " + jasminBytecode.getClassName() + "/<init>()V");

        if (ctx.callParameters() != null) {
            visitCallParameters(ctx.callParameters());
        }
        jasminBytecode.add("invokevirtual " + jasminBytecode.getClassName() + "/" + method);

        return null;
    }

    @Override
    public Void visitCallParameters(JavaLiteParser.CallParametersContext ctx) {
        return super.visitCallParameters(ctx);
    }

    @Override
    public Void visitDeclaration(JavaLiteParser.DeclarationContext ctx) {
        VariableSymbol symbol = (VariableSymbol) symbols.get(ctx);
        String type;

        switch (symbol.getType()) {
            case STRING:
                type = "a";
                break;
            default:
                type = "i";
                break;
        }

        visit(ctx.value());
        jasminBytecode.add(type + "store " + symbol.getIndex());

        return null;
    }

    @Override
    public Void visitIfStatement(JavaLiteParser.IfStatementContext ctx) {
        visitBooleanStatements(ctx.booleanStatements());

        int uniqueLabel = labelCount++;
        jasminBytecode.add("ifne ifLabel" + uniqueLabel);

        if (ctx.elseStatement() != null) {
            visitElseStatement(ctx.elseStatement());
        }

        jasminBytecode.add("goto end" + uniqueLabel);
        jasminBytecode.add("ifLabel" + uniqueLabel + ":");

        for (JavaLiteParser.StatementContext context : ctx.statement()) {
            visitStatement(context);
        }

        jasminBytecode.add("end" + uniqueLabel + ":");


        return null;
    }

    @Override
    public Void visitElseStatement(JavaLiteParser.ElseStatementContext ctx) {
        //an else-if can be handled recursively
        if (ctx.ifStatement() != null) {
            visitIfStatement(ctx.ifStatement());

            //an else block can just be executed
        } else {
            for (JavaLiteParser.StatementContext context : ctx.statement()) {
                visitStatement(context);
            }
        }

        return null;
    }

    @Override
    public Void visitBooleanStatements(JavaLiteParser.BooleanStatementsContext ctx) {
        if (ctx.log_op != null) {
            visit(ctx.left);
            visit(ctx.right);


            String logicOp = ctx.log_op.getText();

            if (logicOp.equals("||")) {
                jasminBytecode.add("ior");
            } else jasminBytecode.add("iand");

        } else {
            visit(ctx.left);
        }

        return null;
    }

    @Override
    public Void visitComparison(JavaLiteParser.ComparisonContext ctx) {
        visit(ctx.left);
        visit(ctx.right);

        int uniqueLabel = labelCount++;
        switch (ctx.COMPARATOR().getText()) {
            case "==":
                jasminBytecode.add("if_icmpeq true" + uniqueLabel);
                break;
            case "!=":
                jasminBytecode.add("if_icmpne true" + uniqueLabel);
                break;
            case ">":
                jasminBytecode.add("if_icmpgt true" + uniqueLabel);
                break;
            case ">=":
                jasminBytecode.add("if_icmpge true" + uniqueLabel);
                break;
            case "<":
                jasminBytecode.add("if_icmplt true" + uniqueLabel);
                break;
            case "<=":
                jasminBytecode.add("if_icmple true" + uniqueLabel);
                break;
            default:
                throw new RuntimeException("help");
        }
        jasminBytecode.add("false" + uniqueLabel + ":");
        jasminBytecode.add("ldc 0");
        jasminBytecode.add("goto end" + uniqueLabel);

        jasminBytecode.add("true" + uniqueLabel + ":");
        jasminBytecode.add("ldc 1");
        jasminBytecode.add("end" + uniqueLabel + ":");

        return null;
    }

    @Override
    public Void visitIDBoolean(JavaLiteParser.IDBooleanContext ctx) {
        VariableSymbol symbol = (VariableSymbol) symbols.get(ctx);
        jasminBytecode.add("iload " + symbol.getIndex());

        if (ctx.NOTOP() != null) {
            jasminBytecode.add("iconst_1");
            jasminBytecode.add("iadd");
            jasminBytecode.add("iconst_2");
            jasminBytecode.add("irem");
        }
        return null;
    }

    @Override
    public Void visitBooleanValue(JavaLiteParser.BooleanValueContext ctx) {
        if (ctx.TRUE() != null) {
            jasminBytecode.add("ldc 1");
        } else {
            jasminBytecode.add("ldc 0");
        }

        if (ctx.NOTOP() != null) {
            jasminBytecode.add("iconst_1");
            jasminBytecode.add("iadd");
            jasminBytecode.add("iconst_2");
            jasminBytecode.add("irem");
        }

        return null;
    }

    @Override
    public Void visitStringLiteral(JavaLiteParser.StringLiteralContext ctx) {
        jasminBytecode.add("ldc " + ctx.getText());
        return null;
    }

    @Override
    public Void visitBoolLiteral(JavaLiteParser.BoolLiteralContext ctx) {
        if (ctx.TRUE() != null) {
            jasminBytecode.add("ldc 1");
        } else jasminBytecode.add("ldc 0");
        return null;
    }

    @Override
    public Void visitMultiplyExpr(JavaLiteParser.MultiplyExprContext ctx) {
        visitChildren(ctx);
        jasminBytecode.add("imul");

        return null;
    }

    @Override
    public Void visitIDLiteral(JavaLiteParser.IDLiteralContext ctx) {
        VariableSymbol symbol = (VariableSymbol) symbols.get(ctx);
        String type;

        switch (symbol.getType()) {
            case STRING:
                type = "a";
                break;
            default:
                type = "i";
                break;
        }

        jasminBytecode.add(type + "load " + symbol.getIndex());
        return null;
    }

    @Override
    public Void visitIntLiteral(JavaLiteParser.IntLiteralContext ctx) {
        jasminBytecode.add("ldc " + ctx.getText());
        return null;
    }

    @Override
    public Void visitAddExpr(JavaLiteParser.AddExprContext ctx) {
        visitChildren(ctx);
        if (ctx.op.getText().equals("-")) {
            jasminBytecode.add("isub");
        } else {
            jasminBytecode.add("iadd");
        }
        return null;
    }

    @Override
    public Void visitFunctionValue(JavaLiteParser.FunctionValueContext ctx) {
        return super.visitFunctionValue(ctx);
    }

    private String findTypeDescriptor(DataType type) {
        switch (type) {
            case INT:
                return "I";
            case STRING:
                return "Ljava/lang/String;";
            case BOOLEAN:
                return "Z";
        }

        return null;
    }

    private String constructSignature(FunctionSymbol symbol) {
        StringBuilder methodSignature = new StringBuilder("(");

        if (symbol.getParameterTypes() != null) {
            for (DataType type : symbol.getParameterTypes()) {
                methodSignature.append(findTypeDescriptor(type));
            }
        }


        methodSignature.append(")");
        if (symbol.getReturnType() != null) {
            methodSignature.append(findTypeDescriptor(symbol.getReturnType()));
        } else methodSignature.append("V");

        return methodSignature.toString();
    }
}
