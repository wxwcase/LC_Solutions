package main.lc_easy;

/**
 * Created by wwang on 3/6/2017.
 */
public class LC69_SqrtX {

    public int mySqrt(int x) {

        if (x < 0)
            return x;

        if (x == 0) return 0;
        if (x == 1) return 1;

        int lo = 0;
        int hi = x;
        long mid = lo + (hi - lo) / 2;
        while (lo <= hi) {
            if ((mid * mid == x) ||
                    ((mid * mid < x) && ((mid + 1) * (mid + 1) > x)))
                return (int)mid;
            if (mid * mid < x) {
                lo = (int)mid + 1;
            } else if (mid * mid > x) {
                hi = (int)mid - 1;
            }
            mid = lo + (hi - lo) / 2;
        }

        return x;
    }
}
