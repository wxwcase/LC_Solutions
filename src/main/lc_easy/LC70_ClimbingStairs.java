package main.lc_easy;

import java.util.HashMap;

/**
 * Created by wwang on 1/3/2017.
 */
public class LC70_ClimbingStairs {

    public int climbStairs(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 2);

        for (int i = 3; i <= n; i++) {
            int one = map.get(i - 1);
            int two = map.get(i - 2);
            map.put(i, one + two);
        }

        return map.get(n);
    }


}
