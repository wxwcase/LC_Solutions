package main.lc_medium;

import main.lc_easy.ListNode;

/**
 * Created by weiwang on 3/18/17.
 */
public class LC142_LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode fast = head;

        ListNode slow = head;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next;
            } else {
                // no cycle
                return null;
            }
            if (fast == slow) {
                slow = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
