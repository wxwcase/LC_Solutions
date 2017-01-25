package main.lc_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wwang on 1/24/2017.
 */
public class LC454_4SumII {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        // edge case
        if (A == null
                || B == null
                || C == null
                || D == null
                || A.length == 0
                || B.length == 0
                || C.length == 0
                || D.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        // populate hash table
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int target = - A[i] - B[j];
                if (map.containsKey(target)) {
                    map.put(target, map.get(target) + 1);
                } else {
                    map.put(target, 1);
                }
            }
        }

        // find count
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int val = C[i] + D[j];
                if (map.containsKey(val)) {
                    count += map.get(val);
                }
            }
        }

        return count;
    }

    public static int binarySearch(int[] arr, int v) {

        if (arr == null || arr.length == 0) return -1;

        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == v) {
                return mid;
            } else if (arr[mid] < v) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}
