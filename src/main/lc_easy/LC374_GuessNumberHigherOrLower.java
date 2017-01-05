package main.lc_easy;

/**
 * Created by wwang on 1/5/2017.
 */
public class LC374_GuessNumberHigherOrLower extends GuessGame {

    public int guessNumber(int n) {
        return helper(1, n);
    }

    private int helper(int start, int end) {
        int mid = start + (end - start) / 2;
        int r = guess(mid);
        if (r == 0) {
            return mid;
        } else if (r < 0) {
            return helper(start, mid);
        } else {
            return helper(mid + 1, end);
        }
    }
}

class GuessGame {
    public int guess(int n) {
        // implementation hidden.
        return 0;
    }
}
