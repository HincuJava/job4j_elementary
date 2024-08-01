package ru.job4j.converter;

public class Converter2 {

    public static int rubleToEuro(float value) {
        return (int) value / 70;
    }

    public static int rubleToDollar(float value) {
        return Math.round(value / 60);
    }

    public static void main(String[] args) {
        float input = 140f;
        float expected = 2f;
        float output = Converter2.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        input = 120f;
        output = Converter2.rubleToDollar(input);
        boolean passed2 = expected == output;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
    }
}