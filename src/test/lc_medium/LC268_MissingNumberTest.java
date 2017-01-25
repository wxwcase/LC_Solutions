package test.lc_medium;

import main.lc_medium.LC268_MissingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/25/2017.
 */
class LC268_MissingNumberTest {

    LC268_MissingNumber sol = new LC268_MissingNumber();

    @Test
    void missingNumber() {
        int[] n = {0, 1, 3};
        int m = 2;
        assertEquals(m, sol.missingNumber(n));
    }

}