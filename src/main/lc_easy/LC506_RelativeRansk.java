package main.lc_easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxwcase on 3/5/17.
 */
public class LC506_RelativeRansk {

    public String[] findRelativeRanks(int[] nums) {

        String[] res = new String[nums.length];

        if (nums == null || nums.length == 0)
            return res;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                res[map.get(nums[i])] = "Gold Medal";
            } else if (i == nums.length - 2) {
                res[map.get(nums[i])] = "Silver Medal";
            } else if (i == nums.length - 3) {
                res[map.get(nums[i])] = "Bronze Medal";
            } else {
                res[map.get(nums[i])] = nums.length - i + "";
            }
        }

        return res;
    }
}
