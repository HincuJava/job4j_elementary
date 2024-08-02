package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double result = k * Math.pow(p / (2 * (k + 1)), 2);
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        double result2 = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = RectangleArea.square(5, 1);
        System.out.println(" p = 5, k = 1, s = 1.56, real = " + result3);
    }
}
