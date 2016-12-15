package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }

        return result;
    }
}
