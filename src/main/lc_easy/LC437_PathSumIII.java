package main.lc_easy;

import java.util.HashMap;

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
     * Solution 3: best solution
     * Time complexity: O(N)
     */
    public int pathSumOptimal(TreeNode root, int sum) {

        HashMap<Integer, Integer> mem = new HashMap<>();

        mem.put(0, 1);

        return pathSumOptimal_Helper(root, 0, sum, mem);
    }

    private int pathSumOptimal_Helper(TreeNode node, int runningSum, int target, HashMap<Integer, Integer> mem) {

        if (node == null)
            return 0;

        runningSum += node.val;

        int res = 0;
        if (mem.containsKey(runningSum - target)) {
            res = mem.get(runningSum - target);
        }

        if (mem.containsKey(runningSum)) {
            mem.put(runningSum, mem.get(runningSum) + 1);
        } else {
            mem.put(runningSum, 1);
        }

        res += pathSumOptimal_Helper(node.left, runningSum, target, mem)
                + pathSumOptimal_Helper(node.right, runningSum, target, mem);

        mem.put(runningSum, mem.get(runningSum) - 1);

        return res;
    }
}
