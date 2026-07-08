package com.cg.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exercise3Test {
    Calculator calculator = new Calculator();
    @Test
    void testAssertions() {
        assertEquals(5, calculator.add(2, 3));
        assertTrue(10 > 5);
        assertFalse(5 > 10);
        assertNull(null);
        assertNotNull(calculator);
    }
}