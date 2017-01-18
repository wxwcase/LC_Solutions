package main.lc_medium;

/**
 * Created by wwang on 1/17/2017.
 */
public class LC419_BattleshipsInABoard {

    /**
     * Idea:
     * If current is 'X', look for left and up, if they are '.' then count++.
     * @param board
     * @return
     */
    public int countBattleships(char[][] board) {

        if (board == null || board.length == 0 ||board[0].length == 0) return 0;

        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {

                    if (i > 0 && j > 0) {
                        if (board[i - 1][j] == '.' && board[i][j - 1] == '.') count++;
                    } else if (i > 0) {
                        if (board[i - 1][j] == '.') count++;
                    } else if (j > 0) {
                        if (board[i][j - 1] == '.') count++;
                    } else {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
