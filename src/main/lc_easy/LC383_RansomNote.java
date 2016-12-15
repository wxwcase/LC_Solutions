package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC383_RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                int res = map.get(c) - 1;
                if (res == 0) {
                    map.remove(c);
                } else {
                    map.put(c, res);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
