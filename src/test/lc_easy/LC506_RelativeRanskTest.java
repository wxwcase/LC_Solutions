package test.lc_easy;

import main.lc_easy.LC506_RelativeRansk;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/5/17.
 */
class LC506_RelativeRanskTest {

    LC506_RelativeRansk sol;

    @BeforeEach
    void setUp() {
        sol = new LC506_RelativeRansk();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void test01() {
        int[] n = {10, 3, 8, 9, 4};
        String[] r = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertArrayEquals(r, sol.findRelativeRanks(n));
    }

    @Test
    void test02() {
        int[] n = {5, 4, 3, 2, 1};
        String[] r = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assertArrayEquals(r, sol.findRelativeRanks(n));
    }

}