package tdd.functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.calculator.functions.Functions;

public class MultiplicationTest {
    @Test
    public void shouldMultipleTwoNumbers() {
        Assertions.assertEquals(10, Functions.multiplication(2, 5));
    }

    @Test
    public void shouldMultipleNNumbers() {
        Assertions.assertEquals(100, Functions.multiplication(2, 5, 10));
    }

    @Test
    public void shouldMultiplePositiveNumbers() {
        Assertions.assertEquals(10, Functions.multiplication(2, 5));
    }

    @Test
    public void shouldMultipleNegativeNumbers() {
        Assertions.assertEquals(10, Functions.multiplication(-2, -5));
    }

    @Test
    public void shouldMultiplePositiveNegative() {
        Assertions.assertEquals(-10, Functions.multiplication(2, -5));
    }

    @Test
    public void shouldMultipleNegativePositive() {
        Assertions.assertEquals(-10, Functions.multiplication(-2, 5));
    }
}
