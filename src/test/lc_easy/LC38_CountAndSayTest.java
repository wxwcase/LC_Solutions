package test.lc_easy;

import main.lc_easy.LC38_CountAndSay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 1/5/17.
 */
class LC38_CountAndSayTest {

    LC38_CountAndSay sol = new LC38_CountAndSay();

    @Test
    void countAndSay1() {
        int n = 1;
        assertEquals("1", sol.countAndSay(n));
    }

    @Test
    void countAndSay2() {
        int n = 2;
        assertEquals("11", sol.countAndSay(n));
    }

    @Test
    void countAndSay3() {
        int n = 3;
        assertEquals("21", sol.countAndSay(n));
    }

    @Test
    void countAndSay4() {
        int n = 4;
        assertEquals("1211", sol.countAndSay(n));
    }

    @Test
    void countAndSay5() {
        int n = 5;
        assertEquals("111221", sol.countAndSay(n));
    }

}