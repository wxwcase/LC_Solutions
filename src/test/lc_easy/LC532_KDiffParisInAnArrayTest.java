package test.lc_easy;

import main.lc_easy.LC532_KDiffParisInAnArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/6/2017.
 */
class LC532_KDiffParisInAnArrayTest {

    LC532_KDiffParisInAnArray sol;

    @BeforeEach
    void setUp() {
        sol = new LC532_KDiffParisInAnArray();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findPairsK2() {
        int[] n = {3, 1, 4, 1, 5};
        int k = 2;
        assertEquals(2, sol.findPairs(n, k));
    }

    @Test
    void findParisK1() {
        int[] n = {1, 2, 3, 4, 5};
        int k = 1;
        assertEquals(4, sol.findPairs(n, k));
    }

    @Test
    void findParisK0() {
        int[] n = {1, 3, 1, 5, 4};
        int k = 0;
        assertEquals(1, sol.findPairs(n, k));
    }

    @Test
    void findPairsNegative() {
        int[] n = {-1, -2, -3};
        int k = 1;
        assertEquals(2, sol.findPairs(n, k));
    }
}