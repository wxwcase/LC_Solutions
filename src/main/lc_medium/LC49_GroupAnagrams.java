package main.lc_medium;

import java.util.*;

/**
 * Created by wxwcase on 3/26/17.
 */
public class LC49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new LinkedList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String ss = sortString(s);
            if (map.containsKey(ss)) {
                map.get(ss).add(s);
            } else {
                List<String> r = new LinkedList<>();
                r.add(s);
                map.put(ss, r);
            }
        }

        for (List<String> l : map.values()) {
            res.add(l);
        }

        return res;
    }

    // sort string alphabetically
    private String sortString(String s) {

        char[] a = s.toCharArray();

        Arrays.sort(a);

        return new String(a);
    }

    // Solution 2:
    // Idea: Assign a prime number for a to z, and then multiply
    // all prime numbers together to form a hash value.
}
