package main.lc_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC219_ContainsDuplicateII {

    /**
     * ---------------------------------------------------------------------------
     * Given an array of integers and an integer k, find out whether
     * there are two distinct indices i and j in the array such that
     * nums[i] = nums[j] and the absolute difference between i and j is at most k.
     * ---------------------------------------------------------------------------
     * Idea: Sliding window.
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length < 2)
            return false;

        int left = 0, right = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            if (map.containsKey(nums[right])) {
                return true;
            } else {
                map.put(nums[right], right);
            }
            right++;

            if (right - left == k + 1) {
                map.remove(nums[left++]);
            }
        }

        return false;
    }

    // More efficient
    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
