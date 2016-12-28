package test.lc_easy;

import main.lc_easy.LC326_PowerOfThree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/28/2016.
 */
class LC326_PowerOfThreeTest {

    LC326_PowerOfThree sol;

    @BeforeEach
    void setUp() {
        sol = new LC326_PowerOfThree();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void isNotPowerOfThree() {
        int[] input = {
            0, 2, 10, 20, 100
        };
        for (int i = 0; i < input.length; i++) {
            assertFalse(sol.isPowerOfThree(input[i]));
        }
    }

    @Test
    void isPowerOfThree() {
        int[] input = {
            1, 3, 9, 27, 81, 243
        };
        for (int i = 0; i < input.length; i++) {
            assertTrue(sol.isPowerOfThree(input[i]));
        }
    }

}