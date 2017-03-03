package main.lc_easy;

import java.util.*;

/**
 * Created by wwang on 3/3/2017.
 */
public class LC500_KeyboardRow {

    public String[] findWords(String[] words) {

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        set1.addAll(Arrays.asList(new Character[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}));
        set2.addAll(Arrays.asList(new Character[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}));
        set3.addAll(Arrays.asList(new Character[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'}));

        List<String> l = new LinkedList<>();

        for (String s : words) {
            if (isInRow(s, set1, set2, set3)) {
                l.add(s);
            }
        }

        return l.toArray(new String[0]);
    }

    private boolean isInRow(String s, Set<Character> set1, Set<Character> set2, Set<Character> set3) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            set.add(c);
        }

        return (set1.containsAll(set)
            || set2.containsAll(set)
            || set3.containsAll(set)) ? true : false;
    }
}
