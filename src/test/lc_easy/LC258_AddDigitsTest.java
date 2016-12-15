package test.lc_easy;

import main.lc_easy.LC258_AddDigits;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC258_AddDigitsTest {

    LC258_AddDigits sol;

    @BeforeEach
    void setUp() {
        sol = new LC258_AddDigits();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void addDigitsZero() {
        assertEquals(0, sol.addDigits(0));
    }

    @Test
    void addDigitsLessThanTen() {
        int a = 1, b = 3, c = 9;
        assertEquals(a, sol.addDigits(a));
        assertEquals(b, sol.addDigits(b));
        assertEquals(c, sol.addDigits(c));
    }

    @Test
    void addDigitsMoreThanTenAndDivisibleByNine() {
        int a = 18, b = 27, c = 189;
        assertEquals(9, sol.addDigits(a));
        assertEquals(9, sol.addDigits(b));
        assertEquals(9, sol.addDigits(c));
    }

    @Test
    void addDigitsMoreThanTenAndNotDivisibleByNine() {
        int a = 17, b = 28, c = 191;
        assertEquals(8, sol.addDigits(a));
        assertEquals(1, sol.addDigits(b));
        assertEquals(2, sol.addDigits(c));
    }
}