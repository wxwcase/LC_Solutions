package main.lc_medium;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by wxwcase on 3/26/17.
 */
public class LC215_KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        if (nums == null || nums.length == 0) return 0;

        int smallest = nums[0];

        // find smallest
        if (k > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < smallest) smallest = nums[i];
            }

            return smallest;
        }

        int res = Integer.MIN_VALUE;

        Queue<Integer> q = new PriorityQueue<>();

        for (int i : nums) q.offer(i);

        for (int i = 0; i < nums.length - k + 1; i++) {
            res = q.poll();
        }

        return res;
    }
}
