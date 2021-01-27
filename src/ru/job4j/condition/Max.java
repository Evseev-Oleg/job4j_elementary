package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int tmp = first > second ? first : second;
        return third > tmp ? third : tmp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp1 = first > second ? first : second;
        int tmp2 = third > tmp1 ? third : tmp1;
        return fourth > tmp2 ? fourth : tmp2;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(9, 9, 6, 11));
    }
}
