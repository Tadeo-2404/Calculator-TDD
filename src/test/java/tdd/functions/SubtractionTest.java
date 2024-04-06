package tdd.functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.calculator.functions.Functions;

public class SubtractionTest {
    @Test
    public void shouldSubtractTwoNumbers() {
        Assertions.assertEquals(5, Functions.subtraction(10, 5));
    }

    @Test
    public void shouldSubtractNNumbers() {
        Assertions.assertEquals(3, Functions.subtraction(10, 5, 2));
    }

    @Test
    public void shouldSubtractPositiveNumbers() {
        Assertions.assertEquals(95, Functions.subtraction(100, 5));
    }

    @Test
    public void shouldSubtractNegativeNumbers() {
        Assertions.assertEquals(-10, Functions.subtraction(-15, -5));
    }

    @Test
    public void shouldSubtractPositiveNegative() {
        Assertions.assertEquals(15, Functions.subtraction(10, -5));
    }
}
