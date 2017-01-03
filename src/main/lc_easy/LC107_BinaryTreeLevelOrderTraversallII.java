package main.lc_easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC107_BinaryTreeLevelOrderTraversallII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

         LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();

         if (root == null)
             return res;

         Queue<TreeNode> q = new LinkedList<TreeNode>();

         q.add(root);
         q.add(null);

         List<Integer> list = new LinkedList<>();

         while (!q.isEmpty()) {
             TreeNode n = q.poll();
             if (n == null) {
                 res.addFirst(new LinkedList<>(list));
                 list.clear();
                 if (!q.isEmpty())
                    q.add(null);
             } else {
                 list.add(root.val);
                 if (n.left != null)
                     q.add(n.left);
                 if (n.right != null)
                     q.add(n.right);
             }
         }

        return res;
    }
}
