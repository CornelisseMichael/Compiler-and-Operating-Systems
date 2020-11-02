package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GeneralTests {

    private String testPath = "testFiles/GeneralTests/";
    private String outputPath = "testOutput/GeneralTests/";

    @Test
    void example_1() throws Exception {
        String fileName = "Example_1";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Hello World!"
        }, output.toArray());
    }

    @Test
    void example_2() throws Exception {
        String fileName = "Example_2";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "14"
        }, output.toArray());
    }

    @Test
    void example_3() throws Exception {
        String fileName = "Example_3";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
                "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "The big five-O", "51",
                "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68",
                "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85",
                "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "Yay - I'm done"
        }, output.toArray());
    }

    @Test
    void example_4() throws Exception {
        String fileName = "Example_4";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");

        assertArrayEquals(new String[]{
                ".class public Example_4",
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
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "ldc \"How old are you?\"",
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
                "new java/util/Scanner",
                "dup",
                "getstatic java/lang/System/in Ljava/io/InputStream;",
                "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V",
                "invokevirtual java/util/Scanner/nextInt()I",
                "istore 1",
                "iload 1",
                "ldc 18",
                "if_icmpge true0",
                "false0:",
                "ldc 0",
                "goto end0",
                "true0:",
                "ldc 1",
                "end0:",
                "ifne ifLabel1",
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "ldc \"You are not old enough to buy alcohol.\"",
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
                "goto end1",
                "ifLabel1:",
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "ldc \"You are old enough to buy alcohol.\"",
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
                "end1:",
                "",
                "return",
                ".end method"
        }, code.getLines().toArray());
    }

    @Test
    void example_5() throws Exception {
        String fileName = "Example_5";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "2", "4", "8", "16", "32", "64", "128", "256", "512", "1024"
        }, output.toArray());
    }

    @Test
    void scannerTest() throws Exception {
        String fileName = "Scanner";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");

        assertArrayEquals(new String[]{
                ".class public Scanner",
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
                "new java/util/Scanner",
                "dup",
                "getstatic java/lang/System/in Ljava/io/InputStream;",
                "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V",
                "invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;",
                "astore 1",
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "aload 1",
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
                "",
                "return",
                ".end method"
        }, code.getLines().toArray());

    }

    @Test
    void commentsTest() throws Exception {
        String fileName = "Comments";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");

        assertArrayEquals(new String[]{
                ".class public Comments",
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
                "new java/util/Scanner",
                "dup",
                "getstatic java/lang/System/in Ljava/io/InputStream;",
                "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V",
                "invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;",
                "astore 1",
                "getstatic java/lang/System/out Ljava/io/PrintStream;",
                "aload 1",
                "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
                "",
                "return",
                ".end method",
        }, code.getLines().toArray());
    }

    @Test
    void weCanAlsoCompileFromString() throws Exception {
        String fileName = "StringSource";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("if(true){}", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                ""
        }, output.toArray());
    }
}
