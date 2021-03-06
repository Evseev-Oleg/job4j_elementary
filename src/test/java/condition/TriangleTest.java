package condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist1ThenTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenExist2ThenFalse() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }
}