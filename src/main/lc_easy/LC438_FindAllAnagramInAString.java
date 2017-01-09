package main.lc_easy;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxwcase on 1/8/17.
 */
public class LC438_FindAllAnagramInAString {

    /**
     * Slow solution.
     * @param s
     * @param p
     * @return
     */
    public List<Integer> fndAnagram(String s, String p) {

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
