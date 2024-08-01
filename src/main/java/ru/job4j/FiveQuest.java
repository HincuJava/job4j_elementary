package ru.job4j;

public class FiveQuest {
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);
        // 1 ПОТЕРЯ привышение байта

        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short result = (short) (f + i);
        System.out.println(result);
        // 2 Потеря - целлостные числа

        // 3 выражение
        char c = 45000;
        float i = c;
        System.out.println(i);
        // 3 Потеря float-> char

        // 4 выражение
        double d = 121.19;
        byte b = (byte) d;
        System.out.println(b);
        // 4 Потеря байт->дабл

        // 5 выражение
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println(d);
        // 5 Без потерь, но почему!?
    }
}
