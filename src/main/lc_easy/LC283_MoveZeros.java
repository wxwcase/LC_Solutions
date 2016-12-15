package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC283_MoveZeros {

    public void moveZeros(int[] nums) {

        int top = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[top++] = nums[i];
            }
        }

        while (top < nums.length) {
            nums[top++] = 0;
        }
    }
}
