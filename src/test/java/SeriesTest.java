import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeriesTest {

    @Test
    public void test0Steps1StartIs1() {
        assertEquals(1.0, Series.series(1, 1, 0));
    }

    @Test
    public void test5Steps1Start2MultIs63() {
        assertEquals(63.0, Series.series(1, 2, 5));
    }

    @Test
    public void test5Steps1Start0MultIs1() {
        assertEquals(1.0, Series.series(1, 0, 5));
    }

    @Test
    public void test5Steps1Start0MultIs4() {
        assertEquals(4.0, Series.series(1, 0, 5));
    }

}
