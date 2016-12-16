package main.lc_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxwcase on 12/15/16.
 */
public class LC349_IntersectionOf2Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>();

        for (int e : nums1) {
            set1.add(e);
        }

        for (int e : nums2) {

            if (set1.contains(e)) {
                set2.add(e);
            }
        }

        int[] res = new int[set2.size()];

        int j = 0;

        for (int e : set2) {

            res[j++] = e;
        }

        return res;
    }
}
