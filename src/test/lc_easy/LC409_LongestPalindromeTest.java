package test.lc_easy;

import main.lc_easy.LC409_LongestPalindrome;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 12/18/16.
 */
class LC409_LongestPalindromeTest {

    LC409_LongestPalindrome sol;

    @BeforeEach
    void setUp() {
        sol = new LC409_LongestPalindrome();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void longestPalindromeTest01() {
        String s = "abccccdd";
        int r = 7;
        assertEquals(r, sol.longestPalindrome(s));
    }

}