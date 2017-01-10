package main.lc_easy;

/**
 * Created by wwang on 1/10/2017.
 */
public class LC234_PalindromeLinkedList {

    /**
     * Given a singly linked list, determine if it is a palindrome.
     * Idea: reverse the first half and compare with the second half.
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        // edge case
        if (head == null || head.next == null) return true;

        // get list length
        int len = 1, mid = 0;
        ListNode runner = head;
        while (runner.next != null) {
            runner = runner.next;
            ++len;
        }
        mid = len / 2;

        // get second half head
        ListNode secondhalf = head;
        // prv is the first half head.
        ListNode prv = null, cur = head, nxt;
        while (mid > 0) {
            secondhalf = secondhalf.next;
            mid--;

            // reverse cur.next
            nxt = cur.next;
            cur.next = prv;
            prv = cur;
            cur = nxt;
        }

        if (len % 2 != 0)
            secondhalf = secondhalf.next;

        // compare two list
        for (int i = 0; i < len / 2; ++i) {
            if (prv.val != secondhalf.val) {
                return false;
            }
            prv = prv.next;
            secondhalf = secondhalf.next;
        }

        return true;
    }
}
