package main.lc_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC202_HappyNumber {

    /**
     * A happy number is a number defined by the
     * following process: Starting with any positive
     * integer, replace the number by the sum of the
     * squares of its digits, and repeat the process
     * until the number equals 1 (where it will stay),
     * or it loops endlessly in a cycle which does not
     * include 1. Those numbers for which this process
     * ends in 1 are happy numbers.
     * @param n positive int
     * @return
     */
    public boolean isHappy(int n) {

        // recursive solution
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            if (n < 10) {
                set.add(n);
            }

            int sum = 0;
            while (n > 9) {
                sum += (int) Math.pow((n % 10), 2);
                n /= 10;
            }
            sum += (int) Math.pow(n, 2);
            n = sum;
        }

        if (set.contains(n)) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
