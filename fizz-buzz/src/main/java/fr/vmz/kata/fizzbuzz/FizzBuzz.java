package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZ = 3;
    public static final int BUZZ = 5;

    public static String of(int i) {
        if (isBuzz(i)) {
            return "Buzz";
        }
        if (isFizz(i)) {
            return "Fizz";
        }
        return String.valueOf(i);
    }

    private static boolean isBuzz(int i) {
        return i % BUZZ == 0;
    }

    private static boolean isFizz(int i) {
        return i % FIZZ == 0;
    }
}
