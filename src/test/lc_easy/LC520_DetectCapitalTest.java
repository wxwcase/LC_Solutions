package test.lc_easy;

import main.lc_easy.LC520_DetectCapital;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/3/17.
 */
class LC520_DetectCapitalTest {

    LC520_DetectCapital sol;

    @BeforeEach
    void setUp() {
        sol = new LC520_DetectCapital();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void detectCapitalUseAllCaps() {
        String s = "USA";
        assertTrue(sol.detectCapitalUse(s));
    }

    @Test
    void detectCapitalUseAllLower() {
        String s = "leetcode";
        assertTrue(sol.detectCapitalUse(s));
    }

    @Test
    void detectCapitalUseCap() {
        String s = "False";
        assertTrue(sol.detectCapitalUse(s));
    }

    @Test
    void detectCapitalFalse() {
        String s1 = "FalsE";
        String s2 = "TrUe";
        String s3 = "NeiThEr";
        assertFalse(sol.detectCapitalUse(s1));
        assertFalse(sol.detectCapitalUse(s2));
        assertFalse(sol.detectCapitalUse(s3));
    }

}