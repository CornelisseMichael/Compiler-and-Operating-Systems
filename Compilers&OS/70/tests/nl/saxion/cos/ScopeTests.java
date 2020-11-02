package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ScopeTests {

    private String testPath = "testFiles/ScopeTests/";
    private String outputPath = "testOutput/ScopeTests/";

    @Test
    void scopeTest_a() throws Exception {
        String fileName = "Scope_a";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "3",
                "3",
                "3"
        }, output.toArray());
    }

    @Test
    void scopeError_a() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "/Scope_error_a.jvl", "HelloWorld");
        assertNull(code);
    }
}
