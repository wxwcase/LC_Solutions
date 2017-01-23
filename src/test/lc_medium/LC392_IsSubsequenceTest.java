package test.lc_medium;

import main.lc_medium.LC392_IsSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/23/2017.
 */
class LC392_IsSubsequenceTest {

    LC392_IsSubsequence sol = new LC392_IsSubsequence();

    @Test
    void isSubsequence() {
        String s = "abc", t = "ahbgdc";
        assertTrue(sol.isSubsequence(s, t));
    }

    @Test
    void isNotSubsequence() {
        String s= "axc", t = "ahbgdc";
        assertFalse(sol.isSubsequence(s, t));
    }

}