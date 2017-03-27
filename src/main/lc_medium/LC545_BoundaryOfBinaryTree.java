package main.lc_medium;

import main.lc_easy.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 3/27/2017.
 */
public class LC545_BoundaryOfBinaryTree {

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        List<Integer> res = new LinkedList<>();

        if (root == null) return res;

        List<Integer> lb = new ArrayList<>(),
                      rb = new ArrayList<>(),
                      leaves = new ArrayList<>();

        // find left boundary
        lb = findLeftBoundary(root);

        // find right boundary
        rb = findRightBoundary(root);
        rb.remove(0); // remove dup root

        // find leaves
        leaves = findLeaves(root);
        // remove head and tail (overlap)
        if (root.left != null)
            leaves.remove(0);
        if (root.right != null)
            leaves.remove(leaves.size() - 1);

        // combine results
        res.addAll(lb);
        res.addAll(leaves);
        for (int i = rb.size() - 1; i >= 0; i--) {
            res.add(rb.get(i));
        }

        return res;
    }

    private List<Integer> findLeftBoundary(TreeNode root) {

        List<Integer> lb = new ArrayList<>();

        if (root.left == null) {
            lb.add(root.val);
            return lb;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode r = root;

        while (!stack.isEmpty() || r != null) {
            if (r != null) {
                stack.push(r);
                lb.add(r.val);
                r = r.left;
            } else {
                r = stack.pop().right;
                // reach the left most node
                if (r == null) {
                    return lb;
                }
            }
        }

        return lb;
    }

    private List<Integer> findRightBoundary(TreeNode root) {

        List<Integer> rb = new ArrayList<>();

        if (root.right == null) {
            rb.add(root.val);
            return rb;
        }

        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode r = root;

        while (!stack.isEmpty() || r != null) {
            if (r != null) {
                stack.push(r);
                rb.add(r.val);
                r = r.right;
            } else {
                r = stack.pop().left;
                // reach the left most node
                if (r == null) {
                    return rb;
                }
            }
        }

        return rb;
    }

    private List<Integer> findLeaves(TreeNode root) {

        List<Integer> leaves = new ArrayList<>();

        if (root == null) return leaves;

        if (root.left == null && root.right == null) return leaves;

        // should use in-order traversal
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode r = root;

        while (!stack.isEmpty() || r != null) {
            if (r != null) {
                stack.push(r);
                r = r.left;
            } else {
                r = stack.pop();
                // process
                if (r.left == null && r.right == null) leaves.add(r.val);
                r = r.right;
            }
        }

        return leaves;
    }
}
