package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
    return left >= right ? left : right;
    }

    public static int max(int left, int right, int x) {
        //int a = left >= right ? left : right;
         //int b = a >= x ? a : x;
         //return b;
        return max(max(left, right), x);
    }

    public static int max(int left, int right, int x, int c) {
        return max(max(left, right, x), c);
    }

    public static void main(String[] args) {
        int answer = max(22, 22);
        System.out.println(answer);
    }
}
