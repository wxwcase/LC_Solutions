package main.lc_easy;

import java.util.Arrays;

/**
 * Created by wwang on 12/15/2016.
 */
public class LC453_MinMoves2EqualArrayElements {

    /**
     * A move is incrementing n - 1 elements by 1.
     * @param nums input array
     * @return min moves required
     */
    public int minMoves(int[] nums) {

        int moves = 0, minNum = nums[0];

        for (int i : nums) {
            if (i < minNum)
                minNum = i;
        }

        for (int i : nums) {
            moves += i - minNum;
        }

        return moves;
    }
}
