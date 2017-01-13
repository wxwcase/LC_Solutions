package test.lc_easy;

import main.lc_easy.LC414_ThirdMaximumNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 1/12/17.
 */
class LC414_ThirdMaximumNumberTest {

    LC414_ThirdMaximumNumber sol = new LC414_ThirdMaximumNumber();

    @Test
    void thirdMax() {
        int[] n = {3, 2, 1};
        int r = 1;
        assertEquals(r, sol.thirdMax(n));
    }

    @Test
    void thirdMax2() {
        int[] n = {1, 2};
        int r = 2;
        assertEquals(r, sol.thirdMax(n));
    }

    @Test
    void thirdMax3() {
        int[] n = {2, 2, 3, 1};
        int r = 1;
        assertEquals(r, sol.thirdMax(n));
    }

}