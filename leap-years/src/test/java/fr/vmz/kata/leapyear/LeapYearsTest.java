package fr.vmz.kata.leapyear;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {
    /*
     * Acceptance Criteria:
     *
     * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
     * All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
     * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
     * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
     */

    @Test
    void shouldBeLeapYearsFor2000(){
        assertThat(LeapYears.isLeap(2000)).isTrue();
    }

    @Test
    void shouldBeLeapYearsFor1700(){
        assertThat(LeapYears.isLeap(1700)).isTrue();
    }

    @Test
    void shouldBeLeapYearsFor2008(){
        assertThat(LeapYears.isLeap(2008)).isTrue();
    }

    @Test
    void shouldNotBeLeapYearsFor2017(){
        assertThat(LeapYears.isLeap(2017)).isFalse();
    }
}

