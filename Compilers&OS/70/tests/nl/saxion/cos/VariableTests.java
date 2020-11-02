package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class VariableTests {

    private String testPath = "testFiles/VariableTests/";
    private String outputPath = "testOutput/VariableTests/";

    @Test
    void variableAssignmentTest() throws Exception {
        String fileName = "VariableAssignment";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "2",
                "true",
                "test"
        }, output.toArray());
    }

    @Test
    void variableError_a() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "Variable_error_a.jvl", "HelloWorld");
        assertNull(code);
    }
}
