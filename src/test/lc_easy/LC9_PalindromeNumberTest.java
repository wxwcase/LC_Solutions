package test.lc_easy;

import main.lc_easy.LC9_PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/5/2017.
 */
class LC9_PalindromeNumberTest {

    LC9_PalindromeNumber sol = new LC9_PalindromeNumber();

    @Test
    void isNotPalindrome() {
        int n = 123;
        assertFalse(sol.isPalindrome(n));
    }

    @Test
    void isPalindrome() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 11;
        int n4 = 121;
        int n5 = 12321;
        int n6 = 123321;
        assertTrue(sol.isPalindrome(n1));
        assertTrue(sol.isPalindrome(n2));
        assertTrue(sol.isPalindrome(n3));
        assertTrue(sol.isPalindrome(n4));
        assertTrue(sol.isPalindrome(n5));
        assertTrue(sol.isPalindrome(n6));
    }

}