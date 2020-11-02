package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionTests {

    private String testPath = "testFiles/ConditionTests/";
    private String outputPath = "testOutput/ConditionTests/";

    @Test
    void conditionTest_a() throws Exception {
        String fileName = "Conditions_a";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "ifStatement Executed"
        }, output.toArray());
    }

    @Test
    void conditionTest_b() throws Exception {
        String fileName = "Conditions_b";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "elseStatement Executed"
        }, output.toArray());
    }

    @Test
    void conditionTest_c() throws Exception {
        String fileName = "Conditions_c";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "elseIfStatement Executed"
        }, output.toArray());
    }

    @Test
    void conditionTest_d() throws Exception {
        String fileName = "Conditions_d";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "the AND operator works"
        }, output.toArray());
    }

    @Test
    void conditionTest_e() throws Exception {
        String fileName = "Conditions_e";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "the OR operator works"
        }, output.toArray());
    }

    @Test
    void conditionError_a() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "Condition_error_a.jvl", "HelloWorld");
        assertNull(code);
    }

    @Test
    void conditionError_b() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "Condition_error_b.jvl", "HelloWorld");
        assertNull(code);
    }

    @Test
    void conditionError_c() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "Condition_error_c.jvl", "HelloWorld");
        assertNull(code);
    }
}
