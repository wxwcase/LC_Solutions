package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/5/2017.
 * Solution hint: https://discuss.leetcode.com/topic/33781/my-java-solution-in-dfs-bfs-recursion
 */
public class LC257_BinaryTreePaths {

    /**
     * Recursive solution
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new LinkedList<>();

        if (root == null)
            return paths;

        if (root.left == null && root.right == null) {
            paths.add("" + root.val);
            return paths;
        }

        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val + "->" + path);
        }

        return paths;
    }

    public List<String> binaryTreePathsNonRecursive(TreeNode root) {

        List<String> paths = new LinkedList<>();

        if (root == null) return paths;

        if (root.left == null && root.right == null) {
            paths.add(root.val + "");
            return paths;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<String> pathStack = new LinkedList<>();

        stack.push(root);
        pathStack.push("");

        while (!stack.isEmpty()) {

            TreeNode n = stack.pop();
            String curStr = pathStack.pop();

            if (n.left == null && n.right == null) {
                paths.add(curStr + n.val);
            }
            if (n.left != null) {
                stack.push(n.left);
                pathStack.push(curStr + n.val + "->");
            }
            if (n.right != null) {
                stack.push(n.right);
                pathStack.push(curStr + n.val + "->");
            }
        }

        return paths;
    }

}
