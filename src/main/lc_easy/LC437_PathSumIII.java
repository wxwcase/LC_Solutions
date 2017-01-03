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

    /* O(N) thought:
    https://discuss.leetcode.com/topic/64526/17-ms-o-n-java-prefix-sum-method/15
    1. The prefix stores the sum from the root to the current node in the recursion
    2. The map stores <prefix sum, frequency> pairs before getting to the current node. We can imagine a path from the root to the current node. The sum from any node in the middle of the path to the current node = the difference between the sum from the root to the current node and the prefix sum of the node in the middle.
    3. We are looking for some consecutive nodes that sum up to the given target value, which means the difference discussed in 2. should equal to the target value. In addition, we need to know how many differences are equal to the target value.
    4. Here comes the map. The map stores the frequency of all possible sum in the path to the current node. If the difference between the current sum and the target value exists in the map, there must exist a node in the middle of the path, such that from this node to the current node, the sum is equal to the target value.
    5. Note that there might be multiple nodes in the middle that satisfy what is discussed in 4. The frequency in the map is used to help with this.
    6. Therefore, in each recursion, the map stores all information we need to calculate the number of ranges that sum up to target. Note that each range starts from a middle node, ended by the current node.
    7. To get the total number of path count, we add up the number of valid paths ended by EACH node in the tree.
    8. Each recursion returns the total count of valid paths in the subtree rooted at the current node. And this sum can be divided into three parts:
        - the total number of valid paths in the subtree rooted at the current node's left child
        - the total number of valid paths in the subtree rooted at the current node's right child
        - the number of valid paths ended by the current node

    The interesting part of this solution is that the prefix is counted from the top(root) to the bottom(leaves), and the result of total count is calculated from the bottom to the top :D

    The code below takes 16 ms which is super fast.

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return findPathSum(root, 0, sum, map);
    }
    private int findPathSum(TreeNode curr, int sum, int target, Map<Integer, Integer> map) {
        if (curr == null) {
            return 0;
        }
        // update the prefix sum by adding the current val
        sum += curr.val;
        // get the number of valid path, ended by the current node
        int numPathToCurr = map.getOrDefault(sum-target, 0);
        // update the map with the current sum, so the map is good to be passed to the next recursion
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        // add the 3 parts discussed in 8. together
        int res = numPathToCurr + findPathSum(curr.left, sum, target, map)
                                               + findPathSum(curr.right, sum, target, map);
       // restore the map, as the recursion goes from the bottom to the top
        map.put(sum, map.get(sum) - 1);
        return res;
    }
    */
}
