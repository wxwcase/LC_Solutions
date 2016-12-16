package test.lc_easy;

import main.lc_easy.LC387_FirstUniqueCharInAString;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/16/2016.
 */
class LC387_FirstUniqueCharInAStringTest {

    LC387_FirstUniqueCharInAString sol;

    @BeforeEach
    void setUp() {
        sol = new LC387_FirstUniqueCharInAString();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void firstUniqCharTests() {

        String s1 = "leetcode";
        int i1 = 0;

        String s2 = "loveleetcode";
        int i2 = 2;

        assertEquals(0, sol.firstUniqChar(s1));
        assertEquals(2, sol.firstUniqChar(s2));
    }

}