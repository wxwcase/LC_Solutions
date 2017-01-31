package main.lc_medium;

/**
 * Created by wwang on 1/23/2017.
 */
public class LC343_IntegerBreak {

    /**
     * Tag: DP, math
     * @param n: 2 <= n <= 58
     * @return
     */
    public int integerBreak(int n) {

        if (n < 3) return 1;
        if (n == 3) return 2;

        int threes = 0;
        int res = 1;
        while (n > 4) {
            n -= 3;
            threes++;
            res *= 3;
        }
        res *= n;

        return res;
    }
}
