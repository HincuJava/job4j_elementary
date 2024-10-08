package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 3, 2, 4, 5};
    }

    @Test
    void whenSwap2to4() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to5() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 5, 4, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 3;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 9, 5, 6, 7, 8, 4};
        assertThat(result).containsExactly(expected);
    }
}