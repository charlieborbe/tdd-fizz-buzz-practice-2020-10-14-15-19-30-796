package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_order_number_1() {
        //given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("1", number);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        //given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Fizz", number);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        //given
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Buzz", number);
    }
}
