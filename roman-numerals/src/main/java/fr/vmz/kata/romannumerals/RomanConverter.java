package fr.vmz.kata.romannumerals;

public class RomanConverter {

    private RomanConverter() {
        // NOSONAR
    }

    public static String convertToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();

        for(RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            while (arabic >= romanToDecimal.arabic) {
                roman.append(romanToDecimal.roman);
                arabic -= romanToDecimal.arabic;
            }
        }
        return roman.toString();
    }

    enum RomanToDecimal {
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);
        private final String roman;
        private final int arabic;

        RomanToDecimal(String roman, int arabic){
            this.roman = roman;
            this.arabic = arabic;

        }
    }

}
