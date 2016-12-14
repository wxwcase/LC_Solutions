package test.lc_easy;

import main.lc_easy.LC292_NimGame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/14/2016.
 */
class LC292_NimGameTest {

    LC292_NimGame sol;

    @BeforeEach
    void setUp() {
        sol = new LC292_NimGame();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void testCanWinNimLessThanFour() {
        int input01 = 0;
        assertFalse(sol.canWinNim(input01));
    }

    @Test
    void testCanWinNimWithMultiplyOfFour() {
        int input01 = 4, input02 = 8, input03 = 12;
        assertFalse(sol.canWinNim(input01));
        assertFalse(sol.canWinNim(input02));
        assertFalse(sol.canWinNim(input03));
    }

}