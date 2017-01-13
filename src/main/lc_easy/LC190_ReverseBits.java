package main.lc_easy;

/**
 * Created by wwang on 1/12/2017.
 */
public class LC190_ReverseBits {

    public long reverseBits(int n) {

        long res = 0;

        for (int i = 0; i < 31; ++i) {
            res += n & 1;
            res <<= 1;
            n >>= 1;
        }

        res += n & 1;

        return res;
    }
}
