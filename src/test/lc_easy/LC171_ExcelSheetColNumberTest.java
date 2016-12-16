package test.lc_easy;

import main.lc_easy.LC171_ExcelSheetColNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/16/2016.
 */
class LC171_ExcelSheetColNumberTest {

    LC171_ExcelSheetColNumber sol;

    @BeforeEach
    void setUp() {
        sol = new LC171_ExcelSheetColNumber();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void titleToNumberSingleColumnChar() {
        String s1 = "A", s2 = "C", s3 = "Z";
        assertEquals(1, sol.titleToNumber(s1));
        assertEquals(3, sol.titleToNumber(s2));
        assertEquals(26, sol.titleToNumber(s3));
    }

    @Test
    void titleToNumberDoubleColumnChars() {
        String s1 = "AA", s2 = "AB", s3 = "ZD";
        assertEquals(27, sol.titleToNumber(s1));
        assertEquals(28, sol.titleToNumber(s2));
        assertEquals(680, sol.titleToNumber(s3));
    }

    @Test
    void titleToNumberTripleColumnChars() {
        String s1 = "AAA", s2 = "ABC", s3 = "ZDZ";
        assertEquals(703, sol.titleToNumber(s1));
        assertEquals(731, sol.titleToNumber(s2));
        assertEquals(17706, sol.titleToNumber(s3));
    }


}