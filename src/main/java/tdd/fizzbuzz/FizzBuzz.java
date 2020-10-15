package tdd.fizzbuzz;

public class FizzBuzz {

    private static final int MODULO_3 = 3;
    public static final String FIZZ = "Fizz";

    public String countOff(int orderNumber) {
        if (orderNumber % MODULO_3 == 0) {
            return FIZZ;
        }
        else if (orderNumber % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(orderNumber);
    }
}
