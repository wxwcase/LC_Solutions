package test.lc_easy;

import main.lc_easy.LC389_FindTheDifference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC389_FindTheDifferenceTest {

    LC389_FindTheDifference sol;

    @BeforeEach
    void setUp() {
        sol = new LC389_FindTheDifference();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findTheDifferenceSingleCharacterArray() {
        String a = "aaa", b = "aaaa";
        assertEquals('a', sol.findTheDifference(a, b));
    }

    @Test
    void findTheDifferenceNormalArray() {
        String a = "adef", b = "faedk";
        assertEquals('k', sol.findTheDifference(a, b));
    }

}