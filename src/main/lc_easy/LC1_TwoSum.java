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
}
