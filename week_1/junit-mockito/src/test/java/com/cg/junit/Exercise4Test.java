package com.cg.junit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise4Test {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Completed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Completed");
    }

    @Test
    void testAdd() {
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }
}