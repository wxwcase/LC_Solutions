package main.lc_hard;

import main.lc_easy.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wxwcase on 3/14/17.
 */
public class LC297_SerializeDeserializeBinaryTree {

    private static String NULL_NODE = "*";
    private static String SPLITTER = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        return buildString(root, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> s = Arrays.asList(data.split(SPLITTER));
        Queue<String> q = new LinkedList<>();
        q.addAll(s);
        return buildTree(q);
    }

    private String buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NULL_NODE);
            sb.append(SPLITTER);
            return sb.toString();
        }
        sb.append(node.val);
        sb.append(SPLITTER);
        buildString(node.left, sb);
        buildString(node.right, sb);
        return sb.toString();
    }

    private TreeNode buildTree(Queue<String> data) {
        String s = data.poll();
        if (s.equals(NULL_NODE)) {
            return null;
        }
        TreeNode n = new TreeNode(Integer.valueOf(s));
        n.left = buildTree(data);
        n.right = buildTree(data);
        return n;
    }
}
