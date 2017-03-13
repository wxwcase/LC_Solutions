package test.lc_medium;

import main.lc_easy.LC504_Base7;
import main.lc_medium.LC5_LongestPalindromicSubstring;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/12/17.
 */
class LC5_LongestPalindromicSubstringTest {

    LC5_LongestPalindromicSubstring sol;

    @BeforeEach
    void setUp() {
        sol = new LC5_LongestPalindromicSubstring();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void test1() {
        String s = "babad";
        assertEquals("bab", sol.longestPalindrome(s));
    }

    @Test
    void test2() {
        String s = "cbbd";
        assertEquals("bb", sol.longestPalindrome(s));
    }

    @Test
    void test3() {
        String s = "forgeeksskeegfor";
        assertEquals("geeksskeeg", sol.longestPalindrome(s));
    }

    @Test
    void test4() {
        String s = "abcbabcbabcba";
        assertEquals("abcbabcbabcba", sol.longestPalindrome(s));
    }
}