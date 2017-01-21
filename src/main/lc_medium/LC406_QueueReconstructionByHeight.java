package main.lc_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wwang on 1/18/2017.
 */
public class LC406_QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {

        // lambda: (h, k) -> (-h, k)
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o1[0] > o2[0] ? -1 : (o1[0] < o2[0] ? 1 : (o1[1] - o2[1]));
            }
        });

        ArrayList<int[]> list = new ArrayList<>();

        for (int[] p : people) {
            list.add(p[1], p);
        }

        for (int i = 0; i < people.length; i++) {
            people[i] = list.remove(0);
        }

        return people;
    }
}
