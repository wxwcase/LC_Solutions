package main.lc_hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by wxwcase on 3/13/17.
 */
public class LC146_LRUCache {

    class LRUNode {

        int key;

        int value;

        LRUNode pre;

        LRUNode nxt;

        LRUNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class LRUCache {

        private int capacity;

        Map<Integer, LRUNode> cache;

        LRUNode head;

        LRUNode tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<>();
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                LRUNode n = cache.get(key);
                remove(n);
                addToHead(n);
                return n.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                LRUNode n = cache.get(key);
                n.value = value;
                remove(n);
                addToHead(n);
            } else {
                LRUNode n = new LRUNode(key, value);
                if (cache.size() >= capacity) {
                    cache.remove(tail.key);
                    remove(tail);
                }
                addToHead(n);
                cache.put(key, n);
            }
        }

        private void remove(LRUNode node) {
            if (node.pre != null) {
                node.pre.nxt = node.nxt;
            } else {
                // head
                head = head.nxt;
            }

            if (node.nxt != null) {
                node.nxt.pre = node.pre;
            } else {
                // tail
                tail = node.pre;
            }
        }

        private void addToHead(LRUNode node) {
            // add head
            node.nxt = head;
            node.pre = null;
            if (head != null) {
                head.pre = node;
            }
            head = node;
            if (tail == null) tail = head;
        }
    }
}
