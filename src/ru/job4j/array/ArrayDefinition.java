package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages:" + ages.length + ". Размер массива surname:"
        + surnames.length + ". Размер массива prices:" + prices.length + ".");
    }
}
