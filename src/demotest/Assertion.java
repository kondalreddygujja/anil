package demotest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Assertion {

    @Disabled
    @Test
    void testAssertTrue() {
        assertTrue("Hello".contains("H"), "String should contain 'H'");
    }

    @Test
    void testEqualsMethod() {
        int actual = 1;
        int expected = 2;
        assertEquals(expected, actual, "Expected values to match");
    }

    @Test
    void testNull() {
        String s = null;
        assertNull(s, "Expected string to be null");
    }
}
