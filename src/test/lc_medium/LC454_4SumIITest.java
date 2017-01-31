package test.lc_medium;

import main.lc_medium.LC454_4SumII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/25/2017.
 */
class LC454_4SumIITest {

    LC454_4SumII sol = new LC454_4SumII();

    @Test
    void test4SumCount() {
        int[] A = {1, 2}, B = {-2, -1}, C = {-1, 2}, D = {0, 2};
        int r = 2;
        assertEquals(r, sol.fourSumCount(A, B, C, D));
    }

    @Test
    void testBinarySearch() {
        int[] arr = {1, 2, 6, 8, 9};
        int v1 = 8, r1 = 3;
        int v2 = 1, r2 = 0;
        int v3 = 9, r3 = 4;
        assertEquals(r1, LC454_4SumII.binarySearch(arr, v1));
        assertEquals(r2, LC454_4SumII.binarySearch(arr, v2));
        assertEquals(r3, LC454_4SumII.binarySearch(arr, v3));
    }

    @Test
    void testBinarySearchNotExist() {
        int[] arr = {1, 2, 3, 4};
        int v = 10, r = -1;
        assertEquals(r, LC454_4SumII.binarySearch(arr, v));
    }

}