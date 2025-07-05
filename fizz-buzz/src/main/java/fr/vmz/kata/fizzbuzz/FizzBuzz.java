package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZ = 3;

    public static String of(int i) {
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (isFizz(i)) {
            return "Fizz";
        }
        return String.valueOf(i);
    }

    private static boolean isFizz(int i) {
        return i % FIZZ == 0;
    }
}
