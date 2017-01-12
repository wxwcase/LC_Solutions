package test.lc_easy;

import main.lc_easy.LC400_NthDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/12/2017.
 */
class LC400_NthDigitTest {

    LC400_NthDigit sol = new LC400_NthDigit();

    @Test
    void findNthDigitSingleDigit() {
        int n1 = 1, r1 = 1;
        int n2 = 2, r2 = 2;
        int n3 = 3, r3 = 3;
        int n4 = 6, r4 = 6;
        int n5 = 9, r5 = 9;
        assertEquals(n1, sol.findNthDigit(n1));
        assertEquals(n2, sol.findNthDigit(n2));
        assertEquals(n3, sol.findNthDigit(n3));
        assertEquals(n4, sol.findNthDigit(n4));
        assertEquals(n5, sol.findNthDigit(n5));
    }

    @Test
    void findNthDigitDoubleDigits() {
        int n1 = 10, r1 = 1;
        int n2 = 11, r2 = 0;
        int n3 = 12, r3 = 1;
        int n4 = 15, r4 = 2;
        assertEquals(r1, sol.findNthDigit(n1));
        assertEquals(r2, sol.findNthDigit(n2));
        assertEquals(r3, sol.findNthDigit(n3));
        assertEquals(r4, sol.findNthDigit(n4));
    }

    @Test
    void findNthDigitTrippleDigits() {
        int n1 = 191, r1 = 0;
        int n2 = 222, r2 = 0;
        int n3 = 2300, r3 = 0;
        assertEquals(r1, sol.findNthDigit(n1));
        assertEquals(r2, sol.findNthDigit(n2));
        assertEquals(r3, sol.findNthDigit(n3));
    }

    @Test
    void findNthDigitMoreDigits() {
        int n = 2147483647, r = 2;
        assertEquals(r, sol.findNthDigit(n));
    }

}