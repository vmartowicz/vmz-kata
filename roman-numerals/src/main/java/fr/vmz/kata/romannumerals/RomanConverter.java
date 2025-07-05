package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        if (arabic == 5) {
            return "V";
        }
        return "I".repeat(Math.max(0, arabic));
    }
}
