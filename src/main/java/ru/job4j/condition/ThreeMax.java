package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
            return result;
        } else if (second >= first && second >= third) {
            result = second;
            return result;
        }
        result = third;
        return result;
    }
}