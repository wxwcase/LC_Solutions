package main.lc_medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by wwang on 3/23/2017.
 */
public class LC232_NumberOfConnectedComponentsInAnUndirectedGraph {

    public int countComponents(int n, int[][] edges) {

        int[] roots = new int[n];

        for(int i = 0; i < n; i++) roots[i] = i;

        for(int[] e : edges) {
            int root1 = root(roots, e[0]);
            int root2 = root(roots, e[1]);
            if(root1 != root2) {
                roots[root1] = root2;  // union
                n--;
            }
        }

        return n;
    }

    public int root(int[] roots, int id) {

        while(roots[id] != id) {
            roots[id] = roots[roots[id]];  // optional: path compression
            id = roots[id];
        }

        return id;
    }

    // weighted and path compression solution
    public int countComponentsWeightedPathCompression(int n, int[][] edges) {

        if (edges == null || edges.length == 0) return n;

        int[] id = new int[n];

        int[] sz = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }

        for (int[] e : edges) {
            if (findroot(id, e[0]) != findroot(id, e[1])) {
                union(id, sz, e[0], e[1]);
                n--;
            }
        }

        return n;
    }

    private int findroot(int[] id, int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // path compression
            i = id[i];
        }
        return i;
    }

    private void union(int[] id, int[] sz, int p, int q) {
        int pr = findroot(id, p);
        int qr = findroot(id, q);
        if (sz[pr] > sz[qr]) {
            sz[pr] += sz[qr];
            id[qr] = pr;
        } else {
            sz[qr] += sz[pr];
            id[pr] = qr;
        }
    }
}
