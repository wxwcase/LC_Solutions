package test.lc_easy;

import main.lc_easy.LC453_MinMoves2EqualArrayElements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC453_MinMoves2EqualArrayElementsTest {

    LC453_MinMoves2EqualArrayElements sol;

    @BeforeEach
    void setUp() {
        sol = new LC453_MinMoves2EqualArrayElements();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void minMovesExample1() {
        int[] a = {1, 2, 3};
        assertEquals(3, sol.minMoves(a));
    }

    @Test
    void minMovesSameArrayElements() {
        int[] a = {0}, b = {0, 0}, c = {1, 1, 1, 1};
        assertEquals(0, sol.minMoves(a));
        assertEquals(0, sol.minMoves(b));
        assertEquals(0, sol.minMoves(c));
    }

}