package test.lc_easy;

import main.lc_easy.LC405_ConvertANumber2Hex;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/23/2016.
 */
class LC405_ConvertANumber2HexTest {

    LC405_ConvertANumber2Hex sol;

    @BeforeEach
    void setUp() {
        sol = new LC405_ConvertANumber2Hex();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void toHexNegativeOne() {
        int i = -1;
        String o = "ffffffff";
        assertEquals(o, sol.toHex(i));
    }

    @Test
    void toHexTwentySix() {
        int i = 26;
        String o = "1a";
        assertEquals(o, sol.toHex(i));
    }

}