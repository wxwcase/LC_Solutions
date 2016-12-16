package main.lc_easy;

import sun.reflect.generics.tree.Tree;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC404_SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {

        return helper(root, false);
    }

    private int helper(TreeNode node, boolean onLeft) {

        if (node == null)
            return 0;

        if (onLeft) {
            if (node.left == null && node.right == null) {
                return node.val;
            } else {
               return helper(node.left, true) + helper(node.right, false);
            }
        } else {
            return helper(node.left, true) + helper(node.right, false);
        }
    }

}
