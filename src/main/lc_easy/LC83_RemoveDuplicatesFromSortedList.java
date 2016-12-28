package main.lc_easy;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC83_RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode cur = head, nxt = head.next;
        while (nxt != null) {
             if (cur.val == nxt.val) {
                 cur.next = nxt.next;
                 nxt.next = null;
                 nxt = cur.next;
             } else {
                 cur = nxt;
                 nxt = nxt.next;
             }
        }

        return head;
    }
}
