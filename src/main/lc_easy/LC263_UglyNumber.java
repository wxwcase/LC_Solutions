package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC263_UglyNumber {

    public boolean isUgly(int num) {

        if (num < 1)
            return false;

        if (num == 1)
            return true;

        while (num % 2 == 0)
            num /= 2;

        while (num % 3 == 0)
            num /= 3;

        while (num % 5 == 0)
            num /= 5;

        return num == 1;
    }
}
