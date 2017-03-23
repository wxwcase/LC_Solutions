package main.lc_hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wwang on 3/23/2017.
 */
public class LC305_NumberOfIslandsII {

    int count;

    public List<Integer> numIslands2(int m, int n, int[][] positions) {

        List<Integer> res = new ArrayList<>();

        if (positions == null || positions.length == 0) return res;

        int[][] island = new int[m][n];

        for (int[] pos : positions) {
            touch(pos[0], pos[1], island);
            res.add(island[pos[0]][pos[1]]);
        }

        return res;
    }

    // return island #
    private void touch(int x, int y, int[][] islands) {

        if (islands[x][y] != 0) return;

        int srd = 0;

        int minIsland = Integer.MAX_VALUE;

        if (x > 0 && islands[x - 1][y] != 0) {
            srd++;
            if (islands[x - 1][y] < minIsland)
                minIsland = islands[x - 1][y];
        }
        if (x < islands.length - 1 && islands[x + 1][y] != 0) {
            srd++;
            if (islands[x + 1][y] < minIsland)
                minIsland = islands[x + 1][y];
        }
        if (y > 0 && islands[x][y - 1] != 0) {
            srd++;
            if (islands[x][y - 1] < minIsland)
                minIsland = islands[x][y - 1];
        }
        if (y < islands[0].length - 1 && islands[x][y + 1] != 0) {
            srd++;
            if (islands[x][y + 1] < minIsland)
                minIsland = islands[x][y + 1];
        }

        if (minIsland == Integer.MAX_VALUE) {
            minIsland = ++count;
        } else {
            count -= srd - 1;
        }

        islands[x][y] = minIsland;
        count = minIsland;

        if (x > 0 && islands[x - 1][y] != 0) {
            islands[x - 1][y] = minIsland;
        }
        if (x < islands.length - 1 && islands[x + 1][y] != 0) {
            islands[x + 1][y] = minIsland;
        }
        if (y > 0 && islands[x][y - 1] != 0) {
            islands[x][y - 1] = minIsland;
        }
        if (y < islands[0].length - 1 && islands[x][y + 1] != 0) {
            islands[x][y + 1] = minIsland;
        }
    }

}
