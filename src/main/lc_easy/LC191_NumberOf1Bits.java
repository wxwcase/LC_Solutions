package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC191_NumberOf1Bits {

    public int hammingWeight(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
        }

        return result;
    }
}
