package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {7, 8, 9}, {1, 0, 3, 2}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}