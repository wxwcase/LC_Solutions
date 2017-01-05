package test.lc_easy;

import main.lc_easy.LC172_FactorialTrailingZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/5/2017.
 */
class LC172_FactorialTrailingZerosTest {

    LC172_FactorialTrailingZeros sol = new LC172_FactorialTrailingZeros();

    @Test
    void trailingZerosFromZero() {
        int n = 0;
        assertEquals(0, sol.trailingZeroes(n));
    }

    @Test
    void trailingZerosFromOne() {
        int n = 1;
        assertEquals(0, sol.trailingZeroes(n));
    }

    @Test
    void trailingZerosFromFive() {
        int n = 5;
        assertEquals(1, sol.trailingZeroes(n));
    }

    @Test
    void trailingZerosFromTen() {
        int n = 10;
        assertEquals(2, sol.trailingZeroes(n));
    }

    @Test
    void trailingZerosFrom15() {
        int n = 15;
        assertEquals(3, sol.trailingZeroes(n));
    }
}