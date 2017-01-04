package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC345_ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        if (s == null || s.length() == 0)
            return "";

        char[] cache = s.toCharArray();
        List<Character> list = new LinkedList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (!list.contains(Character.toLowerCase(cache[i])) && i < j)
                ++i;
            while (!list.contains(Character.toLowerCase(cache[j])) && j > i)
                --j;
            char t = cache[i];
            cache[i] = cache[j];
            cache[j] = t;
            ++i;
            --j;
        }

        return new String(cache);
    }
}
