package main.lc_easy;

/**
 * Created by wwang on 1/16/2017.
 */
public class LC125_ValidPalindrome {

    public boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
            start++;
            end--;
        }

        return true;
    }
}
