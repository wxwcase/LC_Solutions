package test.lc_easy;

import main.lc_easy.LC263_UglyNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/3/2017.
 */
class LC263_UglyNumberTest {

    LC263_UglyNumber sol = new LC263_UglyNumber();

    @Test
    void oneTwoThreeFiveIsUgly() {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 5;
        assertTrue(sol.isUgly(n1));
        assertTrue(sol.isUgly(n2));
        assertTrue(sol.isUgly(n3));
        assertTrue(sol.isUgly(n4));
    }


}