package main.lc_easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wwang on 1/4/2017.
 */
public class LC102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        LinkedList<List<Integer>> res = new LinkedList<>();

        if (root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        List<Integer> list = new LinkedList<>();
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                if (!list.isEmpty())
                    res.add(new LinkedList(list));
                list.clear();
                if (!q.isEmpty())
                    q.add(null);
            } else {
                list.add(n.val);
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
        }

        return res;
    }
}
