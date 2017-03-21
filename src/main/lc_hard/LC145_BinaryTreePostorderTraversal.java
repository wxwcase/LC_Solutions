package main.lc_hard;

import main.lc_easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 3/21/2017.
 */
public class LC145_BinaryTreePostorderTraversal {

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
}
