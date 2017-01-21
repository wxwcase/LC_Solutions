package main.lc_medium;

import java.util.*;

/**
 * Created by wwang on 1/19/2017.
 */
public class LC451_SortCharactersByFrequency {

    /**
     * HashMap, Heap
     * @param s
     * @return
     */
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<char[]> queue = new PriorityQueue<>(new Comparator<char[]>() {
            public int compare(char[] a, char[] b) {
                return b.length - a.length;
            }
        });

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char[] r = new char[entry.getValue()];
            Arrays.fill(r, entry.getKey());
            queue.add(r);
        }

        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            res.append(queue.poll());
        }

        return res.toString();
    }

    // beat 84%
    public String frequencySortBetter(String s) {

        int[][] charFeq = new int[256][2];

        for(int i=0; i<s.length(); i++) {
            charFeq[s.charAt(i)][0]++;
            charFeq[s.charAt(i)][1] = s.charAt(i);
        }

        Arrays.sort(charFeq, new Comparator<int[]>(){
            public int compare(int[] f1, int[] f2) {
                return f2[0]-f1[0];
            }
        });

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<256; i++)
            for(int j=0; j<charFeq[i][0]; j++)
                sb.append((char)charFeq[i][1]);

        return sb.toString();
    }
}
