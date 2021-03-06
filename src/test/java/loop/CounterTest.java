package loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromFiveToFifteenThenThirty() {
        int rsl = Counter.sumByEven(5, 15);
        int expected = 50;
        assertThat(rsl, is(expected));
    }
}

