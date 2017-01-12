package test.lc_easy;

import main.lc_easy.LC205_IsomorphicStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/9/2017.
 */
class LC205_IsomorphicStringsTest {

    LC205_IsomorphicStrings sol = new LC205_IsomorphicStrings();

    @Test
    void isIsomorphic() {
        String s = "egg", t = "add";
        assertTrue(sol.isIsomorphic(s, t));

        String a = "paper", b = "title";
        assertTrue(sol.isIsomorphic(a, b));
    }

    @Test
    void isNotIsomorphic() {
        String s = "foo", t = "bar";
        assertFalse(sol.isIsomorphic(s, t));

        String a = "aa", b = "ab";
        assertFalse(sol.isIsomorphic(a, b));
    }

}