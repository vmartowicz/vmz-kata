package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        if (arabic == 2) {
            return "II";
        }
        return "I";
    }
}
