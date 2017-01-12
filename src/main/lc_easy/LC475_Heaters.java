package main.lc_easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wwang on 1/11/2017.
 */
public class LC475_Heaters {

    /**
     * Idea: for each house find each nearest heater. Result is the maximum of the list.
     * @param houses
     * @param heaters
     * @return
     */
    public int findRadius(int[] houses, int[] heaters) {

        // invalid cases
        if (houses == null
                || houses.length == 0
                || heaters == null
                || heaters.length == 0)
            return 0;

        Arrays.sort(heaters);

        int minradius = 0;

        for (int i : houses) {
            // edge cases: houses outside of heaters
            int idx = Arrays.binarySearch(heaters, i);
            idx = idx < 0 ? -idx - 1 : idx;
            int left = idx - 1 >= 0 ? i - heaters[idx - 1] : Integer.MAX_VALUE;
            int right = idx < heaters.length ? heaters[idx] - i : Integer.MAX_VALUE;
            minradius = Math.max(minradius, Math.min(left, right));
        }

        return minradius;
    }
}
