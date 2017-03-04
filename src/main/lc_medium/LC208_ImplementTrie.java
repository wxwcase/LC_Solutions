package main.lc_medium;

import main.TrieNode;

/**
 * Created by wxwcase on 3/4/17.
 */
public class LC208_ImplementTrie {

    class Trie {

        TrieNode root;

        public Trie() {
            root = new TrieNode(false);
        }

        public void insert(String word) {

            TrieNode runner = root;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (runner.children.containsKey(c)) {
                    runner = runner.children.get(c);
                } else {
                    TrieNode child = new TrieNode(false);
                    runner.children.put(c, child);
                    runner = child;
                }
            }

            runner.endOfWord = true;
        }

        public boolean search(String word) {

            TrieNode runner = root;

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);

                if (runner.children.containsKey(c)) {
                    runner = runner.children.get(c);
                } else {
                    return false;
                }
            }

            return runner.endOfWord;
        }

        public boolean startsWith(String prefix) {

            TrieNode runner = root;

            for (int i = 0; i < prefix.length(); i++) {

                char c = prefix.charAt(i);

                if (runner.children.containsKey(c)) {
                    runner = runner.children.get(c);
                } else {
                    return false;
                }
            }

            return true;
        }
    }
}
