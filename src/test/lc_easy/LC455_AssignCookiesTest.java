package test.lc_easy;

import main.lc_easy.LC455_AssignCookies;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC455_AssignCookiesTest {

    LC455_AssignCookies sol;

    @BeforeEach
    void setUp() {
        sol = new LC455_AssignCookies();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findContentChildrenExample1() {
        int[] a = {1, 2, 3}, b = {1, 1};
        int out = 1;
        assertEquals(out, sol.findContentChildren(a, b));
    }

    @Test
    void findContentChildrenExample2() {
        int[] a = {1, 2}, b = {1, 2, 3};
        int out = 2;
        assertEquals(out, sol.findContentChildren(a, b));
    }

    @Test
    void findContentChildrenExample3() {
        int[] a = {10, 9, 8, 7}, b = {5, 6, 7, 8};
        int out = 2;
        assertEquals(out, sol.findContentChildren(a, b));
    }
}