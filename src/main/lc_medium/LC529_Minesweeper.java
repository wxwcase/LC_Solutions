package main.lc_medium;

/**
 * Created by wxwcase on 3/8/17.
 */
public class LC529_Minesweeper {

    public char[][] updateBoard(char[][] board, int[] click) {

        // invalid input
        if (board == null || click == null) return null;

        // no click
        if (click.length == 0) return board;

        int height = board.length;
        int width = board[0].length;
        int x = click[0];
        int y = click[1];

        // Game over!
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        return reveal(board, x, y);
    }

    // assume valid board and not click on mine
    private char[][] reveal(char[][] board, int x, int y) {

        int height = board.length;
        int width = board[0].length;

        // Blank square
        int mines = getAdjacentMineNum(board, x, y);

        // the click has adjacent mines
        if (mines > 0) {
            board[x][y] = (char)((int)'0' + mines);
        } else {
            board[x][y] = 'B';
            if (x > 0 && board[x - 1][y] == 'E') {
                board = reveal(board, x - 1, y);
            }
            if (x < height - 1 && board[x + 1][y] == 'E') {
                board = reveal(board, x + 1, y);
            }
            if (y > 0 && board[x][y - 1] == 'E') {
                board = reveal(board, x, y - 1);
            }
            if (y < width - 1 && board[x][y + 1] == 'E') {
                board = reveal(board, x, y + 1);
            }
            if (x > 0 && y > 0 && board[x - 1][y - 1] == 'E') {
                board = reveal(board, x - 1, y - 1);
            }
            if (x < height - 1 && y < width - 1 && board[x + 1][y + 1] == 'E') {
                board = reveal(board, x + 1, y + 1);
            }
            if (x > 0 && y < width - 1 && board[x - 1][y + 1] == 'E') {
                board = reveal(board, x - 1, y + 1);
            }
            if (x < height - 1 && y > 0 && board[x + 1][y - 1] == 'E') {
                board = reveal(board, x + 1, y - 1);
            }
        }

        return board;
    }

    // assume the click is not a mine
    private int getAdjacentMineNum(char[][] board, int x, int y) {

        int mines = 0;
        int height = board.length;
        int width = board[0].length;

        if (x > 0) {
            mines += board[x - 1][y] == 'M' ? 1 : 0;
        }
        if (x < height - 1) {
            mines += board[x + 1][y] == 'M' ? 1 : 0;
        }
        if (y > 0) {
            mines += board[x][y - 1] == 'M' ? 1 : 0;
        }
        if (y < width - 1) {
            mines += board[x][y + 1] == 'M' ? 1 : 0;
        }
        if (x > 0 && y > 0) {
            mines += board[x - 1][y - 1] == 'M' ? 1 : 0;
        }
        if (x < height - 1 && y < width - 1) {
            mines += board[x + 1][y + 1] == 'M' ? 1 : 0;
        }
        if (x > 0 && y < width - 1) {
            mines += board[x - 1][y + 1] == 'M' ? 1 : 0;
        }
        if (x < height - 1 && y > 0) {
            mines += board[x + 1][y - 1] == 'M' ? 1 : 0;
        }

        return mines;
    }

}
