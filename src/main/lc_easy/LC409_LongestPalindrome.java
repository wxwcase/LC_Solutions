package main.lc_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxwcase on 12/18/16.
 */
public class LC409_LongestPalindrome {

    public int longestPalindrome(String s) {

        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        return s.length() - (set.size() == 0 ? 0 : set.size() - 1);
    }
}
