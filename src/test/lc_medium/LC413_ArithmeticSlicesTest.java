package test.lc_medium;

import main.lc_medium.LC413_ArithmeticSlices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/19/2017.
 */
class LC413_ArithmeticSlicesTest {

    LC413_ArithmeticSlices sol = new LC413_ArithmeticSlices();

    @Test
    void numberOfArithmeticSlices() {
        int[] A = {1, 2, 3,4};
        int r = 3;
        assertEquals(r, sol.numberOfArithmeticSlices(A));
    }

}