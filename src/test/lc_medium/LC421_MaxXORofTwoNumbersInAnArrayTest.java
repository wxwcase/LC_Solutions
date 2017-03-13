package test.lc_medium;

import main.lc_medium.LC421_MaxXORofTwoNumbersInAnArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/12/17.
 */
class LC421_MaxXORofTwoNumbersInAnArrayTest {

    LC421_MaxXORofTwoNumbersInAnArray sol;

    @BeforeEach
    void setUp() {
        sol = new LC421_MaxXORofTwoNumbersInAnArray();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findMaximumXOR() {
        int[] n = {8, 10, 2};
        assertEquals(10, sol.findMaximumXOR(n));
    }

    @Test
    void findMaximumXOR2() {
        int[] n = {3, 10, 5, 25, 2, 8};
        assertEquals(28, sol.findMaximumXOR(n));
    }

}