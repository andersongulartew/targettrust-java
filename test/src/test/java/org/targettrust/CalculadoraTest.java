package org.targettrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
   public void testsum() {
        // Arrange (preparação)
        Calculadora calc = new Calculadora();

        // Act (Ação)
        int resultadosum = calc.sum(3, 4);

        // Assert (Asserção)
        assertEquals(7, resultadosum);
    }

    @Test
    public void testsubtract() {
        Calculadora calc = new Calculadora();

        int resultadosub = calc.subtract(10, 5);

        assertEquals(5, resultadosub);
    }
    @Test
    public void testmultiply() {
        Calculadora calc = new Calculadora();

        int resultadomult = calc.multiply(2, 3);

        assertEquals(6, resultadomult);
    }
    @Test
    public void testdivide() {
        Calculadora calc = new Calculadora();

        double resultadodivide = calc.divide(10, 2);

        assertEquals(5, resultadodivide);
    }
}