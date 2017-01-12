package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC290_WordPattern {

    public boolean wordPattern(String pattern, String str) {

        if (pattern == null || str == null)
            return false;

        String[] s = str.split("\\s+");
        if (pattern.length() != s.length)
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); ++i) {
            char k = pattern.charAt(i);
            if (map.containsKey(k)) {
                if (!map.get(k).equals(s[i]))
                    return false;
            } else {
                if (map.values().contains(s[i]))
                    return false;
                else
                    map.put(k, s[i]);
            }
        }

        return true;
    }
}
