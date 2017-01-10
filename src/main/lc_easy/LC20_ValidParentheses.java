package main.lc_easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC20_ValidParentheses {

    public boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        LinkedList<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || map.containsKey(c)) {
                stack.push(c);
            } else {
                char p = stack.peek();
                if (!map.containsKey(p) && !map.containsKey(c)) {
                    stack.push(c);
                } else if (c == map.get(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }
}
