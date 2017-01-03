package main.lc_easy;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC235_LowestCommonAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return null;

        if (p.val == root.val)
            return p;

        if (q.val == root.val)
            return q;

        if ((p.val - root.val) * (q.val - root.val) < 0) {
            return root;
        } else {
            if (root.val > p.val && root.val > q.val) {
                return lowestCommonAncestor(root.left, p, q);
            } else {
                return lowestCommonAncestor(root.right, p, q);
            }
        }
    }

}
