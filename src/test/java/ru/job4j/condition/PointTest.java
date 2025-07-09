package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0,0);
        Point b = new Point(0,2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenSamePointIn3DThenZeroDistance() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(5, 5, 5);
        double result = a.distance3d(b);
        double expected = 0.0;
        assertThat(result).isEqualTo(expected, offset(0.0));
    }

    @Test
    void when42to810then14() {
        double expected = 14.42;
        Point a = new Point(-4,2);
        Point b = new Point(8,10);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when64to102then16() {
        double expected = 16.12;
        Point a = new Point(6,4);
        Point b = new Point(-10,2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}