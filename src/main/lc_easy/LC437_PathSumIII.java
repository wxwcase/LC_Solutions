package main.lc_easy;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC437_PathSumIII {

    /**
     * Solution 1:
     * With bad performance.
     */

    public int pathSumBase(TreeNode root, int sum) {

        if (root == null)
            return 0;

        return pathSumFromNode(root, sum) +
                pathSumBase(root.left, sum) +
                pathSumBase(root.right, sum);
    }

    private int pathSumFromNode(TreeNode node, int subsum) {

        if (node == null)
            return 0;

        return (node.val == subsum ? 1 : 0)
                + pathSumFromNode(node.left, subsum - node.val)
                + pathSumFromNode(node.right, subsum - node.val);
    }


    /**
     * Solution 2: Optimized solution
     * Time complexity: O(N)
     */

    public int pathSumOptimized(TreeNode root, int sum) {
        return dfs(root, sum, sum);
    }

    int count = 0;

    private int dfs(TreeNode node, int sum, int target) {

        if (node == null)
            return 0;

        if (node.val == sum || node.val == target) {
            ++count;
            return 1;
        } else {
            return dfs(node.left, sum, target - node.val)
                    + dfs(node.right, sum, target - node.val);
        }
    }
}
