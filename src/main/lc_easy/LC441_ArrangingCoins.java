package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC441_ArrangingCoins {

    /**
     * n is a non-negative signed integer fits into 32 bit
     * @param n
     * @return
     */
    public int arrangeCoins(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int i = 0;
        while (n > 0) {
            if (n >= i)
                n -= i++;
            else
                break;
        }

        return --i;
    }
}
