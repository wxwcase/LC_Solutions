package main.lc_easy;

/**
 * Created by wxwcase on 1/12/17.
 */
public class LC414_ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        if (nums.length == 1) return nums[0];

        int a = nums[0], b = nums[0], c = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int d = nums[i];

        }

        return c;
    }
}
