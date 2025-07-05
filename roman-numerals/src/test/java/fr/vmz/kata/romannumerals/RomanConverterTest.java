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
    public void convert4() {
        assertThat(RomanConverter.convertToRoman(4)).isEqualTo("IV");
    }

    @Test
    public void convert5() {
        assertThat(RomanConverter.convertToRoman(5)).isEqualTo("V");
    }

    @Test
    public void convert7() {
        assertThat(RomanConverter.convertToRoman(7)).isEqualTo("VII");
    }

    @Test
    public void convert9() {
        assertThat(RomanConverter.convertToRoman(9)).isEqualTo("IX");
    }

    @Test
    public void convert10() {
        assertThat(RomanConverter.convertToRoman(10)).isEqualTo("X");
    }

    @Test
    public void convert18() {
        assertThat(RomanConverter.convertToRoman(18)).isEqualTo("XVIII");
    }
    @Test
    public void convert30() {
        assertThat(RomanConverter.convertToRoman(30)).isEqualTo("XXX");
    }

    @Test
    public void convert2687() {
        assertThat(RomanConverter.convertToRoman(2687)).isEqualTo("MMDCLXXXVII");
    }
    @Test
    public void convert3499() {
        assertThat(RomanConverter.convertToRoman(3499)).isEqualTo("MMMCDXCIX");
    }

}
