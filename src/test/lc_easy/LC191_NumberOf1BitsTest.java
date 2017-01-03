package test.lc_easy;

import main.lc_easy.LC191_NumberOf1Bits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/3/2017.
 */
class LC191_NumberOf1BitsTest {

    LC191_NumberOf1Bits sol = new LC191_NumberOf1Bits();

    @Test
    void zeroOnes() {
        int n = 0;
        assertEquals(0, sol.hammingWeight(n));
    }

    @Test
    void oneOnes() {
        int n = 1;
        assertEquals(1, sol.hammingWeight(n));
    }

    @Test
    void threeOnes() {
        int n = 11;
        assertEquals(3, sol.hammingWeight(n));
    }

    @Test
    void thirtyTwoOnes() {
        int n = -1;
        assertEquals(32, sol.hammingWeight(n));
    }
}