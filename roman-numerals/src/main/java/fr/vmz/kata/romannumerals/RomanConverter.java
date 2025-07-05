package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        String roman = "";
        if (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }
        if (arabic >= 5) {
            roman += "V";
            arabic -= 5;
        }
         roman += "I".repeat(Math.max(0, arabic));
        return roman;
    }
}
