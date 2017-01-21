package main.lc_medium;

import main.lc_easy.ListNode;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC445_AddTwoNumbersII {

    /**
     * Assume two lists contains only non-negative digits and has no leading 0s
     * Node: integer overflow.
     * Idea: turn them into two string.
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        s1.append((char)(l1.val + '0'));
        StringBuilder s2 = new StringBuilder();
        s2.append((char)(l2.val + '0'));

        while (l1.next != null) {
            l1 = l1.next;
            s1.append((char)(l1.val + '0'));
        }

        while (l2.next != null) {
            l2 = l2.next;
            s2.append((char)(l2.val + '0'));
        }

        StringBuilder res = new StringBuilder();
        int c = 1;
        boolean carry = false;
        while (c <= s1.length() && c <= s2.length()) {
            int i1 = s1.charAt(s1.length() - c) - '0';
            int i2 = s2.charAt(s2.length() - c) - '0';
            if (carry) {
                res.append((i1 + i2 + 1) % 10);
                carry = (i1 + i2 + 1) > 9;
            } else {
                res.append((i1 + i2) % 10);
                carry = (i1 + i2) > 9;
            }
            c++;
        }

        boolean s1large = s1.length() > s2.length();
        while (c <= s1.length() || c <= s2.length()) {
            int i = s1large ? s1.charAt(s1.length() - c) - '0' : s2.charAt(s2.length() - c) - '0';
            if (carry) {
                res.append((i + 1) % 10);
                carry = i > 8;
            } else {
                res.append(i % 10);
                carry = i > 9;
            }
            c++;
        }
        if (carry) res.append(1);

        ListNode dummy = new ListNode(-1);
        ListNode runner = dummy;
        for (char r : res.reverse().toString().toCharArray()) {
            runner.next = new ListNode(r - '0');
            runner = runner.next;
        }

        return dummy.next;
    }
}
