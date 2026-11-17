package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStaticMethodTests {
    // no hace falta crear un objeto con "new":
    // los métodos estáticos se llaman con el nombre de la clase

    @Test
    public void testStaticSum() {
        System.out.println("static sum test");
        assertEquals(5, Calculator2.sum(2, 3));
    }

    @Test
    public void testStaticSumNegative() {
        System.out.println("static sum negative test");
        assertEquals(-1, Calculator2.sum(2, -3));
        assertEquals(-5, Calculator2.sum(-2, -3));
    }

    @Test
    public void testStaticSumZero() {
        System.out.println("static sum zero test");
        assertEquals(0, Calculator2.sum(0, 0));
        assertEquals(7, Calculator2.sum(7, 0));
    }
}
