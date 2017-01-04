package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC26_RemoveDuplicatesFromSortedArray {

    /**
     * Do it in place with space O(1)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        int start = 0, end = 1;

        while (end < nums.length) {
            while (end < nums.length && nums[end] == nums[start]) {
                ++end;
            }
            if (end < nums.length) {
                nums[++start] = nums[end++];
            }
        }

        return start + 1;
    }
}
