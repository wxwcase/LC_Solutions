package test.lc_easy;

import main.lc_easy.LC7_ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/17/2017.
 */
class LC7_ReverseIntegerTest {

    LC7_ReverseInteger sol = new LC7_ReverseInteger();

    @Test
    void reversePositive() {
        int n = 123;
        int r = 321;
        assertEquals(r, sol.reverse(n));

        int n2 = 1534236469;
        int r2 = 0;
        assertEquals(r2, sol.reverse(n2));

        int n3 = 102;
        int r3 = 201;
        assertEquals(r3, sol.reverse(n3));
    }

    @Test
    void reverseNegative() {
        int n = -123;
        int r = -321;
        assertEquals(r, sol.reverse(n));
    }

}