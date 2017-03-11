package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by wxwcase on 3/10/17.
 */
public class LC230_KthSmallestElementInBST {

    // assume 1 <= k <= nodes
    public int kthSmallest(TreeNode root, int k) {

        if (root == null) return 0;

        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode t = root;
        int count = 0;

        while (!stack.isEmpty() && t != null) {
            if (t != null) {
                stack.push(t);
                t = t.left;
            } else {
                t = stack.pop();
                // process
                if (++count == k) return t.val;
                t = t.right;
            }
        }

        return 0;
    }

    // sol 1: Use priority queue to maintain k elements.
    //     - Time: O(N), Space: O(K)
    //     - Con: when there are freq add/delete
    // sol 2: in-order traversal. Time: O(N), Space: O(logN) when recursive, O(N) when iterative
    // sol 3:
}
