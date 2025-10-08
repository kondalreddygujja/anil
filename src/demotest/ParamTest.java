package demotest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"calhi", "bali"})
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"), str + " should end with 'i'");
    }
}
