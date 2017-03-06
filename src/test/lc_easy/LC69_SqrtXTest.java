package test.lc_easy;

import main.lc_easy.LC69_SqrtX;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/6/2017.
 */
class LC69_SqrtXTest {

    LC69_SqrtX sol;

    @BeforeEach
    void setUp() {
        sol = new LC69_SqrtX();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void mySqrtNotPerfectSquare() {
        int n3 = 2;
        int n6 = 17;
        assertEquals(1, sol.mySqrt(n3));
        assertEquals(4, sol.mySqrt(n6));
    }

    @Test
    void mySqrtNegative() {
        int n = -1;
        assertEquals(n, sol.mySqrt(n));
    }

    @Test
    void mySqrtPerfectSquare() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 4;
        int n4 = 16;
        assertEquals(0, sol.mySqrt(n1));
        assertEquals(1, sol.mySqrt(n2));
        assertEquals(2, sol.mySqrt(n3));
        assertEquals(4, sol.mySqrt(n4));
    }

}