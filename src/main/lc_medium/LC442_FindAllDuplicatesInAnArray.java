package main.lc_medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/19/2017.
 */
public class LC442_FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new LinkedList<>();

        for (int n : nums) {
            if (nums[Math.abs(n) - 1] < 0) {
                res.add(Math.abs(n));
            } else {
                nums[Math.abs(n) - 1] *= -1;
            }
        }

        return res;
    }

    public List<Integer> findDuplicatesSwap(int[] nums) {

        List<Integer> res = new LinkedList<>();

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = tmp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) res.add(j);
        }

        return res;
    }
}
