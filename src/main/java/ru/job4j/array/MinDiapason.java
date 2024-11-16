package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish){
        int min = array[start];
        for (int i = array[start]; i < array[finish]; i++){
            for (int index = 1; index < array.length; index++){
                if (array[index] < min){
                    array[index] = min;
                }
            }
        }
        return min;
    }
}
