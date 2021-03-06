package condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfMeter = (a + b + c) / 2;
        return Math.sqrt(halfMeter * (halfMeter - a) * (halfMeter - b) * (halfMeter - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
