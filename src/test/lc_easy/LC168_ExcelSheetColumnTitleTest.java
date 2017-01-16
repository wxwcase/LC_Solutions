package test.lc_easy;

import main.lc_easy.LC168_ExcelSheetColumnTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/16/2017.
 */
class LC168_ExcelSheetColumnTitleTest {

    LC168_ExcelSheetColumnTitle sol = new LC168_ExcelSheetColumnTitle();

    @Test
    void convertToTitleSingleColumn() {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 26;
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "Z";
        assertEquals(s1, sol.convertToTitle(n1));
        assertEquals(s2, sol.convertToTitle(n2));
        assertEquals(s3, sol.convertToTitle(n3));
        assertEquals(s4, sol.convertToTitle(n4));
        assertEquals(s5, sol.convertToTitle(n5));
    }

    @Test
    void conertToTitleDoubleColumn() {
        int n1 = 27;
        int n2 = 28;
        int n3 = 29;
        int n4 = 30;
        String s1 = "AA";
        String s2 = "AB";
        String s3 = "AC";
        String s4 = "AD";
        assertEquals(s1, sol.convertToTitle(n1));
        assertEquals(s2, sol.convertToTitle(n2));
        assertEquals(s3, sol.convertToTitle(n3));
        assertEquals(s4, sol.convertToTitle(n4));
    }

}