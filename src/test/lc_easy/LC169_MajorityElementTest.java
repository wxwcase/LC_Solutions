package test.lc_easy;

import main.lc_easy.LC169_MajorityElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/16/2016.
 */
class LC169_MajorityElementTest {

    LC169_MajorityElement sol;

    @BeforeEach
    void setUp() {
        sol = new LC169_MajorityElement();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void majorityElementTest() {
        int[] a = {1, 1, 2};
        int[] b = {1, 1, 1};
        int[] c = {1, 1, 2, 2, 2};
        assertEquals(1, sol.majorityElement(a));
        assertEquals(1, sol.majorityElement(b));
        assertEquals(2, sol.majorityElement(c));
    }

}