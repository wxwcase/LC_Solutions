package test.lc_medium;

import main.lc_medium.LC357_CountNumbersWithUniqueDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/20/2017.
 */
class LC357_CountNumbersWithUniqueDigitsTest {

    LC357_CountNumbersWithUniqueDigits sol = new LC357_CountNumbersWithUniqueDigits();

    @Test
    void countNumbersWithUniqueDigitsZero() {
        int n1 = 0;
        int n2 = 1;
        assertEquals(0, sol.countNumbersWithUniqueDigits(n1));
        assertEquals(10, sol.countNumbersWithUniqueDigits(n2));
    }

    @Test
    void countNumbersWithUniqueDigits() {
        int n = 2;
        assertEquals(91, sol.countNumbersWithUniqueDigits(n));
    }
}