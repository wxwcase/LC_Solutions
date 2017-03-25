package main.lc_medium;

import main.RandomListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxwcase on 3/22/17.
 */
public class LC138_CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return head;

        Set<RandomListNode> visited = new HashSet<>();

        return helper(head, visited);
    }

    private RandomListNode helper(RandomListNode node, Set<RandomListNode> visited) {

        if (node == null) return null;

        RandomListNode res = new RandomListNode(node.label);

        if (!visited.contains(node)) {
            visited.add(node);
            res.next = helper(node.next, visited);
            res.random = helper(node.random, visited);
        }

        return res;
    }
}
