package test.lc_easy;

import main.lc_easy.LC189_RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/17/2017.
 */
class LC189_RotateArrayTest {

    LC189_RotateArray sol = new LC189_RotateArray();

    @Test
    void rotate() {
        int[] n = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] r = {5, 6, 7, 1, 2, 3, 4};
        sol.rotate(n, k);
        assertArrayEquals(r, n);
    }

    @Test
    void rotate2() {
        int[] n = {1, 2, 3};
        int k = 1;
        int[] r = {3, 1, 2};
        sol.rotate(n, k);
        assertArrayEquals(r, n);
    }

}