package main.lc_medium;

/**
 * Created by wxwcase on 3/12/17.
 */
public class LC421_MaxXORofTwoNumbersInAnArray {

    // assume array non-empty
    public int findMaximumXOR(int[] nums) {

        // find max item
        int max = nums[0];
        for (int i : nums) {
            if (i > max) max = i;
        }

        // find max xor
        int xor = 0;
        for (int i : nums) {
            if ((max ^ i) > xor) xor = max ^ i;
        }

        return xor;
    }
}
