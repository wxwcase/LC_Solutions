package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC21_MergingTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode p1 = null, h1 = l1, h2 = l2;

        while (h2 != null) {

            while (h1 != null && h1.val < h2.val) {
                p1 = h1;
                h1 = h1.next;
            }

            // insert h2 between h1 and p1
            if (p1 != null) {
                p1.next = h2;
                h2 = h2.next;
                p1.next.next = h1;
                p1 = p1.next;
            } else {
                p1 = h2;
                h2 = h2.next;
                p1.next = h1;
                l1 = p1;
            }
        }

        return l1;
    }

}
