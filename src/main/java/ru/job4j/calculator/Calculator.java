package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimesTwo = four * two;
        System.out.println("One plus two: " + onePlusTwo);
        System.out.println("Six div two: " + sixDivTwo);
        System.out.println("Five minus two: " + fiveMinusTwo);
        System.out.println("Four times two: " + fourTimesTwo);
        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);
    }
}
