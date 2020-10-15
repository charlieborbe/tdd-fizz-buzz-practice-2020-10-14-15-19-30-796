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
}
