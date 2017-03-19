package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;

/**
 * Created by weiwang on 3/18/17.
 */
public class LC236_LowestCommonAncestorOfABinaryTree {

    // idea: post order traversal
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);

        TreeNode right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : (right == null ? left : root);
    }
}
