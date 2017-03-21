package test.lc_medium;

import main.lc_medium.LC516_LongestPalindromicSubsequence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/21/2017.
 */
class LC516_LongestPalindromicSubsequenceTest {

    LC516_LongestPalindromicSubsequence sol;

    @BeforeEach
    void setUp() {
        sol = new LC516_LongestPalindromicSubsequence();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void longestPalindromeSubseq1() {
        String s = "a";
        int r = 1;
        assertEquals(r, sol.longestPalindromeSubseq(s));
    }

    @Test
    void longestPalindromeSubseq2() {
        String s = "cbba";
        int r = 2;
        assertEquals(r, sol.longestPalindromeSubseq(s));
    }

    @Test
    void longestPalindromeSubseq3() {
        String s = "abbcbb";
        int r = 5;
        assertEquals(r, sol.longestPalindromeSubseq(s));
    }
}