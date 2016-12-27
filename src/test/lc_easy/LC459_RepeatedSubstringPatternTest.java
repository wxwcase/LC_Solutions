package test.lc_easy;

import main.lc_easy.LC459_RepeatedSubstringPattern;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 12/26/16.
 */
class LC459_RepeatedSubstringPatternTest {

    LC459_RepeatedSubstringPattern sol;

    @BeforeEach
    void setUp() {
        sol = new LC459_RepeatedSubstringPattern();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void repeatedSubstringPattern() {
        String a1 = "abab", a2 = "aba", a3 = "abcabcabcabc";
        assertTrue(sol.repeatedSubstringPattern(a1));
        assertFalse(sol.repeatedSubstringPattern(a2));
        assertTrue(sol.repeatedSubstringPattern(a3));
    }

}