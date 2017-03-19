package main.lc_medium;

/**
 * Created by weiwang on 3/18/17.
 */
public class LC240_SearchA2DMatrix {

    // http://cs.geneseo.edu/~baldwin/math-thinking/saddleback.html
    public boolean searchMatrix(int[][] matrix, int target) {

         if (matrix == null || matrix.length == 0) return false;

         int y = matrix[0].length - 1;
         int x = 0;
         while (x < matrix.length && y >= 0) {
             int t = matrix[x][y];
             if (t == target) {
                 return true;
             } else if (t > target) {
                 y--;
             } else {
                 x++;
             }
         }

         return false;
    }
}
