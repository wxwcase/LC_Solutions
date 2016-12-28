package main.lc_easy;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC231_PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n < 1)
            return false;

        int maxexp = (int) (Math.log(Integer.MAX_VALUE) / Math.log(2));
        return Math.pow(2, maxexp) % n == 0;
    }
}
