package main.lc_easy;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC226_InvertBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.right);

        TreeNode right = invertTree(root.left);

        root.left = left;

        root.right = right;

        return root;
    }
}
