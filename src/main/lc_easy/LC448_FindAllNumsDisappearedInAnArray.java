package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * !!!
 * Created by wwang on 12/21/2016.
 */
public class LC448_FindAllNumsDisappearedInAnArray {

    /**
     * Requirements: time: O(n), space: O(1) (except for result List).
     * Input: [4, 3, 2, 7, 8, 2, 3, 1]
     * Output: [5, 6]
     * @param nums input array
     * @return list containing the missing element.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> lst = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                lst.add(i + 1);
            }
        }

        return lst;
    }

}
