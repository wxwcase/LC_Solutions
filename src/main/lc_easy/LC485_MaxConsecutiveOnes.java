package main.lc_easy;

/**
 * Created by wxwcase on 3/3/17.
 */
public class LC485_MaxConsecutiveOnes {

    // nums.length > 0
    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0, l = 0, r = 0;

        for (int i = 0; i < nums.length; i++) {
            r++;
             if (nums[i] == 0) {
                 l = r;
             } else {
                 if (r - l > res)
                     res = r - l;
             }
        }

        return res;
    }
}
