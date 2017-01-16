package test.lc_easy;

import main.lc_easy.LC125_ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/16/2017.
 */
class LC125_ValidPalindromeTest {

    LC125_ValidPalindrome sol = new LC125_ValidPalindrome();

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(sol.isPalindrome(s));
    }

    @Test
    void isNotPalindrome() {
        String s = "race a car";
        String s2 = "0p";
        assertFalse(sol.isPalindrome(s));
        assertFalse(sol.isPalindrome(s2));
    }

    @Test
    void isPalindromeNoCharacters() {
        String s = ",.";
        assertTrue(sol.isPalindrome(s));
    }

}