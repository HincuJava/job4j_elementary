package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[data.length - 1]) {
                result = false;
            }
        }
        return result;
    }
}