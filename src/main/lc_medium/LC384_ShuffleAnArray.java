package main.lc_medium;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by wwang on 1/23/2017.
 */
public class LC384_ShuffleAnArray {

    public static class Solution {

        int[] org;
        int[] shuffle;

        public Solution(int[] nums) {
            org = nums;
            shuffle = Arrays.copyOf(org, org.length);
        }

        public int[] reset() {
            return org;
        }

        public int[] shuffle() {

            Random random = new Random();

            for (int i = 1; i < shuffle.length; i++) {
                int rand = random.nextInt(i + 1);
                int tmp = shuffle[rand];
                shuffle[rand] = shuffle[i];
                shuffle[i] = tmp;
            }

            return shuffle;
        }
    }
}
