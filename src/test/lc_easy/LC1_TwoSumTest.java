package test.lc_easy;

import main.lc_easy.LC14_LongestCommonPrefix;
import main.lc_easy.LC171_ExcelSheetColNumber;
import main.lc_easy.LC1_TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/12/2017.
 */
class LC1_TwoSumTest {

    LC1_TwoSum sol = new LC1_TwoSum();

    @Test
    void twoSum() {
        int[] n = {0, 4, 3, 0}, r = {0, 3};
        int t = 0;
        int[] actual = sol.twoSum(n, t);
        Arrays.sort(r);
        Arrays.sort(actual);
        assertArrayEquals(r, actual);
    }

    @Test
    void twoSum2() {
        int[] n = {2, 7, 11, 15};
        int target = 9;
        int[] r = {0, 1};
        assertArrayEquals(r, sol.twoSum(n, target));
    }

}