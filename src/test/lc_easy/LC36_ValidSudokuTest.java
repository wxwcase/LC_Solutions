package test.lc_easy;

import main.lc_easy.LC36_ValidSudoku;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/6/2017.
 */
class LC36_ValidSudokuTest {

    LC36_ValidSudoku sol = new LC36_ValidSudoku();

    @Test
    void isValidSudoku() {
        char[][] board = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        };
        assertFalse(sol.isValidSudoku(board));
    }

}

//        "..4...63.",
//        ".........",
//        "5......9.",
//        "...56....",
//        "4.3.....1",
//        "...7.....",
//        "...5.....",
//        ".........",
//        "........."]