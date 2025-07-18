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

    @Test
    void shouldGetTwoForTwo() {
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void shouldGetFizzForThree() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    void shouldGetFizzForSix() {
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    void shouldGetBuzzForFive() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    void shouldGetFizzBuzzForFifteen() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }


}
