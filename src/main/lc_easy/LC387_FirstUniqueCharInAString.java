package main.lc_easy;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC387_FirstUniqueCharInAString {

    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
           if (map.containsKey(c)) {
              map.put(c, map.get(c) + 1);
           } else {
               map.put(c, 1);
           }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
