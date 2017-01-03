package test.lc_easy;

import main.lc_easy.LC70_ClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/3/2017.
 */
class LC70_ClimbingStairsTest {

    LC70_ClimbingStairs sol = new LC70_ClimbingStairs();

    @Test
    void climbZeroStairs() {
        int n = 0;
        assertEquals(0, sol.climbStairs(n));
    }

    @Test
    void climbOneStairs() {
        int n = 1;
        assertEquals(1, sol.climbStairs(n));
    }

    @Test
    void climbTwoStairs() {
        int n = 2;
        assertEquals(2, sol.climbStairs(n));
    }

    @Test
    void climb111Stairs() {
        int n = 111;
        assertEquals(30841243, sol.climbStairs(n));
    }

    @Test
    void climb123Stairs() {
        int n = 123;
        assertEquals(-1973914317, sol.climbStairs(n));
    }

}