package main.lc_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wwang on 12/23/2016.
 */
public class LC447_NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            map.clear();
            for (int j = 0; j < points.length; j++) {
                int dist = distpow(points[i], points[j]);
                if (map.containsKey(dist)) {
                    map.put(dist, map.get(dist) + 1);
                } else {
                    map.put(dist, 1);
                }
            }
            // loop through map and calculate num of boomerang
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int val = entry.getValue();
                if (val > 1) {
                    result += val * (val - 1);
                }
            }
        }

        return result;
    }

    private int distpow(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

}
