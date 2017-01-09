package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 1/9/2017.
 */
public class LC205_IsomorphicStrings {

    /**
     * Assume s and t are same length.
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {

        char[] tt = t.toCharArray();

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> checker = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(t.charAt(i)) && !checker.containsKey(s.charAt(i))) {
                map.put(t.charAt(i), s.charAt(i));
                checker.put(s.charAt(i), t.charAt(i));
            } else if (!map.containsKey(t.charAt(i)) || !checker.containsKey(s.charAt(i))) {
                return false;
            }
            tt[i] = map.get(t.charAt(i));
        }

        return new String(tt).equals(s);
    }
}
