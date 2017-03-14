package main.lc_hard;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Created by wwang on 3/14/2017.
 */
public class LC460_LFUCache {

    // two map, one doubly linked list
    // one map:     key, value
    // another map: key, freqNode

    final int capacity;
    FNode head;
    Map<Integer, Integer> map;
    Map<Integer, FNode> fmap;

    public LC460_LFUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        fmap = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            increase(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (map.containsKey(key)) {
            increase(key, value);
        } else {
            if (map.size() == capacity)
                removeItem();
            map.put(key, value);
            addItem(key);
        }
    }

    private void increase(int key, int value) {
        FNode node = fmap.get(key);
        // remove old freq item
        node.keys.remove(key);
        if (node.next == null) {
            node.next = new FNode(key, node.count + 1, node, null);
        } else if (node.next.count == node.count + 1) {
            node.next.keys.add(key);
        } else {
            node.next = node.next.prev = new FNode(key, node.count + 1, node, node.next);
        }
        fmap.put(key, node.next);
        map.put(key, value);
        if (node.keys.isEmpty()) remove(node);
    }

    // remove first item in head
    private void removeItem() {
        // empty list
        if (head == null) return;

        int key = head.keys.iterator().next();  // first item
        // remove from freqNode key set
        head.keys.remove(key);
        // if head is empty assign new head
        if (head.keys.isEmpty()) {
            remove(head);
        }
        map.remove(key);
    }

    // add a key, assume capacity allows
    private void addItem(int key) {
        if (head == null) {
            head = new FNode(key, 1, null, null);
        } else if (head.count == 1) {
            head.keys.add(key);
        } else {
            head = head.prev = new FNode(key, 1, null, head);
        }
        // pointing back to freq node
        fmap.put(key, head);
    }

    private void remove(FNode node) {
        if (node == head) {
            head = head.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }
}

class FNode {

    int count;

    FNode prev;

    FNode next;

    LinkedHashSet<Integer> keys = new LinkedHashSet<>();

    public FNode(int key, int count, FNode prev, FNode next) {
        this.count = count;
        this.prev = prev;
        this.next = next;
        keys.add(key);
    }
}