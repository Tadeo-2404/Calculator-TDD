package tdd.functions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.calculator.functions.Functions;

public class SumTest {
    @Test
    public void shouldAddTwoNumbers() {
        Assertions.assertEquals(20, Functions.sum(10, 10));
    }

    @Test
    public void shouldAddNNumbers() {
        Assertions.assertEquals(40,Functions.sum(10, 10, 10, 10));
    }

    @Test
    public void shouldAddPositiveNegative() {
        Assertions.assertEquals(-10, Functions.sum(10, -20));
    }

    @Test
    public void shouldAddNegativeNegative() {
        Assertions.assertEquals(-30, Functions.sum(-10, -20));
    }
}
