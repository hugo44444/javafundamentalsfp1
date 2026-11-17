package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author cepv
 * @created 10/20/2026
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSquare() {
        System.out.println("square algorithm test");
        assertEquals(4, calculator.square(2));
    }

    @Test
    public void testSumInt() {
        System.out.println("sum int test");
        assertEquals(5, calculator.sum(2, 3));
        assertEquals(-1, calculator.sum(2, -3));
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    public void testSumDouble() {
        System.out.println("sum double test");
        // con decimales se pone un margen de error (0.001)
        assertEquals(4.0, calculator.sum(2.5, 1.5), 0.001);
        assertEquals(-1.5, calculator.sum(-3.0, 1.5), 0.001);
    }

    @Test
    public void testSquareNegative() {
        System.out.println("square negative test");
        assertEquals(9, calculator.square(-3));
        assertEquals(0, calculator.square(0));
    }

    @Test
    public void testSquareFloat() {
        System.out.println("square float test");
        assertEquals(6.25f, calculator.square(2.5f), 0.001f);
        assertEquals(0.25f, calculator.square(-0.5f), 0.001f);
    }

    @Test
    public void testExponential() {
        System.out.println("exponential algorithm test");
        assertEquals(16f, calculator.exponential(2, 4), 0.001f);
        assertEquals(27f, calculator.exponential(3, 3), 0.001f);
        // cualquier numero elevado a 0 da 1
        assertEquals(1f, calculator.exponential(5, 0), 0.001f);
        assertEquals(2.25f, calculator.exponential(1.5f, 2), 0.001f);
    }
}
