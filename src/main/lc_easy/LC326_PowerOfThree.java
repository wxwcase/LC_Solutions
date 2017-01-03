package main.lc_easy;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC326_PowerOfThree {

    public boolean isPowerOfThree(int n) {

        if (n < 1)
            return false;

        int maxexp = (int)(Math.log(Integer.MAX_VALUE) / Math.log(3));
        return Math.pow(3, maxexp) % n == 0;
    }
}
