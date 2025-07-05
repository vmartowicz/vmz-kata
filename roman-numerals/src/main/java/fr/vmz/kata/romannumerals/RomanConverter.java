package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();
        roman.append("I".repeat(Math.max(0, arabic)));
        return roman.toString();
    }
}
