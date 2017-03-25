package main.lc_medium;

/**
 * Created by wxwcase on 3/24/17.
 */
public class LC209_MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int minLen = nums.length;

        boolean found = false;

        int start = 0, end = 0;

        int sum = 0;

        while (end < nums.length) {
            while (sum < s && end < nums.length) {
                sum += nums[end++];
            }
            if (sum >= s && end - start <= minLen) {
                found = true;
                minLen = end - start;
            }
            while (sum >= s) {
                sum -= nums[start++];
                if (start > end) end = start;
            }
            if (end - start + 1 <= minLen) {
                found = true;
                minLen = end - start + 1;
            }
        }

        return found ? minLen : 0;
    }
}
