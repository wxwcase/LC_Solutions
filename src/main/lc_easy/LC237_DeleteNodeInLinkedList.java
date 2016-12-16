package main.lc_easy;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC237_DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {

        if (node == null)
            return;

        // node.next is not null
        node.val = node.next.val;

        node.next = node.next.next;
    }
}
