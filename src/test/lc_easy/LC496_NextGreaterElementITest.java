package test.lc_easy;

import main.lc_easy.LC496_NextGreaterElementI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/3/17.
 */
class LC496_NextGreaterElementITest {

    LC496_NextGreaterElementI sol;

    @BeforeEach
    void setUp() {
        sol = new LC496_NextGreaterElementI();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void testThreeElements() {

        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};

        assertArrayEquals(new int[] {-1, 3, -1}, sol.nextGreaterElement(num1, num2));
    }

    @Test
    void testTwoElements() {

        int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};

        assertArrayEquals(new int[]{3, -1}, sol.nextGreaterElement(num1, num2));
    }

    @Test
    void testBinarySearch() {
        int[] a1 = {1, 2, 3, 4, 5};
        assertEquals(3, sol.binarySearch(a1, 4));
        assertEquals(-1, sol.binarySearch(a1, 9));
        assertEquals(0, sol.binarySearch(a1, 1));
    }

}