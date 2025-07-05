package fr.vmz.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    /*
    1 == 1
    2 == 2
    3 == fizz
    4 == 4
    5 == Buzz
    6 == Fizz
    7 == 7
    8 == 8
    9 == Fizz
    10 == Buzz
    ... 12
    15 == FizzBuzz
    100 == Buzz
 */
    @Test
    void shouldGetOneForOne() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

}
