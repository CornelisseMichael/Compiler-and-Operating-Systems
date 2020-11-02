package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FunctionTests {

    private String testPath = "testFiles/FunctionTests/";
    private String outputPath = "testOutput/FunctionTests/";

    @Test
    void functionDeclarationTest_a() throws Exception {
        String fileName = "FunctionDeclaration_a";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        assertArrayEquals(new String[]{
                ".class public FunctionDeclaration_a",
                ".super java/lang/Object",
                "",
                ".method public <init>()V",
                ".limit stack 1",
                "aload_0",
                "invokenonvirtual java/lang/Object/<init>()V",
                "return",
                ".end method",
                "",
                ".method public static main([Ljava/lang/String;)V",
                ".limit stack 99",
                ".limit locals 99",
                "",
                "",
                "return",
                ".end method",
                ".method public testFunc(I)V",
                ".limit stack 99",
                ".limit locals 99",
                "",
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "iload 1",
                "invokevirtual java/io/PrintStream/println(I)V",
                "return",
                ".end method"
        }, code.getLines().toArray());

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                ""
        }, output.toArray());
    }

    @Test
    void functionDeclarationTest_b() throws Exception {
        String fileName = "FunctionDeclaration_b";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                ""
        }, output.toArray());
    }

    @Test
    void functionTest() throws Exception {
        String fileName = "Functions";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "1",
                "2",
                "3",
                "4",
                "5"
        }, output.toArray());
    }
}
