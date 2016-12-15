package test.lc_easy;

import main.lc_easy.LC371_SumOf2Ints;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC371_SumOf2IntsTest {

    LC371_SumOf2Ints sol;

    @BeforeEach
    void setUp() {
        sol = new LC371_SumOf2Ints();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void getSum1and2() {
        int a = 1, b = 2;
        assertEquals(3, sol.getSum(a, b));
    }

    @Test
    void getSum10and21() {
        int a = 10, b = 21;
        assertEquals(31, sol.getSum(a, b));
    }

    @Test
    void getSumTwoZeros() {
        int a = 0, b = 0;
        assertEquals(0, sol.getSum(a, b));
    }

}