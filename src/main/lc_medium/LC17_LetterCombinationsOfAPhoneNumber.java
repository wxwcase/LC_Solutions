package main.lc_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by weiwang on 3/19/17.
 */
public class LC17_LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) return res;

        StringBuilder sb = new StringBuilder();

        Map<Character, char[]> map = new HashMap<>();

        map.put('2', new char[] {'a', 'b', 'c'});
        map.put('3', new char[] {'d', 'e', 'f'});
        map.put('4', new char[] {'g', 'h', 'i'});
        map.put('5', new char[] {'j', 'k', 'l'});
        map.put('6', new char[] {'m', 'n', 'o'});
        map.put('7', new char[] {'p', 'q', 'r', 's'});
        map.put('8', new char[] {'t', 'u', 'v'});
        map.put('9', new char[] {'w', 'x', 'y', 'z'});

        return helper(map, digits);
    }

    private List<String> helper(Map<Character, char[]> map, String digits) {

        List<String> tmp = new ArrayList<>();

        if (digits == null || digits.length() == 0) return tmp;

        char c = digits.charAt(0);

        tmp = helper(map, digits.substring(1));

        if (map.containsKey(c)) {
            char[] range = map.get(c);
            if (tmp.size() == 0) {
                for (char r : range)
                    tmp.add(r + "");
            } else {
                List<String> n = new ArrayList<>();
                for (char r : range)
                    for (int i = 0; i < tmp.size(); i++)
                        n.add(r + tmp.get(i));
                tmp = n;
            }
        }

        return tmp;
    }
}