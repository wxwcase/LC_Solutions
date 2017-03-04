package main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxwcase on 3/4/17.
 */
public class TrieNode {

    public Map<Character, TrieNode> children;

    public boolean endOfWord;

    public TrieNode(boolean endOfWord) {

        this.endOfWord = endOfWord;

        this.children = new HashMap<Character, TrieNode>();
    }
}
