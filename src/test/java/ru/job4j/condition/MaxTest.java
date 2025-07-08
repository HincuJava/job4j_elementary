package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2To5Then5() {
        int first = 3;
        int second = 2;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To4To2To9Then9() {
        int first = 7;
        int second = 4;
        int third = 2;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAllEqualThenAny() {
        assertThat(Max.max(1, 1)).isEqualTo(1);
        assertThat(Max.max(1, 1, 1)).isEqualTo(1);
        assertThat(Max.max(1, 1, 1, 1)).isEqualTo(1);
    }
}