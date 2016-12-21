package test.lc_easy;

import main.lc_easy.LC13_RomanToInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/21/2016.
 */
class LC13_RomanToIntegerTest {

    LC13_RomanToInteger sol;

    @BeforeEach
    void setUp() {
        sol = new LC13_RomanToInteger();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void romainToInt() {
        String s = "DCXXI";
        int r = 621;
        assertEquals(r, sol.romainToInt(s));
    }

}