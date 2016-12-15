package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC371_SumOf2Ints {

    public int getSum(int a, int b) {

        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }

        return a;
    }
}
