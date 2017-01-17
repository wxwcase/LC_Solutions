package main.lc_easy;

/**
 * Created by wwang on 1/17/2017.
 */
public class LC7_ReverseInteger {

    public int reverse(int x) {

        if (x == 0) return x;

        boolean negative = x > 0 ? false : true;

        x = negative ? -x : x;

        StringBuilder sb = new StringBuilder();

        while (x % 10 == 0) {
            x /= 10;
        }

        while (x >= 10) {
            sb.append((char)(x % 10 + '0'));
            x /= 10;
        }

        if (x != 0) sb.append((char)(x + '0'));

        long res = negative ? -Long.valueOf(sb.toString()) : Long.valueOf(sb.toString());

        return res > Integer.MAX_VALUE || res <= Integer.MIN_VALUE ? 0 : (int)res;
    }
}
