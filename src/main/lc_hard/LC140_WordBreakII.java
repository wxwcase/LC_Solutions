package main.lc_hard;

import java.util.*;

/**
 * Created by wxwcase on 3/15/17.
 */
public class LC140_WordBreakII {

    // Test cases:
    // "a" ["a"]
    // "bb", ["a", "b", "bbb", "bbbb"]
    // "abcd", ["a", "abc", "b", "cd"]
    // "catsanddog", ["cat sand dog", "cats and dog"]

    Map<String, List<String>> cache = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> res = new ArrayList<>();

        if (s.isEmpty()) return res;

        if (cache.containsKey(s)) return cache.get(s);

        for (int i = 1; i <= s.length(); i++) {

            String t = s.substring(0, i);
            if (wordDict.contains(t)) {

                List<String> rest = wordBreak(s.substring(i), wordDict);
                if (rest.isEmpty()) {
                    if (i == s.length() - 1) res.add(t);
                } else {
                    for (String str : rest) {
                        res.add(t + " " + str);
                    }
                }
            }
        }

        // empty sub solution
        cache.put(s, res);

        return res;
    }

}
