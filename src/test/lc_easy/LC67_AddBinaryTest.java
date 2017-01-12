package test.lc_easy;

import main.lc_easy.LC67_AddBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/11/2017.
 */
class LC67_AddBinaryTest {

    LC67_AddBinary sol = new LC67_AddBinary();

    @Test
    void addBinaryInvalidCases() {
        String a1 = null, b1 = "10";
        String a2 = "", b2 = null;
        assertEquals("", sol.addBinary(a1, b1));
        assertEquals("", sol.addBinary(a2, b2));
    }

    @Test
    void addBinaryEdgeCases() {
        String a1 = "", b1 = "101";
        String a2 = "11", b2 = "";
        assertEquals(b1, sol.addBinary(a1, b1));
        assertEquals(a2, sol.addBinary(a2, b2));
    }

    @Test
    void addBinary() {
        String a1 = "111", b1 = "1", r1 = "1000";
        String a2 = "111", b2 = "0", r2 = "111";
        String a3 = "101", b3 = "11", r3 = "1000";
        String a4 = "110", b4 = "1101", r4 = "10011";
        assertEquals(r1, sol.addBinary(a1, b1));
        assertEquals(r2, sol.addBinary(a2, b2));
        assertEquals(r3, sol.addBinary(a3, b3));
        assertEquals(r4, sol.addBinary(a4, b4));
    }

}