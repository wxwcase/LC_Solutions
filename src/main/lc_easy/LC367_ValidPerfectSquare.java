package main.lc_easy;

/**
 * Created by wwang on 3/6/2017.
 */
public class LC367_ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {

        // base cases
        if (num < 0) return false;
        if (num == 0 || num == 1) return true;

        int lo = 0;
        int hi = num;
        // use long to avoid integer overflow when do multiply
        long mid = lo + (hi - lo) / 2;

        while (lo <= hi) {
            if (mid * mid == num) return true;

            if (mid * mid < num) {
                lo = (int)mid + 1;
            } else if (mid * mid > num) {
                hi = (int)mid - 1;
            }

            mid = lo + (hi - lo) / 2;
        }

        return false;
    }
}
