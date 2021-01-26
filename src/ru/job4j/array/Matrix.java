package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 9; i++) {
//            System.out.println("\n");
//            for (int j = 0; j < 9; j++) {
//                System.out.print(multiple(9)[i][j] + " ");
//            }
//        }
//
//    }
}
