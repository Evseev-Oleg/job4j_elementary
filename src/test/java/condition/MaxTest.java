package condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxBetween2And1And8Then8() {
        int result = Max.max(2, 1, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMaxBetween2And2And2And2Then2() {
        int result = Max.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}