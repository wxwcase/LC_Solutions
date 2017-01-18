package main.lc_easy;

import java.util.ArrayList;

/**
 * Created by wwang on 1/17/2017.
 */
public class LC189_RotateArray {

    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length == 0) return;

        int len = nums.length;
        if (k > len) k %= len;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(nums[(i + len - k) % len]);
        }

        for (int i = 0; i < len; i++) {
            nums[i] = list.get(i);
        }
    }
}
