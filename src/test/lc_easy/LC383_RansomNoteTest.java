package test.lc_easy;

import main.lc_easy.LC383_RansomNote;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC383_RansomNoteTest {

    LC383_RansomNote sol;

    @BeforeEach
    void setUp() {
        sol = new LC383_RansomNote();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void cannotConstructSingleCharacter() {
        String a = "a", b = "b";
        assertFalse(sol.canConstruct(a, b));
    }

    @Test
    void cannotConstructDoubleCharacters() {
        String a = "aa", b = "ab";
        assertFalse(sol.canConstruct(a, b));
    }

    @Test
    void canConstructString() {
        String a = "aa", b = "aab";
        assertTrue(sol.canConstruct(a, b));
    }

}