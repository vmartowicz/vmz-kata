package fr.vmz.kata.fizzbuzz;

public class FizzBuzz {
    public static String of(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i == 2)
            return "2";
        return "1";
    }
}
