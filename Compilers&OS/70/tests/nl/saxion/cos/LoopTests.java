package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LoopTests {

    private String testPath = "testFiles/LoopTests/";
    private String outputPath = "testOutput/LoopTests/";

    @Test
    void loopTest_a() throws Exception {
        String fileName = "Loop_a";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + fileName + ".jvl", fileName);
        code.writeJasminToFile(outputPath + fileName + ".j");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "123",
                "123",
                "123",
                "123"
        }, output.toArray());
    }

    @Test
    void loopError_a() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile(testPath + "Loop_error_a.jvl", "HelloWorld");
        assertNull(code);
    }
}
