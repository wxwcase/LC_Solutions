package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC24_SwapNodesInPairs {

    /**
     * "1->2->3->4  =>  "2->1->4->3"
     * Not constant space
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {

        // zero or one node
        if (head == null || head.next == null)
            return head;

        ListNode c = head.next;

        if (c.next == null) {
            c.next = head;
            head.next = null;
            return c;
        }

        ListNode n = c.next;
        c.next = head;
        head.next = swapPairs(n);

        return c;
    }

    public ListNode swapPairsConstantSpace(ListNode head) {

         if (head == null || head.next == null)
             return head;

         ListNode newHead = head.next;
         ListNode a = head;
         ListNode b = head.next;
         ListNode p = null;

         while (a != null && b != null) {
            // swap
             a.next = b.next;
             b.next = a;
             if (p != null)
                 p.next = b;
             // move
             p = a;
             if (a.next == null)
                 break;
             else
                a = a.next;
             b = a.next;
         }

         return newHead;
    }
}
