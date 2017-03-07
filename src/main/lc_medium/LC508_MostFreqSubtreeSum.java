package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.*;

/**
 * Created by wwang on 3/7/2017.
 */
public class LC508_MostFreqSubtreeSum {

    int freq = 0;
    int freqSum = 0;
    int preLeftSum = 0;
    int preRightSum = 0;
    Set<Integer> items = new HashSet<>();

    public int[] findFrequentTreeSum(TreeNode root) {

        int[] res = null;

        if (root == null) return res;

        helper(root);

        res = new int[items.size()];
        int c = 0;
        for (int i : items) {
            res[c++] = i;
        }

        return res;
    }

    private void helper(TreeNode node) {

        if (node == null) return;

        // leaf node
        if ((node.left == null)
                && (node.right == null)
                && (node.val == freqSum)
                && !items.contains(node.val)) {
            freqSum++;
            items.add(node.val);
        }

        helper(node.left);
        helper(node.right);
    }
}
