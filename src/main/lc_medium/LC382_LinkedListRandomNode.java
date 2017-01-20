package main.lc_medium;

import main.lc_easy.ListNode;

import java.util.Random;

/**
 * Created by wwang on 1/20/2017.
 * Space: O(1)
 * Idea: reservoir sampling: https://en.wikipedia.org/wiki/Reservoir_sampling
 */
public class LC382_LinkedListRandomNode {

    private Random rand;
    private ListNode head;

    public LC382_LinkedListRandomNode(ListNode head) {
        rand = new Random();
        this.head = head;
    }

    public int getRandom() {

        int c = 1;
        int res = head.val;
        // assume head is not null

        if (head.next == null) return head.val;

        ListNode runner = head;
        while (runner.next != null) {
            runner = runner.next;
            if (rand.nextInt(++c) == 0) {
                res = runner.val;
            }
        }

        return res;
    }

}
