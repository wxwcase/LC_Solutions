package test.lc_medium;

import main.lc_medium.LC481_MagicalString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/20/2017.
 */
class LC481_MagicalStringTest {

    LC481_MagicalString sol = new LC481_MagicalString();

    @Test
    void magicalString55() {
        int n = 55, r = 28;
        assertEquals(r, sol.magicalString(n));
    }

    @Test
    void magicalStringOne() {
        int n = 1, r = 1;
        assertEquals(r, sol.magicalString(n));
    }

}