package test.lc_medium;

import main.lc_medium.LC423_ReconstructOriginalDigitsFromEnglish;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/10/17.
 */
class LC423_ReconstructOriginalDigitsFromEnglishTest {

    LC423_ReconstructOriginalDigitsFromEnglish sol;

    @BeforeEach
    void setUp() {
        sol = new LC423_ReconstructOriginalDigitsFromEnglish();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void test012() {
        String s = "owoztneoer";
        assertEquals("012", sol.originalDigits(s));
    }

    @Test
    void test45() {
        String s = "fviefuro";
        assertEquals("45", sol.originalDigits(s));
    }

}