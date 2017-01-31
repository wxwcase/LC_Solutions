package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.*;

/**
 * Created by wwang on 1/23/2017.
 */
public class LC94_BinaryTreeInorderTraversal {

    /**
     * Try iterative.
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new LinkedList<>();

        // use stack
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode runner = root;

        while (runner != null || !stack.isEmpty()) {
            while (runner != null) {
                stack.push(runner);
                runner = runner.left;
            }
            runner = stack.pop();
            res.add(runner.val);
            runner = runner.right;
        }

        return res;
    }
}
