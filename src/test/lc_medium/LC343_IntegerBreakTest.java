package test.lc_medium;

import main.lc_medium.LC343_IntegerBreak;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/23/2017.
 */
class LC343_IntegerBreakTest {

    LC343_IntegerBreak sol = new LC343_IntegerBreak();

    @Test
    void integerBreak2() {
        int n = 2;
        assertEquals(1, sol.integerBreak(n));
    }

    @Test
    void integerBreak3() {
        int n = 3;
        assertEquals(2, sol.integerBreak(n));
    }

    @Test
    void integerBreak10() {
        int n = 10;
        assertEquals(36, sol.integerBreak(n));
    }

    @Test
    void integerBreak41() {
        int n = 41;
        assertEquals(3188646, sol.integerBreak(n));
    }


}