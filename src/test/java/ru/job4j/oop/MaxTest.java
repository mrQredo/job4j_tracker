package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class MaxTest {

    @Test
    public void when1and10Then10() {
        Max testMax = new Max();
        int result = testMax.max(1, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1and10and100Then100() {
        Max testMax = new Max();
        int result = testMax.max(1, 10, 100);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1and10and100and1000Then1000() {
        Max testMax = new Max();
        int result = testMax.max(1, 10, 100, 1000);
        int expected = 1000;
        assertThat(result).isEqualTo(expected);
    }
}