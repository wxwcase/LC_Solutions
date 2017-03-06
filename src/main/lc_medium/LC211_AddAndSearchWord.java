package main.lc_medium;

import main.TrieNode;

/**
 * Created by wxwcase on 3/5/17.
 */
public class LC211_AddAndSearchWord {

    class WordDictionary {

        TrieNode root;

        public WordDictionary() {
            root = new TrieNode(false);
        }

        public void addWord(String word) {

            TrieNode runner = root;

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);

                if (runner.children.containsKey(c)) {
                    runner = runner.children.get(c);
                } else {
                    TrieNode t = new TrieNode(false);
                    runner.children.put(c, t);
                    runner = t;
                }
            }
            runner.endOfWord = true;
        }

        public boolean search(String word) {

            TrieNode runner = root;

            return helper(word, runner);
        }

        private boolean helper(String word, TrieNode node) {

            if (word == null || word.length() == 0)
                return false;

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);

                if (c == '.') {
                    for (TrieNode n : node.children.values()) {
                        // process last dot
                        if (i == word.length() - 1 && n.endOfWord)
                            return true;
                        if (n != null && helper(word.substring(i + 1), n)) {
                            return true;
                        }
                    }
                    return false;
                } else if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                } else {
                    return false;
                }
            }

            return node.endOfWord;
        }
    }
}
