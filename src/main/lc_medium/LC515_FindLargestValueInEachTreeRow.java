package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wxwcase on 3/6/17.
 */
public class LC515_FindLargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> res = new LinkedList<>();

        if (root == null) return res;


        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        int cache = Integer.MIN_VALUE;

        TreeNode runner = root;
        while (!q.isEmpty()) {
            runner = q.poll();
            if (runner == null) {
                // reset cache
                res.add(cache);
                cache = Integer.MIN_VALUE;
                if (!q.isEmpty())
                    q.offer(null);
            } else {
                if (runner.val > cache) {
                    cache = runner.val;
                }
                if (runner.left != null) q.offer(runner.left);
                if (runner.right != null) q.offer(runner.right);
            }
        }

        return res;
    }

    public int[] findValueMostElement2(TreeNode root) {
        if(root==null) return new int[0];
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int max = q.peek().val;
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            res.add(max);
        }
        return res.stream().mapToInt(k->k).toArray();
    }
}
