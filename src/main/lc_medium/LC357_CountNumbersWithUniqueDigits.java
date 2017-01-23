package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC357_CountNumbersWithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {

        int[] list = new int[n + 2];
        list[0] = 1;
        list[1] = 10;
        // list[2] = 91;

        return helper(n, list);
    }

    private int helper(int n, int[] list) {

        if (list[n] > 0) {
            return list[n];
        } else {
            int count = n - 1;
            int r = 9;
            int res = 9;
            while (count > 1) {
                res *= r - 1;
                r--;
                count--;
            }
            res *= 9;
            list[n] = helper(n - 1, list) + res;
            return list[n];
        }
    }
}
