package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC101_SymmetricTree {

    /**
     * Non-recursive solution
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        if (root.left == null || root.right == null)
            return root.left == root.right;

        LinkedList<TreeNode> stack = new LinkedList<>();

        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode r = stack.pop();
            TreeNode l = stack.pop();
            if (r != null && l != null) {
                if (r.val == l.val) {
                    stack.push(r.left);
                    stack.push(l.right);
                    stack.push(r.right);
                    stack.push(l.left);
                } else {
                    return false;
                }
            } else if (r == null && l == null) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    /**
     * Recursive solution
     * @param root
     * @return
     */
    public boolean isSymmetricRecursive(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;

        if (left.val != right.val)
            return false;

        return helper(left.left, right.right)
                && helper(left.right, right.left);
    }
}
