package test.lc_hard;

import main.lc_hard.LC239_SlidingWindowMaxium;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/15/2017.
 */
class LC239_SlidingWindowMaxiumTest {

    LC239_SlidingWindowMaxium sol;

    @BeforeEach
    void setUp() {
        sol = new LC239_SlidingWindowMaxium();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void maxSlidingWindow() {
        int[] n = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] r = {3, 3, 5, 5, 6, 7};
        int k = 3;
        assertArrayEquals(r, sol.maxSlidingWindow(n, k));
    }

    @Test
    void maxSlidingWindow2() {
        int[] n = {2, 4, 7};
        int[] r = {4, 7};
        int k = 2;
        assertArrayEquals(r, sol.maxSlidingWindow(n, k));
    }

    @Test
    void maxSlidingWindow3() {
        int[] n = {7, 2, 4};
        int[] r = {7, 4};
        int k = 2;
        assertArrayEquals(r, sol.maxSlidingWindow(n, k));
    }

    @Test
    void maxSlidingWindow4() {
        int[] n = {-7, -8, 7, 5, 7, 1, 6, 0};
        int[] r = {7, 7, 7, 7, 7};
        int k = 4;
        assertArrayEquals(r, sol.maxSlidingWindow(n, k));
    }

}