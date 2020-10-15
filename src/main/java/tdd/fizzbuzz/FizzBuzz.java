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

    public String countOff(int orderNumber) {
        if (orderNumber % MODULO_3 == 0 && orderNumber % MODULO_5 == 0) {
            return FIZZ_BUZZ;
        } else if (orderNumber % MODULO_3 == 0 && orderNumber % MODULO_7 == 0) {
            return FIZZ_WHIZZ;
        } else if (orderNumber % MODULO_5 == 0 && orderNumber % MODULO_7 == 0) {
            return BUZZ_WHIZZ;
        } else if (orderNumber % MODULO_3 == 0) {
            return FIZZ;
        } else if (orderNumber % MODULO_5 == 0) {
            return BUZZ;
        } else if (orderNumber % MODULO_7 == 0) {
            return WHIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
