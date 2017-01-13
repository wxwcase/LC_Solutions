package test.lc_easy;

import main.lc_easy.LC190_ReverseBits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/12/2017.
 */
class LC190_ReverseBitsTest {

    LC190_ReverseBits sol = new LC190_ReverseBits();

    @Test
    void reverseBits() {
        int n = 1;
        long r = 2147483648L;
        assertEquals(r, sol.reverseBits(n));
    }

}