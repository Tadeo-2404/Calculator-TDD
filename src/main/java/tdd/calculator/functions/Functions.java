package tdd.calculator.functions;

public class Functions {
    public static int sum(int... numbers) {
        int initial = 0;
        for(int args: numbers) {
            initial += args;
        }
        return initial;
    }

    public static int subtraction(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }
}
