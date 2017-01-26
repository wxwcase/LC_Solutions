package main.lc_medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by wwang on 1/25/2017.
 */
public class LC378_KthSmallestElementInASortedMatrix {

    /**
     * Solution 1
     * Use priority queue of size k.
     * @param matrix
     * @param k: 1 <= k <= n^2
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int width = matrix[0].length;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                q.add(matrix[i][j]);
            }
        }

        int res = 0;
        for (int i = 0; i < k; i++) {
            res = q.poll();
        }

        return res;
    }

    /**
     * Solution 2
     * Use priority queue. Time: O(klgn)
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallestPriorityQueue(int[][] matrix, int k) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int len = matrix.length;
        PriorityQueue<Item> pq = new PriorityQueue<>();

        for (int i = 0; i < len; i++) {
            pq.add(new Item(0, i, matrix[0][i]));
        }

        for (int i = 0; i < k - 1; i++) {
            Item e = pq.poll();
            if (e.x == len - 1) continue;
            pq.add(new Item(e.x + 1, e.y, matrix[e.x + 1][e.y]));
        }

        Item r = pq.poll();
        return r.val;
    }

    private class Item implements Comparable<Item> {

        int x, y, val;

        Item(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        public int compareTo(Item that) {
            return this.val - that.val;
        }
    }
}
