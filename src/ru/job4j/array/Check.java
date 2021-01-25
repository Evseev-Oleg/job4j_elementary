package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean datum : data) {
            if (result != datum) {
                result = !result;
                break;
            }
        }
        return result;
    }
}
