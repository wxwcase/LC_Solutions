package test.lc_medium;

import main.lc_medium.LC378_KthSmallestElementInASortedMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/25/2017.
 */
class LC378_KthSmallestElementInASortedMatrixTest {

    LC378_KthSmallestElementInASortedMatrix sol = new LC378_KthSmallestElementInASortedMatrix();

    @Test
    void kthSmallest3by3() {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        assertEquals(13, sol.kthSmallest(matrix, k));
        assertEquals(13, sol.kthSmallestPriorityQueue(matrix, k));
    }

    @Test
    void kthSmallest1by1() {
        int[][] matrix = {
                {-5}
        };
        int k = 1;
        assertEquals(-5, sol.kthSmallest(matrix, k));
        assertEquals(-5, sol.kthSmallestPriorityQueue(matrix, k));
    }

    @Test
    void kthSmallest2by2() {
        int[][] matrix = {
                {1, 2},
                {1, 3}
        };
        int k = 2;
        assertEquals(1, sol.kthSmallest(matrix, k));
        assertEquals(1, sol.kthSmallestPriorityQueue(matrix, k));
    }

}