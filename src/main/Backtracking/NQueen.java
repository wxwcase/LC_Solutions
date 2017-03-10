package main.Backtracking;

/**
 * Created by wxwcase on 3/9/17.
 */
public class NQueen {

    class Position {
        int row;
        int col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    // n is the number of queens
    public Position[] solveNQueenSolution(int n) {

        Position[] positions = new Position[n];

        boolean hasSolution = helper(n, 0, positions);

        if (hasSolution) {
            return positions;
        } else {
            return new Position[0];
        }
    }

    private boolean helper(int n, int row, Position[] positions) {

        if (n == row) return true;

        int col;

        for (col = 0; col < n; col++) {

            boolean found = true;

            for (int queen = 0; queen < row; queen++) {
                // vertical, horizontal or diagonal check for each previous queen
                if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col
                        || positions[queen].row + positions[queen].col == row + col) {
                    found = false;
                    break;
                }
            }

            if (found) {
                positions[row] = new Position(row, col);
                if (helper(n, row + 1, positions)) return true;
            }
        }

        return false;
    }
}
