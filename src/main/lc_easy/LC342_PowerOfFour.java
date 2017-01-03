package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC342_PowerOfFour {

    public boolean isPowerOfFour(int num) {
        // proof induction: 4^(n + 1) - 1 = 3 * 4^n + 4^n - 1;
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;

        // solution 2:
        // return num > 0 && (num & (num - 1)) == 0 && (0x55555555 & num) != 0;
    }
}
