package test.java.ru.job4j.array;

import org.junit.Test;
import test.java.ru.array.SortSelected;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5Number() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Number() {
        int[] input = new int[] {8, -12, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-12, 1, 8};
        assertThat(result, is(expect));
    }
}