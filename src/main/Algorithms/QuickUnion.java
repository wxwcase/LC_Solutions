package main.Algorithms;

// Dynamic Connectivity
//      - quick-find: MN
//      - quick-union: MN
//      - weighted-qu: N + MlogN
//      - QU + path compression: N + MlgN
//      - weighted + QU + path compression: N + Mlg*N
/**
 * Created by wxwcase on 3/11/17.
 * Too slow: Trees can be too tall
 * Init: O(N)
 * union: O(N)
 * Find: O(N)
 */
public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }
}

// improvement: Weighting
//      * Modify quick-union to avoid all tall trees
//      * Keep track of !size of each tree (# of objs) (size not height)
//      * Balance by linking of root of smaller tree to root of larger tree
// - Running time
//      * Find: O(lgN)
//      * Union: O(lgN)
//      * Connected: O(lgN)

class WeightedQuickUnion {

    private int[] id;
    private int[] sz;

    WeightedQuickUnion(int N) {
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (id[i] != i) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}


// Improvement: Path compression
// Running time: ~= O(N)
// Hopcroft-Ulman, Tarjan:
//      - Starting from an empty data structure, any sequence of M union-find ops
//        on N objects makes <= c(N + Mlg*N) array access
//      - Can be improved to N + M * alpha(M,N)
// Note
//  - In theory, WQUPC is not quite linear
//  - In practice, WQUPC is linear

// lg*N: iterative log function
//
//      N        lg*N
//      1          0
//      2          1
//      4          2
//     16          3
//  65536          4
// 2^65536         5
// in the real world, consider lg*N == 5

class QuickUnionPathCompression {

    private int[] id;

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
