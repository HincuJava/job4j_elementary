package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[postfix.length - i - 1] != word[word.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}