package tdd.functions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tdd.calculator.functions.Functions;

public class Division {
    @Test
    public void shouldDivideTwoNumbers() {
        Assertions.assertEquals(10, Functions.division(20, 2));
    }

    @Test
    public void shouldDividePositiveNumbers() {
        Assertions.assertEquals(5, Functions.division(20, 4));
    }

    @Test
    public void shouldDivideNegativeNumbers() {
        Assertions.assertEquals(5, Functions.division(-10, -2));
    }

    @Test
    public void shouldDividePositiveNegative() {
        Assertions.assertEquals(-5, Functions.division(10, -2));
    }

    @Test
    public void shouldDividedNegativePositive() {
        Assertions.assertEquals(-5, Functions.division(-10, 2));
    }
}
