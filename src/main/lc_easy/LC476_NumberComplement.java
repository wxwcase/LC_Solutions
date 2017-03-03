package main.lc_easy;

/**
 * Created by wwang on 3/3/2017.
 */
public class LC476_NumberComplement {

    public int findComplement(int num) {

        if (num == 0)
            return 1;

        int x = (int)Math.floor(Math.log(num) / Math.log(2)) + 1;
        long y = (long)Math.pow(2, x) - 1;
        return (int)((long)num ^ y);
    }
}
