package main.lc_hard;

import main.lc_easy.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by weiwang on 3/18/17.
 */
public class LC23_MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        ListNode head = null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode p, ListNode q) {
                return p.val - q.val;
            }
        });

        for (ListNode n : lists) {
            if (n != null)
                queue.offer(n);
        }

        head = queue.peek();

        ListNode runner = head;

        while (!queue.isEmpty()) {
            runner = queue.poll();
            if (runner.next != null) {
                queue.offer(runner.next);
            }
            runner.next = queue.peek();
        }

        return head;
    }
}
