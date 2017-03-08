package main.lc_medium;

import main.lc_easy.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxwcase on 3/7/17.
 */
public class LC449_SerializeAndDeserializeBST {

    class Codec {

        // common separated array
        public String serialize(TreeNode root) {

            StringBuilder sb = new StringBuilder();

            if (root == null) return sb.toString();

            // pre-order traversal
            List<Integer> list = new LinkedList<>();
            helper(root, list);

            for (int i : list) {
                sb.append(i + ",");
            }
            return sb.substring(0, sb.length() - 1);
        }

        private void helper(TreeNode node, List<Integer> res) {

            if (node == null) return;

            res.add(node.val);

            helper(node.left, res);
            helper(node.right, res);
        }

        public TreeNode deserialize(String data) {

            if (data == null || data.length() == 0)
                return null;

            List<Integer> list = new LinkedList<>();
            for (String s : data.split(",")) {
                list.add(Integer.valueOf(s));
            }

            return helper(list.toArray(new Integer[0]));
        }

        private TreeNode helper(Integer[] data) {

            if (data == null || data.length == 0)
                return null;

            // first element should be root;
            TreeNode root = new TreeNode(data[0]);

            // find the index of next element that >= root.val
            int idx = -1;
            int leftEnd = data.length - 1;
            for (int i = 1; i < data.length; i++) {
                if (data[i] >= data[0]) {
                    idx = i;
                    break;
                }
            }
            // find
            if (idx > 0) {
                leftEnd = idx - 1;
            }
            Integer[] left = new Integer[leftEnd];
            Integer[] right = new Integer[data.length - leftEnd - 1];
            for (int i = 0; i < leftEnd; i++) {
                left[i] = data[i + 1];
            }
            for (int i = 0; i < data.length - leftEnd - 1; i++) {
                right[i] = data[i + leftEnd + 1];
            }

            root.left = helper(left);
            root.right = helper(right);

            return root;
        }

    }

}

    // solution 2
    class Codec2 {

        public String serialize(TreeNode root) {

            StringBuilder sb = new StringBuilder();

            if (root == null) return sb.toString();

            sb.append(root.val + ",");

            sb.append(serialize(root.left));
            sb.append(serialize(root.right));

            return sb.substring(0, sb.length() - 1);
        }

        public TreeNode deserialize(String data) {

            String[] strings = data.split(",");
            LinkedList<String> list = new LinkedList<>();
            for (String s : strings) {
                list.add(s);
            }

            return reconstructPreorder(list);
        }

        public TreeNode reconstructPreorder(LinkedList<String> queue) {

            for (String s : queue) {
                System.out.print(s + " ");
            }
            System.out.println();

            TreeNode head = null;

            String val = queue.poll();

            if (val == null || val.equals("")) {
                return head;
            }

            head = new TreeNode(Integer.valueOf(val));

            head.left = reconstructPreorder(queue);
            head.right = reconstructPreorder(queue);

            return head;
        }
    }
