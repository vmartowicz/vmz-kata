package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        String roman = "";
        for (int i = 0; i < arabic; i++) {
            roman += "I";
        }
        return roman;
    }
}
