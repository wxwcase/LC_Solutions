package main.lc_medium;

/**
 * Created by wxwcase on 3/13/17.
 */
public class LC48_RotateImage {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        if (n == 1) return;

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = t;
            }
        }
    }

    public void rotate2(int[][] matrix) {

        if (matrix == null) return;

        int n = matrix.length;

        if (n == 0) return;

        // ny = x;
        // nx = n - 1 - y;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[i][n - 1 - j] = t;
            }
        }
    }
}
