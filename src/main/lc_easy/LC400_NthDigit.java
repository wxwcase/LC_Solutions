package main.lc_easy;

/**
 * Created by wwang on 1/12/2017.
 */
public class LC400_NthDigit {

    public int findNthDigit(int n) {

        if (n < 10) return n;

        long base = 9;
        // group number, 0-9: group 1, 10-99: group 2, etc.
        int count = 1;

        while (n >= base * count) {
            n -= base * count;
            count++;
            base *= 10;
        }

        int tmp = (int)Math.pow(10, count - 1) + (n / count);
        int idx = n % count;

        // if idx == 0, then should return previous number's last digit
        // if idx != 0, then return the current number's idx - 1 digit
        return idx == 0 ? (tmp - 1) % 10 : Integer.toString(tmp).charAt(idx - 1) - '0';
    }
}
