package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
        double result2 = Point.distance(-4, 2, 8, 10);
        System.out.println("result (-4, 2) to (8, 10) = " + result2);
        double result3 = Point.distance(6, 4, -10, 2);
        System.out.println("result (6, 4) to (-10, 2) = " + result3);
        double result4 = Point.distance(-3, 0, -1, 2);
        System.out.println("result (-3, 0) to (-1, 2) = " + result4);
    }
}
