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

    @Test
    void should_return_Whizz_when_count_off_given_order_number_7() {
        //given
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Whizz", number);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_15() {
        //given
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("FizzBuzz", number);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_21() {
        //given
        int orderNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("FizzWhizz", number);
    }
    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_35() {
        //given
        int orderNumber = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String number = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("BuzzWhizz", number);
    }
}
