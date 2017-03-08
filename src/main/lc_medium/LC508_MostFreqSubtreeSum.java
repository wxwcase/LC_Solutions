package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.*;

/**
 * Created by wwang on 3/7/2017.
 */
public class LC508_MostFreqSubtreeSum {

    int freq = 1;

    public int[] findFrequentTreeSum(TreeNode root) {

        int[] res = null;
        int len = 0;

        if (root == null) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();

        // post-order traversal
        helper(root, map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == freq) {
                len++;
            }
        }

        res = new int[len];

        int c = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == freq) {
                res[c++] = entry.getKey();
            }
        }

        return res;
    }

    // returns the sub-tree sum
    private int helper(TreeNode node, Map<Integer, Integer> map) {

        if (node == null) return 0;

        int val = node.val;
        int lval = helper(node.left, map);
        int rval = helper(node.right, map);
        int subsum = val + lval + rval;

        if (map.containsKey(subsum)) {
            int newcount = map.get(subsum) + 1;
            map.put(subsum, newcount);
            if (newcount > freq) {
                freq = newcount;
            }
        } else {
            map.put(subsum, 1);
        }

        return subsum;
    }

}
