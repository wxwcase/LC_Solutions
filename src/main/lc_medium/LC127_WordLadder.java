package main.lc_medium;

import java.util.*;

/**
 * Created by wxwcase on 3/14/17.
 * http://www.jiuzhang.com/solutions/word-ladder/
 * assumes: two strings are not empty, list doesn't contain dups
 */
public class LC127_WordLadder {

    // Solution 1: BFS, not working for input:
    // "hit", "cog", ["hot", "dot", "dog", "lot", "log"]
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int len = 1;

        if (beginWord.equals(endWord)) return len;

        Set<String> visited = new HashSet<>();

        Set<String> beginSet = new HashSet<>();
        beginSet.add(beginWord);

        Set<String> endSet = new HashSet<>();
        endSet.add(endWord);

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {

            len++;

            // exchange to smaller set
            if (beginSet.size() > endSet.size()) {
                Set<String> s = beginSet;
                beginSet = endSet;
                endSet = s;
            }

            Set<String> hs = new HashSet<>();

            for (String word : beginSet) {
                char[] w = word.toCharArray();
                for (int i = 0 ; i < w.length; i++) {
                    char old = w[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        w[i] = c;
                        String newStr = new String(w);
                        if (endSet.contains(newStr)) return len;
                        // mark visited and extend beginSet
                        if (!visited.contains(newStr) && wordList.contains(newStr)) {
                            visited.add(newStr);
                            hs.add(newStr);
                        }
                    }
                    w[i] = old;
                }
            }

            beginSet = hs;
        }

        return 0;
    }

    // Solution 2: Double Ended BFS
    // TLE
    public int ladderLengthDBFS(String beginWord, String endWord, List<String> wordList) {

        int len = 1;

        if (beginWord.equals(endWord)) {
            return len;
        }

        Set<String> set = new HashSet<>();
        for (String s : wordList) set.add(s);

        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();

        queue.offer(beginWord);

        visited.add(beginWord);

        while (!queue.isEmpty()) {
            len++;
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                String t = queue.poll();
                for (String s : getNextWords(t, set)) {
                    if (visited.contains(s)) continue;
                    if (s.equals(endWord)) return len;
                    visited.add(s);
                    queue.offer(s);
                }
            }
        }

        return 0;
    }

    // Use set instead of list to speed things up
    private List<String> getNextWords(String word, Set<String> set) {
        List<String> res = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            char[] w = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                char oc = w[i];
                if (c == w[i]) continue;
                w[i] = c;
                String ns = new String(w);
                if (set.contains(ns)) {
                    res.add(ns);
                }
                w[i] = oc;
            }
        }
        return res;
    }
}
