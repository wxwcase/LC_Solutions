package main.lc_easy;

/**
 * Created by wxwcase on 3/4/17.
 */
public class LC530_MinAbsoluteDiffInBST {

    public int getMinimumDifference(TreeNode root) {

        // base
        if (root == null ||
                (root.left == null && root.right == null)) {
            return Integer.MAX_VALUE;
        } else {
            int left = getMinimumDifference(root.left);
            int right = getMinimumDifference(root.right);
            int l = Math.abs(getMax(root.left) - root.val);
            int r = Math.abs(getMin(root.right) - root.val);
            return getMin(left, right, l > r ? r : l);
        }
    }

    private int getMin(int a, int b, int c) {
        int res = Math.min(a, b);
        return res > c ? c : res;
    }

    private int getMax(TreeNode node) {

        if (node == null)
            return Integer.MAX_VALUE;

        if (node.right == null) {
            return node.val;
        } else {
            return getMax(node.right);
        }
    }

    private int getMin(TreeNode node) {
        if (node == null)
            return Integer.MAX_VALUE;

        if (node.left == null) {
            return node.val;
        } else {
            return getMin(node.left);
        }
    }

    // solution 2: Time O(N), Space O(1)
    // idea:
    // In-order traversal, compute delta, and return the minimum delta
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference2(TreeNode root) {

        if (root == null) return min;

        getMinimumDifference2(root.left);

        if (prev != null)
            min = Math.min(min, root.val - prev.val);
        prev = root;

        getMinimumDifference2(root.right);

        return min;
    }

    // Follow-up: What if it is not BST?
    //
}
