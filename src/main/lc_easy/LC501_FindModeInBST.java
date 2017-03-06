package main.lc_easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by wxwcase on 3/5/17.
 * https://discuss.leetcode.com/topic/77335/proper-o-1-space/2
 */
public class LC501_FindModeInBST {

    // fields
    private int currentVal;
    private int currentCount = 0;
    private int maxCount = 0;
    private int modeCount;
    private int[] modes;

    // Idea: (with no extra space, stack introduced by recursion does not count)
    // Two passes:
    // 1. Collect most occurrences count
    // 2. Collect which value has that count
    public int[] findMode(TreeNode root) {

        // first pass: get maxCount
        inorder(root);
        modes = new int[modeCount];

        // second pass: get which value has maxCount
        modeCount = 0;
        currentCount = 0;
        inorder(root);

        return modes;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        handleValue(root.val);
        inorder(root.right);
    }

    private void handleValue(int val) {
        if (val != currentVal) {
            currentVal = val;
            currentCount = 0;
        }
        currentCount++;
        if (currentCount > maxCount) {
            maxCount = currentCount;
            // encounter a new max, reset modeCount = 1
            modeCount = 1;
        } else if (currentCount == maxCount) {
            if (modes != null)                  // 2nd pass
                modes[modeCount] = currentVal;  // 2nd pass
            modeCount++;
        }
    }


    private void inorder2(TreeNode root) {
        TreeNode node = root;
        while (node != null) {
            if (node.left == null) {
                handleValue(node.val);
                node = node.right;
            } else {
                TreeNode prev = node.left;
                while (prev.right != null && prev.right != node)
                    prev = prev.right;
                if (prev.right == null) {
                    prev.right = node;
                    node = node.left;
                } else {
                    prev.right = null;
                    handleValue(node.val);
                    node = node.right;
                }
            }
        }
    }
}

class Solution2 {

    // {value: count}
    private Map<Integer, Integer> map;

    private int max = 0;

    public int[] findMode(TreeNode root) {

        if(root == null) return new int[0];
        map = new HashMap<>();

        inorder(root);

        List<Integer> list = new LinkedList<>();
        for(int key: map.keySet()){
            if(map.get(key) == max) list.add(key);
        }

        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }

    private void inorder(TreeNode node){

        if(node.left!=null) inorder(node.left);

        // process
        map.put(node.val, map.getOrDefault(node.val, 0)+1);
        max = Math.max(max, map.get(node.val));

        if(node.right!=null) inorder(node.right);
    }
}
