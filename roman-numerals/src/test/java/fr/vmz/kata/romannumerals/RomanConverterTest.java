package fr.vmz.kata.romannumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {

    @Test
    public void convert1() {
        assertThat(new RomanConverter().convertToRoman(1)).isEqualTo("I");
    }

    @Test
    public void convert2() {
        assertThat(new RomanConverter().convertToRoman(2)).isEqualTo("II");
    }


}
