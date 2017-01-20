package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC477_TotalMammingDistance {

    /**
     * Input array item of range 0 to 10^9, length of array not exceed 10000
     * Idea
     *  - For single digit like [0, 1, 0], totalHammingDistance is distinctCount(0) * distinctCount(1);
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {

        int res = 0;

        // edge cases
        if (nums == null || nums.length == 0) return res;


        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) == (i << i)) ones++;
            }
            res += (nums.length - ones) * ones;
        }

        return res;
    }
}
