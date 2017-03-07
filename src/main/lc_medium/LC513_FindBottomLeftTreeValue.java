package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wxwcase on 3/6/17.
 */
public class LC513_FindBottomLeftTreeValue {

    int max = 0;
    int maxLevel = -1;

    public int findBottomLeftValue(TreeNode root) {

        if (root == null) return 0;

        // level order traversal
        helper(root, 0);

        return max;
    }

    private void helper(TreeNode node, int level) {
        if (level > maxLevel) {
            max = node.val;
            maxLevel = level;
        }
        if (node.left != null) helper(node.left, level + 1);
        if (node.right != null) helper(node.right, level + 1);
    }

    // solution 2
    public int findBottomLeftValue2(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode t = null;
        while (!queue.isEmpty()) {
            t = queue.poll();
            if (t.right != null) queue.offer(t.right);
            if (t.left != null) queue.offer(t.left);
        }

        return t.val;
    }
}
