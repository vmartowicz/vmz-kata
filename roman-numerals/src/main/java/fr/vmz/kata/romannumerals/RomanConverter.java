package fr.vmz.kata.romannumerals;

public class RomanConverter {

    public String convertToRoman(int arabic) {
        if (arabic == 2) {
            return "II";
        }
        return "I";
    }
}
