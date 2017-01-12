package main.lc_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wwang on 1/6/2017.
 */
public class LC36_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        // checking rows
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!set.add(c)) return false;
                }
            }
        }

        // checking columns
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (!set.add(c)) return false;
                }
            }
        }

        // checking sub matrix
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                set.clear();
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        char c = board[i + m][j + n];
                        if (c != '.') {
                            if (!set.add(c)) return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
