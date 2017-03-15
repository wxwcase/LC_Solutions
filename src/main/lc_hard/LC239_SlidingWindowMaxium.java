package main.lc_hard;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wwang on 3/15/2017.
 */
public class LC239_SlidingWindowMaxium {

    // Solution 1: TreeSet
    // assume 1 <= k <= input
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length < 1 || k == 1) return nums;

        int[] res = new int[nums.length - k + 1];

        int m = 0;

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            boolean r = set.add(nums[i]);
            if (i >= k) {
                System.out.println("Removing: " + nums[i - k]);
                set.remove(nums[i - k]);
                System.out.println("Max: " + set.last() + ", Min: " + set.first());
            }
            if (i + 1 >= k) {
                System.out.println(set.last());
                res[m++] = set.last();
            }
        }


        return res;
    }
}