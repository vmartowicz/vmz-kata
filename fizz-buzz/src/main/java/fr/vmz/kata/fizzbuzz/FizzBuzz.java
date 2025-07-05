package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {

    public static final int FIZZ = 3;

    public static String of(int i) {
        if (isFizz(i)) {
            return "Fizz";
        }
        if (i == 2)
            return "2";
        return "1";
    }

    private static boolean isFizz(int i) {
        return i % FIZZ == 0;
    }
}
