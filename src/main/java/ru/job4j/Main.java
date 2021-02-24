package ru.job4j;

import test.java.ru.job4j.converter.Converter;

public class Main {
    public static void main(String[] args) {
        int in2 = 180;
        int expected2 = 3;
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        boolean passed2 = Converter.rubleToDollar(in2) == expected2;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("180 rubles are 2 dollars. Test result : " + passed2);
    }
}