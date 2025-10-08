package demotest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SampleTest {

    private Sample sample;  // instance of the actual Sample class

    @BeforeAll
    void beforeAll() {
        System.out.println("=== Starting all SampleTest cases ===");
    }

    @AfterAll
    void afterAll() {
        System.out.println("=== Finished all SampleTest cases ===");
    }

    @BeforeEach
    void setUp() {
        sample = new Sample();  // correctly create an instance of Sample
        System.out.println("-- Setting up a new test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("-- Test finished\n");
    }

    @Test
    void testGreet() {
        System.out.println("Running testGreet()");
        assertEquals("Hello, JUnit!", sample.greet(), "greet() should return correct message");
    }

    @Test
    void testSquare() {
        System.out.println("Running testSquare()");
        assertEquals(25, sample.square(5), "square(5) should be 25");
    }

    @RepeatedTest(3)
    void repeatedSquareTest() {
        System.out.println("Running repeatedSquareTest: square(3) = " + sample.square(3));
        assertEquals(9, sample.square(3), "square(3) should be 9");
    }

    @Disabled("This test is ignored")
    @Test
    void ignoredTest() {
        System.out.println("This test is ignored");
        fail("Should not run");
    }
}
