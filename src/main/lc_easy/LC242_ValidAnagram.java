package main.lc_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC242_ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s == null || t == null)
            return false;

        // length check
        if (s.length() != t.length())
            return false;

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        return new String(sc).equals(new String(tc));
    }

    public boolean isAnagram2(String s, String t) {

        if (s.length() != t.length())
            return false;

        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        for (char c : t.toCharArray()) {
            if (list.contains(c)) {
                list.remove((Character)c);
            } else {
                return false;
            }
        }

        return true;
    }

    // from discussion board
    // https://discuss.leetcode.com/topic/20314/accepted-java-o-n-solution-in-5-lines
    public boolean isAnagram3(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;

        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;

        for (int i : alphabet) if (i != 0) return false;

        return true;
    }
}
