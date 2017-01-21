package main.lc_medium;

import java.util.*;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC347_TopKFrequentElements {

    /**
     * O(nlogn)
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> res = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>(map.entrySet().size(),
                new Comparator<Map.Entry<Integer, Integer>>() {
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
        });

        q.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            res.add(q.poll().getKey());
        }

        return res;
    }

    /**
     * Bucket sort in O(n).
     * use an array to save numbers into different bucket whose index is the frequency
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequentLinear(int[] nums, int k) {

        List<Integer> res = new LinkedList<>();

        List<Integer>[] bucket = new List[nums.length + 1];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int f = entry.getValue();
            if (bucket[f] == null) {
                bucket[f] = new LinkedList<>();
            }
            bucket[f].add(entry.getKey());
        }

        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                for (int j : bucket[i]) {
                    res.add(j);
                }
            }
        }

        return res;
    }
}
