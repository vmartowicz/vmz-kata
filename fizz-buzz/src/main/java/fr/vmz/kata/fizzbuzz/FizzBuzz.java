package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {

    private static final int FIZZ_VALUE = 3;
    private static final int BUZZ_VALUE = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

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
