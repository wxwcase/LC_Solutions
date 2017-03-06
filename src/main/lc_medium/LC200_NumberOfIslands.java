package main.lc_medium;

/**
 * Created by wxwcase on 3/5/17.
 */
public class LC200_NumberOfIslands {

    // DFS
    public int numIslands(char[][] grid) {

        int count = 0;

        if (grid == null || grid.length == 0)
            return count;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    sink(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void sink(char[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length
                && j >= 0 && j < grid[i].length
                && grid[i][j] == '1') {
            grid[i][j] = '0';
            sink(grid, i + 1, j);
            sink(grid, i - 1, j);
            sink(grid, i, j + 1);
            sink(grid, i, j - 1);
        }
    }
}
