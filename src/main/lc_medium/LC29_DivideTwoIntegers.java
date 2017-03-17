package main.lc_medium;

/**
 * Created by wxwcase on 3/16/17.
 */
public class LC29_DivideTwoIntegers {

    class Result {
        long time;
        long rest;
        Result (long time, long rest) {
            this.time = time;
            this.rest = rest;
        }
    }

    public int divide(int dividend, int divisor) {

        if (divisor == 0) throw new IllegalArgumentException("Divide by zero.");

        if (divisor == 1) return dividend;

        long n = dividend;

        long d = divisor;

        boolean pos = (n >= 0 && d >= 0) || (n < 0 && d < 0);

        n = Math.abs(n);

        d = Math.abs(d);

        Result r = helper(n, d);

        if (r.time >= Integer.MAX_VALUE) r.time = Integer.MAX_VALUE;

        return pos ? (int)r.time : (int)-r.time;
    }

    private Result helper(long n, long d) {

        if (n == 0) return new Result(0, 0);

        if (n < d) {
            return new Result(0, n);
        }

        long time = 0;

        int lastBit = (int)n & 1;

        Result r = helper(n >> 1, d);

        time += r.time * 2;

        long res = lastBit + r.rest * 2;

        while (res >= d) {
            res -= d;
            time++;
        }

        return new Result(time, res);
    }

    public int divideSlow(int dividend, int divisor) {

        if (divisor == 0) throw new IllegalArgumentException("Divide by zero");

        long n = dividend;
        long d = divisor;

        boolean pos = (n >= 0 && d >= 0) || (n < 0 && d < 0);

        long count = 0;

        n = Math.abs(n);
        d = Math.abs(d);

        while (n >= d) {
            n -= d;
            count++;
        }

        if (count > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return pos ? (int)count : (int)-count;
    }
}
