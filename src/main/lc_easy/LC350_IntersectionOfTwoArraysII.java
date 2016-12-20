package main.lc_easy;

import java.util.*;

/**
 * Created by wwang on 12/19/2016.
 */
public class LC350_IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        int l1 = nums1.length, l2 = nums2.length;

        for (int i = 0; i < l1; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        List<Integer> lst = new LinkedList<>();

        for (int i = 0; i < l2; i++) {
            int data = nums2[i];
            if (map.containsKey(data)) {
                lst.add(data);
                int count = map.get(data);
                if (count == 1) {
                    map.remove(data);
                } else if (count > 1) {
                    map.put(data, --count);
                }
            }
        }

        int[] res = new int[lst.size()];

        for (int i = 0; i < lst.size(); i++) {
            res[i] = lst.get(i);
        }

        return res;
    }
}
