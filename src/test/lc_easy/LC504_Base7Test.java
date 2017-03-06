package test.lc_easy;

import main.lc_easy.LC504_Base7;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/5/17.
 */
class LC504_Base7Test {

    LC504_Base7 sol;

    @BeforeEach
    void setUp() {
        sol = new LC504_Base7();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void test1() {
        int n = 100;
        String r = "202";
        assertEquals(r, sol.convertToBase7(n));
    }

    @Test
    void test2() {
        int n = -7;
        String r = "-10";
        assertEquals(r, sol.convertToBase7(n));
    }

}