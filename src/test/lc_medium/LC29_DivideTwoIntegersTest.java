package test.lc_medium;

import main.lc_medium.LC29_DivideTwoIntegers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/16/17.
 */
class LC29_DivideTwoIntegersTest {

    LC29_DivideTwoIntegers sol;

    @BeforeEach
    void setUp() {
        sol = new LC29_DivideTwoIntegers();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void divide1() {
        int n = -2147483648;
        int m = -1;
        int r = 2147483647;
        assertEquals(r, sol.divide(n, m));
    }

    @Test
    void divide2() {
        int n = Integer.MIN_VALUE;
        int m = 1;
        int r = Integer.MIN_VALUE;
        assertEquals(r, sol.divide(n, m));
    }

    @Test
    void divideOneByOne() {
        int n = 1;
        int m = 1;
        int r = 1;
        assertEquals(r, sol.divide(n, m));
    }

}