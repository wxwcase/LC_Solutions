package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC112_PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        return helper(root, sum, 0);
    }

    public boolean helper(TreeNode node, int sum, int presum) {

        if (node == null)
            return false;

        int cursum = presum + node.val;

        if (node.left == null
                && node.right == null) {
            if (cursum == sum) {
                return true;
            } else {
                return false;
            }
        }

        return helper(node.left, sum, cursum)
                || helper(node.right, sum, cursum);
    }
}
