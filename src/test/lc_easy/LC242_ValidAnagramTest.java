package test.lc_easy;

import main.lc_easy.LC242_ValidAnagram;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/16/2016.
 */
class LC242_ValidAnagramTest {

    LC242_ValidAnagram sol;

    @BeforeEach
    void setUp() {
        sol = new LC242_ValidAnagram();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void isAnagram() {
        String s1 = "anagram", t1 = "nagaram";
        assertTrue(sol.isAnagram(s1, t1));
        assertTrue(sol.isAnagram2(s1, t1));
    }

    @Test
    void isNotAnagram() {
        String s1 = "rat", t1 = "car";
        assertFalse(sol.isAnagram(s1, t1));
        assertFalse(sol.isAnagram2(s1, t1));
    }

}