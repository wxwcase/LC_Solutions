package test.lc_easy;

import main.lc_easy.LC14_LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/11/2017.
 */
class LC14_LongestCommonPrefixTest {

    LC14_LongestCommonPrefix sol = new LC14_LongestCommonPrefix();

    @Test
    void longestCommonPrefix1() {
        String[] s = {"aa", "aa"};
        assertEquals("aa", sol.longestCommonPrefix(s));
    }

    @Test
    void longestCommonPrefix2() {
        String[] s = {"flower", "flow", "flight"};
        assertEquals("fl", sol.longestCommonPrefix(s));
    }

}