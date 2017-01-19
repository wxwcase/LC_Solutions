package main.lc_medium;

import java.util.Arrays;

/**
 * Created by wwang on 1/19/2017.
 */
public class LC462_MinimumMoves2EqualArrayElementsII {

    public int minMoves2(int[] nums) {

        if (nums == null || nums.length < 2) return 0;

        Arrays.sort(nums);

        // find medium
        int mid = nums[nums.length / 2];
        int res = 0;

        for (int i : nums) {
            res += Math.abs(i - mid);
        }

        return res;
    }
}
