package main.lc_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 1/12/2017.
 */
public class LC1_TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        if (nums == null || nums.length == 0) return res;

        // {left: index}
        Map<Integer, Integer> map = new HashMap<>();

        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                res[0] = map.get(remain);
                res[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return res;
    }

    // Follow-up: duplicates: find all candidate index pairs

    // http://www.sigmainfy.com/blog/two-sum-problem-analysis-3-handling-duplicates-input.html
    // Well, as we need to return all the possible index pairs (i, j) such that A[i] + A[j] = target,
    // in the worst extreme case: say the array consists of 100 elements all of which are the same
    // value 1, and the target is 2, it is obvious all the index pair (1, 2), (1, 3) … (1, 100),
    // (2, 3)… (2, 100) …… (99, 100) are our answers, the number of such pair is O(N^2), this means,
    // we at least need O(N^2) time even to form such pairs. Based on this fact, I conclude that in
    // this different context we are asked to return all possible index pairs, no amazing algorithms
    // or techniques could guarantee the worst time complexity better than O(N^2).
}
