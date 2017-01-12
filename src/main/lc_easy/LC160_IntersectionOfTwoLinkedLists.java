package main.lc_easy;

/**
 * Created by wwang on 1/12/2017.
 */
public class LC160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // invalid head
        if (headA == null || headB == null) return null;

        ListNode runnerA = headA, runnerB = headB;

        // count A length
        int countA = 0;
        while (runnerA.next != null) {
            runnerA = runnerA.next;
            ++countA;
        }

        // count B length
        int countB = 0;
        while (runnerB.next != null) {
            runnerB = runnerB.next;
            ++countB;
        }

        // runner A is the longer
        runnerA = countA > countB ? headA : headB;
        runnerB = countA > countB ? headB : headA;

        int delta = (int)Math.abs(countA - countB);
        for (int i = 0; i < delta; i++) runnerA = runnerA.next;
        while (runnerA != runnerB) {
            runnerA = runnerA.next;
            runnerB = runnerB.next;
        }

        return runnerA;
    }
}

