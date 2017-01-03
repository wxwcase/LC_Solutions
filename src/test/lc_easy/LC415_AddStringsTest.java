package test.lc_easy;

import main.lc_easy.LC415_AddStrings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/23/2016.
 */
class LC415_AddStringsTest {

    LC415_AddStrings sol;

    @BeforeEach
    void setUp() {
        sol = new LC415_AddStrings();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void addStringWithEmptyOrNullInput() {
        String a1 = "", b1 = "123", r1 = "123";
        String a2 = null, b2 = "123", r2 = "123";
        String a3 = null, b3 = "", r3 = "";
        assertEquals(r1, sol.addString(a1, b1));
        assertEquals(r2, sol.addString(a2, b2));
        assertEquals(r3, sol.addString(a3, b3));
    }

    @Test
    void addStringWithBothNotEmpty() {
        String a1 = "123", b1 = "45", r1 = "168";
        String a2 = "45381", b2 = "963928173", r2 = "963973554";
        String a3 = "1", b3 = "9", r3 = "10";
        assertEquals(r1, sol.addString(a1, b1));
        assertEquals(r2, sol.addString(a2, b2));
        assertEquals(r3, sol.addString(a3, b3));
    }


}