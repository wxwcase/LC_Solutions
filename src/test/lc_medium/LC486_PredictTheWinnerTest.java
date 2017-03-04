package test.lc_medium;

import main.lc_medium.LC486_PredictTheWinner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/27/2017.
 */
class LC486_PredictTheWinnerTest {

    LC486_PredictTheWinner sol = new LC486_PredictTheWinner();

    @Test
    void predictFalse() {
        int[] a = {1, 5, 2};
        assertFalse(sol.PredictTheWinner(a));
    }

    @Test
    void predictTrue() {
        int[] a = {1, 5, 233, 7};
        assertTrue(sol.PredictTheWinner(a));
    }

}