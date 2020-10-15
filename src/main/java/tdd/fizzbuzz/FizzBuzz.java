package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;

    public String countOff(int orderNumber) {
        StringBuilder outputResult = new StringBuilder();
        if (isDivisibleBy(orderNumber, MODULO_3)) {
            outputResult.append(FIZZ);
        }
        if (isDivisibleBy(orderNumber, MODULO_5)) {
            outputResult.append(BUZZ);
        }
        if (isDivisibleBy(orderNumber, MODULO_7)) {
            outputResult.append(WHIZZ);
        }
        return outputResult.length() == 0 ? String.valueOf(orderNumber) : outputResult.toString();
    }

    private Boolean isDivisibleBy(int orderNumber, int modulo) {
        return orderNumber % modulo == 0;
    }
}
