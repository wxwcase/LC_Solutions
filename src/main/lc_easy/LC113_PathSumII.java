package main.lc_easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC113_PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new LinkedList<List<Integer>>();

        List<Integer> path = new LinkedList<>();

        helper(root, sum, 0, path, res);

        return res;
    }

    private void helper(TreeNode node, int sum, int presum, List<Integer> path, List<List<Integer>> res) {

        if (node == null)
            return;

        // leaf
        int cursum = presum + node.val;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (cursum == sum) {
                res.add(new LinkedList<Integer>(path));
            }
        } else { // inner node
            helper(node.left, sum, cursum, path, res);
            helper(node.right, sum, cursum, path, res);
        }
        path.remove(path.size() - 1);
    }
}
