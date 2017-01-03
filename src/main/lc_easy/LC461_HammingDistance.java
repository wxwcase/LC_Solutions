package main.lc_easy;

/**
 * Created by wwang on 12/21/2016.
 */
public class LC461_HammingDistance {

    public int hammingDistance(int x, int y) {

        int combined = x ^ y;

        // count 1s in combined
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((combined & 1) == 1) {
                count++;
            }
            combined >>= 1;
        }

        return count;
    }
}
