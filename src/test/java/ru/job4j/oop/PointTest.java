package ru.job4j.oop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {
    @Test
    public void when00and80Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(8, 0);
        double result = a.distance(b);
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when11and11Then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        double expected = 0;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when555and101010Then866() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(10, 10, 10);
        double result = a.distance3d(b);
        double expected = 8.66;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}