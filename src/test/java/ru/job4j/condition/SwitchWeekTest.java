package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void oneIsMonday() {
        String expected = "Понедельник";
        int day = 1;
        String result = SwitchWeek.nameOdDay(day) ;
        assertThat(expected).isEqualTo(result);
    }
}