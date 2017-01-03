package test.lc_easy;

import main.lc_easy.LC231_PowerOfTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/28/2016.
 */
class LC231_PowerOfTwoTest {

    LC231_PowerOfTwo sol = new LC231_PowerOfTwo();

    @Test
    void isPowerOfTwo() {
        int[] input = {
                1, 2, 4, 8, 16, 32, 64, 128, 256
        };
        for (int i : input) {
            assertTrue(sol.isPowerOfTwo(i));
        }
    }

    @Test
    void isNotPowerOfTwo() {
        int[] input = {
                0, 3, 9, 99, 999
        };
        for (int i : input) {
            assertFalse(sol.isPowerOfTwo(i));
        }
    }

}