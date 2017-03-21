package main.lc_hard;

import main.lc_easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 3/21/2017.
 */
public class LC145_BinaryTreePostorderTraversal {

    // two stack
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        // two stack solution
        LinkedList<TreeNode> s1 = new LinkedList<>();
        LinkedList<TreeNode> s2 = new LinkedList<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            TreeNode n = s1.poll();
            s2.push(n);
            if (n.left != null) s1.push(n.left);
            if (n.right != null) s1.push(n.right);
        }

        while (!s2.isEmpty()) {
            res.add(s2.pop().val);
        }

        return res;
    }

    // one stack
    public List<Integer> solution2(TreeNode root) {

        List<Integer> res = new LinkedList<>();

        if (root == null) return res;

        LinkedList<TreeNode> stack = new LinkedList<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            res.add(0, n.val);
            if (n.left != null) stack.push(n.left);
            if (n.right != null) stack.push(n.right);
        }

        return res;
    }
}
