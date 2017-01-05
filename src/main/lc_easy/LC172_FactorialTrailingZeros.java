package main.lc_easy;

/**
 * Created by wwang on 1/5/2017.
 */
public class LC172_FactorialTrailingZeros {

    /**
     * Given an integer n, return the # of trailing zeros in n!
     * Solution:
     * T(n) = n / 5 + n / 25 + n / 125 + .... The idea behind this expression is:
     * all the multiples of 5 will contribute one 5, the multiples of 25 will
     * contribute one more 5 and the multiples of 125 will contribute another
     * one more 5... and so on.
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {

        if (n < 5) return 0;
        if (n == 5) return 1;

        return trailingZeroes(n / 5) + n / 5;
    }
}
