package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WWang on 3/10/2017.
 */
public class LC199_BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        return helper(root);
    }

    private List<Integer> helper(TreeNode node) {

        List<Integer> res = new ArrayList<>();

        if (node == null) return res;

        res.add(node.val);

        List<Integer> left = helper(node.left);
        int lsize = left.size();
        List<Integer> right = helper(node.right);
        int rsize = right.size();

        int size = lsize > rsize ? lsize : rsize;

        for (int i = 0; i < size; i++) {
            if (i < lsize && i < rsize) {
                res.add(right.get(i));
            } else if (i < lsize) {
                res.add(left.get(i));
            } else if (i < rsize) {
                res.add(right.get(i));
            }
        }

        return res;
    }
}
