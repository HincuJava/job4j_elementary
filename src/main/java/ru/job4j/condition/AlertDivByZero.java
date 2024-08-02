package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Нельзя делить на ноль.");
        }
        if (number < 0) {
            System.out.println("Это число меньше нуля.");
        }
        if (number > 0) {
            System.out.println("Делить можно.");
        }

        }

        public static void main(String[] args) {
        AlertDivByZero.checkNumber(5);
        AlertDivByZero.checkNumber(0);
        AlertDivByZero.checkNumber(-1);
        }
    }


