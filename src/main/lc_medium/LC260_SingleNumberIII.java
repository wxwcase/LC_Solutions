package main.lc_medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/19/2017.
 */
public class LC260_SingleNumberIII {

    /**
     * Idea:
     * XOR all elements to diff, find the last digit that is 1. This means the digit
     * is different between those two numbers. Imagine put all the numbers into two
     * groups, the first with the specified digit set to 0, the other set to 1. Then
     * XOR all elements that set the digit to 0, XOR all elements that set to 1.
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {

        if (nums == null || nums.length < 2) return nums;

        int diff = 0;
        for (int i : nums) {
            diff ^= i;
        }

        // find the last digit the two numbers differs
        // diff &= ~(diff - 1); easier to understand: find last 1 bit.
        diff &= -diff;

        int[] res = {0, 0};

        for (int n : nums) {
            if ((n & diff) == 0) {
                res[0] ^= n;
            } else {
                res[1] ^= n;
            }
        }

        return res;
    }
}
