package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC167_TwoSumII_InputArrayIsSroted {

    public int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];

        // edge cases
        if (numbers == null || numbers.length < 2) return res;

        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int t = numbers[start] + numbers[end];
            if (t < target) {
                start++;
            } else if (t > target) {
                end--;
            } else {
                res[0] = start + 1;
                res[1] = end + 1;
                return res;
            }
        }

        return res;
    }
}
