package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();

        for(RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            if (arabic >= romanToDecimal.arabic) {
                roman.append(romanToDecimal.roman);
                arabic -= romanToDecimal.arabic;
            }
        }
         roman.append("I".repeat(Math.max(0, arabic)));
        return roman.toString();
    }

    enum RomanToDecimal {
        TEN("X", 10),
        FIVE("V", 5);
        private final String roman;
        private final int arabic;

        RomanToDecimal(String roman, int arabic){
            this.roman = roman;
            this.arabic = arabic;

        }
    }

}
