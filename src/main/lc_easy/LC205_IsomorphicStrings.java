package main.lc_easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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


    // solution 2
    public boolean isIsomorphic2(String s, String t) {
        Set<Integer> ss = new HashSet<>();
        Set<Integer> ts = new HashSet<>();
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            ss.add((int)s.charAt(i));
            ts.add((int)t.charAt(i));
            st.add((s.charAt(i) << 16) + t.charAt(i));
        }
        return ss.size() == ts.size() && ts.size() == st.size();
    }

    // solution 3
    public boolean isIsomorphic3(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < ss.length; i++) {
            if (!map.containsKey(ss[i])) {
                map.put(ss[i], tt[i]);
            } else {
                if (!map.get(ss[i]).equals(tt[i])) return false;
            }
        }
        return map.size()== new HashSet<>(map.values()).size();
    }
}
