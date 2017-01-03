package main.lc_easy;

/**
 * Created by wwang on 12/21/2016.
 */
public class LC206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode prv = null, cur = head, nxt = null;
        while (cur != null) {
            nxt = cur.next;
            cur.next = prv;
            prv = cur;
            cur = nxt;
        }

        return prv;
    }
}
