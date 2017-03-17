package main.lc_easy;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxwcase on 1/8/17.
 */
public class LC438_FindAllAnagramInAString {


    /**
     * Slide window solution, complexity O(n)
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new LinkedList<>();

        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return res;

        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            ++hash[c];
        }

        int start = 0, end = 0, match = 0;

        while (end < s.length()) {
            if (hash[s.charAt(end)] > 0) {
                // find one char match
                ++match;
            }
            // count down hash, if char not in hash, then it will be less than 0
            // useful for testing hash[c] == 0 and add left
            --hash[s.charAt(end)];
            // move right pointer
            ++end;

            if (match == p.length()) res.add(start);

            // move window of width p.length()
            if (end - start == p.length()) {
                // if character exits originally in hash, then count down match
                if (hash[s.charAt(start)] >= 0) {
                    --match;
                }
                hash[s.charAt(start)]++;
                start++;
            }
        }

        return res;
    }

    /**
     * Slow solution.
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagramSlow(String s, String p) {

        List<Integer> res = new LinkedList<>();

        if (s == null || p == null || s.length() == 0 || p.length() == 0)
            return res;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(p, s.substring(i, i + p.length()))) {
                res.add(i);
            }
        }

        return res;
    }


    /**
     * Assume a and b are not null.
     * @param a
     * @param b
     * @return true if a is an anagram of b.
     */
     public boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }

        return true;
    }
}
