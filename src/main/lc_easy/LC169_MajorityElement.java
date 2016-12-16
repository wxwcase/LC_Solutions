package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC169_MajorityElement {

    /**
     * Assume array is non-empty and the majority element exist.
     * @param nums input array.
     * @return the majority element.
     */
    public int majorityElement(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int idx = nums[0];
        int cnt = map.get(idx);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int index = entry.getKey();
            int val = map.get(index);
            if (val > cnt) {
                cnt = val;
                idx = index;
            }
        }

        return idx;
    }
}
