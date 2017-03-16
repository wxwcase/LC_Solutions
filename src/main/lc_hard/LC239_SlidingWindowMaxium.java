package main.lc_hard;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wwang on 3/15/2017.
 */
public class LC239_SlidingWindowMaxium {

    // Solution 1: TreeSet
    // assume 1 <= k <= input
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k >= nums.length) return new int[0];

        int[] res = new int[nums.length - k + 1];

        Deque<Integer> queue = new LinkedList<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.pollLast();
            }
            queue.offer(i);
            if (i > k) {
                res[count++] = nums[queue.peek()];
            }
        }

        return res;
    }
}