package test.lc_easy;

import main.lc_easy.LC290_WordPattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/10/2017.
 */
class LC290_WordPatternTest {

    LC290_WordPattern sol = new LC290_WordPattern();

    @Test
    void wordPatternValid() {
        String p = "abba", s = "dog egg egg dog";
        assertTrue(sol.wordPattern(p, s));
    }

    @Test
    void wordPatternNotValid() {
        String p = "abba", s = "dog cat cat fish";
        assertFalse(sol.wordPattern(p, s));
    }

    @Test
    void wordPatternNotValidPatternsLessThanSplits() {
        String p = "aaaa", s = "dog egg egg dog";
        assertFalse(sol.wordPattern(p, s));
    }

    @Test
    void wordPatternNotValidPatternsMoreThanSplits() {
        String p = "abba", s = "dog dog dog dog";
        assertFalse(sol.wordPattern(p, s));
    }

}