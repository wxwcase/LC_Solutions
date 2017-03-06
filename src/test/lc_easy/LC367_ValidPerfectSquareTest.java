package test.lc_easy;

import main.lc_easy.LC367_ValidPerfectSquare;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/6/2017.
 */
class LC367_ValidPerfectSquareTest {

    LC367_ValidPerfectSquare sol;

    @BeforeEach
    void setUp() {
        sol = new LC367_ValidPerfectSquare();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void isPerfectSquare() {
        int n1 = 4;
        int n2 = 9;
        int n3 = 16;
        int n4 = 25;
        int n5 = 0;
        int n6 = 1;
        assertTrue(sol.isPerfectSquare(n1));
        assertTrue(sol.isPerfectSquare(n2));
        assertTrue(sol.isPerfectSquare(n3));
        assertTrue(sol.isPerfectSquare(n4));
        assertTrue(sol.isPerfectSquare(n5));
        assertTrue(sol.isPerfectSquare(n6));
    }

    @Test
    void isNotPerfectSquare() {
        int n1 = -1;
        int n2 = 3;
        int n3 = 11;
        int n4 = -4;
        assertFalse(sol.isPerfectSquare(n1));
        assertFalse(sol.isPerfectSquare(n2));
        assertFalse(sol.isPerfectSquare(n3));
        assertFalse(sol.isPerfectSquare(n4));
    }

    @Test
    void failedTestsFirstTime() {
        int n1 = 808201;
        assertTrue(sol.isPerfectSquare(n1));
    }

}