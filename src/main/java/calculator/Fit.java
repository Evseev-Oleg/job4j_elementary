package calculator;

public class Fit {
    public static double manWeight(short height) {
        return (double) (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (double) (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 170;
        System.out.println("Man " + height + " is " + Fit.manWeight(height));
        System.out.println("Woman " + height + " is " + Fit.womanWeight(height));
    }
}
