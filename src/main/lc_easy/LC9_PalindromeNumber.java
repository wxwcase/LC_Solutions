package main.lc_easy;

/**
 * Created by wwang on 1/5/2017.
 */
public class LC9_PalindromeNumber {

    public boolean isPalindrome(int x) {

        String xs = Integer.toString(x);
        int len = xs.length();

        for (int i = 0; i < xs.length() / 2; i++) {
            if (xs.charAt(i) != xs.charAt(xs.length() - i - 1))
                return false;
        }

        return true;
    }
}
