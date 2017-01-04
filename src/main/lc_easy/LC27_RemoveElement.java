package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC27_RemoveElement {

    public int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0)
            return 0;

        int tail = nums.length - 1;
        int i = 0, count = 0;

        while (tail >= i) {
            while (tail >= i && nums[tail] == val) {
                ++count;
                --tail;
            }

            // swap
            if ((nums[i] == val) && tail > i) {
                int t = nums[i];
                nums[i] = nums[tail];
                nums[tail] = t;
                --tail;
                ++count;
            }
            ++i;
        }

        return nums.length - count;
    }
}
