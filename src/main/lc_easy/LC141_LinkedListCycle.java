package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode slow = head;

        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (slow == fast)
                return true;
        }

        return false;
    }
}
