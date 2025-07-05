package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < arabic; i++) {
            roman.append("I");
        }
        return roman.toString();
    }
}
