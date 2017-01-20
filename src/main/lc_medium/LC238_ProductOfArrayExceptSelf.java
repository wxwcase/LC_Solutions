package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC238_ProductOfArrayExceptSelf {

    /**
     * Brute force: TLE
     * @param nums
     * @return
     */
    public int[] productExceptSelfBF(int[] nums) {

        if (nums == null || nums.length == 0) return new int[]{};

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int mul = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    mul *= nums[j];
                }
            }
            res[i] = mul;
        }

        return res;
    }

    /**
     * Assume nums.length > 1
     * Requirement:
     * Space: O(1)
     * Time: O(n)
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        // running multiplication from left
        int nxt = 1;
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // running multiplication from right
        int pst = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] = pst * res[i];
            pst = nums[i] * pst;
        }

        return res;
    }
}
