package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double minAndDivide(double first, double second) {
        return minus(first, second)
        + divide(first, second);

    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
        + minus(first, second) + divide(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета один равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета два равен: " + minAndDivide(10, 20));
        System.out.println("Результат расчета три равен: " + sumAll(10, 20));

    }
}
