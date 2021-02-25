package condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when10to00then2() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to00then2() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to34then2() {
        double expected = 1;
        Point a = new Point(1, 1, 0);
        Point b = new Point(0, 1, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when920to011then9() {
        double expected = 9.11;
        Point a = new Point(9, 2, 0);
        Point b = new Point(0, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}