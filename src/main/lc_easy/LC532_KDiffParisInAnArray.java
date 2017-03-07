package main.lc_easy;

import java.util.*;

/**
 * Created by wwang on 3/6/2017.
 */
public class LC532_KDiffParisInAnArray {

    public int findPairs(int[] nums, int k) {

        if (nums == null || nums.length < 2 || k < 0)
            return 0;

        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() > 1)
                    result++;
            } else {
                 if (map.containsKey(entry.getKey() + k))
                     result++;
            }
        }

        return result;
    }

}
