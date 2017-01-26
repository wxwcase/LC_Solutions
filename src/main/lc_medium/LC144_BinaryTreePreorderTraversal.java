package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wwang on 1/26/2017.
 */
public class LC144_BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new LinkedList<>();

        if (root == null) return res;

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode n = stack.poll();
            if (n != null) {
                res.add(n.val);
                if (n.right != null) stack.push(n.right);
                if (n.left != null) stack.push(n.left);
            }
        }

        return res;
    }
}
