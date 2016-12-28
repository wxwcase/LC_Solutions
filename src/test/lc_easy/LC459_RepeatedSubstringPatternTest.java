package test.lc_easy;

import main.lc_easy.LC459_RepeatedSubstringPattern;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
<<<<<<< Updated upstream
 * Created by wxwcase on 12/26/16.
=======
 * Created by wwang on 12/23/2016.
>>>>>>> Stashed changes
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

    @Ignore
    void repeatedSubstringPattern() {
        String a1 = "abab", a2 = "aba", a3 = "abcabcabcabc", a4 = "b";
        assertTrue(sol.repeatedSubstringPattern(a1));
        assertFalse(sol.repeatedSubstringPattern(a2));
        assertTrue(sol.repeatedSubstringPattern(a3));
    }

    @Test
    void repeatedSubstringPatternTrue() {
        String a = "abab", c = "cdcdcd", d = "aabbccaabbcc";
        assertTrue(sol.repeatedSubstringPattern(a));
        assertTrue(sol.repeatedSubstringPattern(c));
        assertTrue(sol.repeatedSubstringPattern(d));
    }

    @Test
    void repeatedSubstringPatternFalse() {
        String a = "ab", b = "aba", c = "abc", d = "aabbcc";
        assertFalse(sol.repeatedSubstringPattern(a));
        assertFalse(sol.repeatedSubstringPattern(b));
        assertFalse(sol.repeatedSubstringPattern(c));
        assertFalse(sol.repeatedSubstringPattern(d));
    }
}