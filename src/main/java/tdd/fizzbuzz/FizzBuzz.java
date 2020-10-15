package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ_WHIZZ = "FizzWhizz";
    private static final int MODULO_3 = 3;
    public static final String FIZZ = "Fizz";
    public static final int MODULO_5 = 5;
    public static final String BUZZ = "Buzz";
    public static final int MODULO_7 = 7;
    public static final String WHIZZ = "Whizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

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

    public Boolean isDivisibleBy(int orderNumber, int modulo) {
        return orderNumber % modulo == 0;
    }
}
