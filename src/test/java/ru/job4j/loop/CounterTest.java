package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CounterTest {
    @Test
    public void when1To4Is10() {
        int start = 0;
        int finish = 4;
        int expected = 10;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5To1Is0() {
        int start = 5;
        int finish = 1;
        int expected = 0;
        int result = Counter.sum(start,finish);
        assertThat(result).isEqualTo(expected);
    }
}