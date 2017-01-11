package main.lc_easy;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC203_RemoveLinkedListElements {

    public ListNode removeElementsDummyHead(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode cur = head, prv = dummy;

        while (cur != null) {
            if (cur.val == val) {
                prv.next = cur.next;
            } else {
                prv = prv.next;
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return head;

        ListNode anchor = head;
        ListNode runner = anchor.next;

        while (runner != null) {
            if (runner.val == val) {
                // remove runner node
                anchor.next = runner.next;
                runner.next = null;
            } else {
                // advance
                anchor = runner;
            }
            runner = anchor.next;
        }

        return head;
    }

    public ListNode removeElementsRecursive(ListNode head, int val) {

        if (head == null) return head;

        head.next = removeElementsRecursive(head.next, val);

        return head.val == val ? head.next : head;
    }
}
