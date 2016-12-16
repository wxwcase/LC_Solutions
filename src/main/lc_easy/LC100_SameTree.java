package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 12/16/2016.
 */
public class LC100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // base case
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        // recursive
        if (p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right)) {
            return true;
        }

        return false;
    }

    /**
     * Using one stack -- non-recursive.
     * @param p one tree root.
     * @param q another tree root.
     * @return true if two tree has same structure and same value for each node.
     */
    public boolean isSameTree2(TreeNode p, TreeNode q) {

        // list as stack
        LinkedList<TreeNode> list = new LinkedList<>();

        list.push(p);

        list.push(q);

        while (!list.isEmpty()) {

            TreeNode qi = list.pop();

            TreeNode pi = list.pop();

            if (pi == null && qi == null)
                continue;

            if (pi == null || qi == null)
                return false;

            if (pi.val == qi.val) {
                list.push(pi.left);
                list.push(qi.left);
                list.push(pi.right);
                list.push(qi.right);
            } else {
                return false;
            }

        }

        return true;
    }
}
