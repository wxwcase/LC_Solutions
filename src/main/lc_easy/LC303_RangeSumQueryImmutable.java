package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 1/16/2017.
 */
public class LC303_RangeSumQueryImmutable {

    static class NumArray {

        Map<Integer, Integer> sumMap = new HashMap<>();
        int[] numbers;

        public NumArray(int[] nums) {

            numbers = nums;

            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                sumMap.put(i, sum);
            }
        }

        public int sumRange(int i, int j) {
            return sumMap.get(j) - sumMap.get(i) + numbers[i];
        }
    }
}


