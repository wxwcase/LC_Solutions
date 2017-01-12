package test.lc_easy;

import main.lc_easy.LC396_RotateFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/12/2017.
 */
class LC396_RotateFunctionTest {

    LC396_RotateFunction sol = new LC396_RotateFunction();

    @Test
    void maxRotateFunction() {
        int[] A = {1, 2, 3, 4, 5};
        int r = 40;
        assertEquals(r, sol.maxRotateFunction(A));
    }

}