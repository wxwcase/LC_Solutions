package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;

/**
 * Created by wxwcase on 3/15/17.
 */
public class LC98_ValidateBinarySearchTree {

    // idea: in order traversal
    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;

        if (root.left == null && root.right == null) return true;

        Integer value = null;

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode runner = root;

        while (runner != null) {
            stack.push(runner);
            runner = runner.left;
        }

        while (!stack.isEmpty()) {

            runner = stack.pop();

            // process node
            if (value == null && runner != null) {
                value = runner.val;
            } else {
                if (runner != null && runner.val <= value) {
                    return false;
                } else if (runner != null) {
                    value = runner.val;
                }
            }

            if (runner.right != null) {
                runner = runner.right;
                while (runner != null) {
                    stack.push(runner);
                    runner = runner.left;
                }
            }
        }

        return true;
    }

}
