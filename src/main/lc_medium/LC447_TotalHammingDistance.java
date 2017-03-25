package main.lc_medium;

/**
 * Created by wxwcase on 3/24/17.
 */
public class LC447_TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {

        if (nums == null) return 0;

        int res = 0;

        int len = nums.length;

        for (int i = 0; i < 31; i++) {
            int numOfOne = 0;
            for (int j = 0; j < len; j++) {
                if ((nums[j] & 1) == 1) {
                    numOfOne++;
                }
                nums[j] >>= 1;
            }
            res += (len - numOfOne) * numOfOne;
        }

        return res;
    }
}
