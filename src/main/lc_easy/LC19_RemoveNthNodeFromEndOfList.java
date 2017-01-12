package main.lc_easy;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC19_RemoveNthNodeFromEndOfList {

    /**
     * Test cases: ([1], 1 -> []), ([1, 2], 1 -> [1])
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n < 1)
            return head;

        ListNode right = head, left = null;
        for (int i = 0; i < n; ++i) {
            if (right.next != null) {
                right = right.next;
            } else {
                // delete head and return next
                ListNode newhead = head.next;
                head.next = null;
                return newhead;
            }
        }

        left = head;

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        // delete left.next node
        ListNode mid = left.next;
        left.next = left.next.next;
        mid.next = null;

        return head;
    }
}
