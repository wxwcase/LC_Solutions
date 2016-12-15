package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC258_AddDigits {

    public int addDigits(int num) {

        int rem = num % 9;

        if (num < 10) {
            return num;
        } else if (rem == 0) {
            return 9;
        } else {
            return rem;
        }
    }
}
