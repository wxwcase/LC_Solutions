package main.lc_easy;

/**
 * Created by wxwcase on 1/16/17.
 */
public class LC278_FirstBadVersion {

    public int firstBadVersion(int n) {

        int lo = 1, hi = n;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
