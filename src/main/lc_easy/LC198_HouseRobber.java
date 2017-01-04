package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC198_HouseRobber {

    /**
     *
     * @param nums non-negative integer array
     * @return
     */
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int[] cache = new int[nums.length];

        cache[0] = nums[0];
        cache[1] = Math.max(nums[0], nums[1]);

        if (nums.length == 2)
            return cache[1];

        for (int i = 2; i < nums.length; i++) {
            cache[i] = Math.max(nums[i] + cache[i - 2], cache[i - 1]);
        }

        return cache[nums.length - 1];
    }
}
