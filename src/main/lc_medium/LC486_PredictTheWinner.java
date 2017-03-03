package main.lc_medium;

/**
 * Created by wwang on 1/27/2017.
 */
public class LC486_PredictTheWinner {

    /**
     * 1 <= nums.len <= 20
     * Integer in array will less than 10,000,000 and is non-negative.
     * @param nums
     * @return
     */
    public boolean PredictTheWinner(int[] nums) {

        int max = 0;

        int start = 0, end = nums.length - 1;

        while (start < end) {

            // process either ends
            if (nums[start] > nums[end]) {
                max += nums[start];
                start++;
            } else {
                max += nums[end];
                end--;
            }

            // process opponent
            if (start < end) {
                if (nums[start] > nums[end]) {
                    max -= nums[start];
                    start++;
                } else {
                    max -= nums[end];
                    end--;
                }
           }

        }

        return max > 0;
    }
}
