package src.test.java;

import org.junit.jupiter.api.Test;
import src.main.java.org.olenskii.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    void testCalculateFactorial_Zero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testCalculateFactorial_Positive() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testCalculateFactorial_Negative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}
