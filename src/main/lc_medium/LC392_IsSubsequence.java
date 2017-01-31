package main.lc_medium;

/**
 * Created by wwang on 1/23/2017.
 */
public class LC392_IsSubsequence {

    /**
     * Assume s, t are lower case, and t is very long.
     * @param s: len < 100
     * @param t: len > 500000
     * @return
     */
    public boolean isSubsequence(String s, String t) {

        // edge cases
        if (s == null || t == null || s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length()) return true;
            }
            j++;
        }

        return false;
    }
}
