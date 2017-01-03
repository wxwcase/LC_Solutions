package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 12/21/2016.
 */
public class LC13_RomanToInteger {

    /**
     * Input is guaranteed to be within range from 1 to 3999.
     * I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000.
     * @param s roman string
     * @return integer result
     */
    public int romainToInt(String s) {

        if (s == null || s.length() == 0)
            return 0;

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for (int i = 0; i < s.length() - 1; i++) {
            int val = map.get(s.charAt(i));
            if (val >= map.get(s.charAt(i + 1))) {
                result += val;
            } else {
                result -= val;
            }
        }

        return result;
    }
}
