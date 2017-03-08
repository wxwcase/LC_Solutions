package main.lc_hard;

/**
 * Created by wxwcase on 3/7/17.
 */
public class LC42_TrappingRainWater {

    // idea:
    // maxSeenLeft[i] signifies max height on left side of Tower[i]
    // maxSeenRight[i] signifies max height on right side of Tower[i]
    // Calculate: rainwater = rainwater + Max(Min(maxSeenLeft[i], maxSeenRight[i]) - towerHeight[i], 0);
    public int trap(int[] height) {

        if (height == null || height.length == 0)
            return 0;

        int maxSeenSoFar = 0;
        int[] maxSeenRight = new int[height.length];

        // initialize maxSeenRight array
        maxSeenRight[height.length - 1] = 0;
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i + 1] > maxSeenSoFar) {
                maxSeenSoFar = height[i + 1];
            }
            maxSeenRight[i] = maxSeenSoFar;
        }
        maxSeenSoFar = 0;

        // second pass
        int water = 0;
        int waterOnTower = 0;
        maxSeenSoFar = 0;
        // first and last item couldn't trap water
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i - 1] > maxSeenSoFar) {
                maxSeenSoFar = height[i - 1];
            }
            // calculate water on current tower
            water = Math.min(maxSeenRight[i], maxSeenSoFar) - height[i] > 0 ?
                    Math.min(maxSeenRight[i], maxSeenSoFar) - height[i] : 0;
            waterOnTower += water;
        }

        return waterOnTower;
    }
}
