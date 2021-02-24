package test.java.ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, second, third));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(9, 9, 6, 11));
    }
}
