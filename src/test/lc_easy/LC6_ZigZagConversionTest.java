package test.lc_easy;

import main.lc_easy.LC6_ZigZagConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/16/2017.
 */
class LC6_ZigZagConversionTest {

    LC6_ZigZagConversion sol = new LC6_ZigZagConversion();

    @Test
    void convertMoreThanOneRows() {
        String s = "PAYPALISHIRING";
        String r = "PAHNAPLSIIGYIR";
        int n = 3;
        assertEquals(r, sol.convert(s, n));
    }

    @Test
    void convertOneRow() {
        String s = "AB";
        String r = "AB";
        int n = 1;
        assertEquals(r, sol.convert(s, n));
    }

}