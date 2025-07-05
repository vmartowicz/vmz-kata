package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public static String of(int i) {

        if (isFizzBuzz(i)) {
            return FIZZ_BUZZ;
        }

        if (isBuzz(i)) {
            return BUZZ;
        }
        if (isFizz(i)) {
            return FIZZ;
        }
        return String.valueOf(i);
    }

    private static boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private static boolean isBuzz(int i) {
        return i % BUZZ_VALUE == 0;
    }

    private static boolean isFizz(int i) {
        return i % FIZZ_VALUE == 0;
    }
}
