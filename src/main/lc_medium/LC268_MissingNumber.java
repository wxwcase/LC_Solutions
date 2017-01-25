package main.lc_medium;

/**
 * Created by wwang on 1/25/2017.
 */
public class LC268_MissingNumber {

    public int missingNumber(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int len = nums.length;
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        return len * (len + 1) / 2 - sum;
    }
}
