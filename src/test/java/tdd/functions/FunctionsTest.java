package tdd.functions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.calculator.functions.Functions;

public class FunctionsTest {
    @Test
    public void shouldAddTwoNumbers() {
        Assertions.assertEquals(Functions.sum(10, 10), 20);
    }

    @Test
    public void shouldAddNNumbers() {
        Assertions.assertEquals(Functions.sum(10, 10, 10, 10), 40);
    }

    @Test
    public void shouldAddPositiveNegative() {
        Assertions.assertEquals(Functions.sum(10, -20), -10);
    }

    @Test
    public void shouldAddNegativeNegative() {
        Assertions.assertEquals(Functions.sum(-10, -20), -30);
    }
}
