package fr.vmz.kata.romannumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {

    @Test
    public void convert1() {
        assertThat(RomanConverter.convertToRoman(1)).isEqualTo("I");
    }

    @Test
    public void convert2() {
        assertThat(RomanConverter.convertToRoman(2)).isEqualTo("II");
    }
    @Test
    public void convert3() {
        assertThat(RomanConverter.convertToRoman(3)).isEqualTo("III");
    }

    @Test
    public void convert5() {
        assertThat(RomanConverter.convertToRoman(5)).isEqualTo("V");
    }

}
