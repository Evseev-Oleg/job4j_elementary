package test.java.ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when109() {
        boolean rsl = CheckPrimeNumber.check(109);
        assertThat(rsl, is(true));
    }

    @Test
    public void when223() {
        boolean rsl = CheckPrimeNumber.check(222);
        assertThat(rsl, is(false));
    }

    @Test
    public void when811() {
        boolean rsl = CheckPrimeNumber.check(811);
        assertThat(rsl, is(true));
    }
}