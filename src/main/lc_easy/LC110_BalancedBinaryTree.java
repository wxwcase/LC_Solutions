package main.lc_easy;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

         return Math.abs(height(root.left) - height(root.right)) <= 1
                 && isBalanced(root.left)
                 && isBalanced(root.right);
    }

    private int height(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
