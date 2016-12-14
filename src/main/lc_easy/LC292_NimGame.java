package main.lc_easy;

/**
 * Created by wwang on 12/14/2016.
 */
public class LC292_NimGame {
    public boolean canWinNim(int n) {
        if (n % 4 == 0)
            return false;
        else
            return true;
    }
}
