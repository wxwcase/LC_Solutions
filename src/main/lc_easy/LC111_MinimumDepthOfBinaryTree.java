package main.lc_easy;

import java.util.LinkedList;

/**
 * Created by wxwcase on 1/9/17.
 */
public class LC111_MinimumDepthOfBinaryTree {

    /**
     * BFS
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {

        int depth = 0;

        LinkedList<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return 0;

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode n = queue.pop();
            if (n == null) {
                queue.add(null);
                ++depth;
            } else {
                if (n.left != null)
                    queue.add(n.left);
                if (n.right != null)
                    queue.add(n.right);
                if (n.left == null && n.right == null) {
                     return depth;
                }
            }
        }

        return depth;
    }
}
