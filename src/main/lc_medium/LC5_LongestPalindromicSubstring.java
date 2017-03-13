package main.lc_medium;

/**
 * Created by wxwcase on 3/12/17.
 */
public class LC5_LongestPalindromicSubstring {

    // solution 1
    // Time: O(N), Space: O(1)

    private int start;
    private int end;

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return s;

        for (int i = 0; i < s.length(); i++) {
            // odd
            helper(s, i, i);
            // even
            helper(s, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    private void helper(String s, int ss, int se) {

        if (start > end) return;

        while (ss >= 0 && se < s.length() && s.charAt(ss) == s.charAt(se)) {
            ss--;
            se++;
        }

        if (se - ss - 2 > end - start) {
            start = ss + 1;
            end = se - 1;
        }
    }


    // solution 2
    // Time O(N)
    // Manacher's Algorithm:
    // http://www.geeksforgeeks.org/manachers-algorithm-linear-time-longest-palindromic-substring-part-1/
    public String longestPalindromeLinear(String s) {

        // T = {"$", "#", "A", "#", "B", "#", "A", "#", "B", "#", "A", "#", "B", "#", "A", "#", "@";
        // P = { 0 ,  0 ,  1 ,  0 ,  3 ,  0 ,  1 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ;
        int[] T = new int[2 * s.length() + 1];
        int[] P = new int[T.length];

        int C = 0, R = 0; // C is the center, R is the right boundary of center, i is the current position to expolore

        for (int i = 1; i < T.length - 1; i++) {
            // get mirror position
            int mirror = 2 * C - i;

            // is position i inside of right boundary?
            if (i < R)
                P[i] = Math.min(R - i, P[mirror]);

            // update count
            while (T[i + (1 + P[i])] == T[i - (1 + P[i])])
                P[i]++;

            // change position of center and right boundary
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }

        return ""; // should change to the substring of largest # in P[]
    }
}
