package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(4.0f, calculator.add(2.0f, 2.0f), 0.0001f);
    }

    @Test
    public void testSubtract() {
        assertEquals(3.0f, calculator.subtract(5.0f, 2.0f), 0.0001f);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0f, calculator.divide(10.0f, 5.0f), 0.0001f);
    }

    @Test
    public void testMultiply() {
        assertEquals(24.0f, calculator.multiply(4.0f, 6.0f), 0.0001f);
    }
}