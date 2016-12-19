package main.lc_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxwcase on 12/18/16.
 */
public class LC217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }

}
