package test.lc_easy;

import main.lc_easy.LC344_ReverseString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by wwang on 12/13/2016.
 */
public class LC344_ReverseStringTest {

    LC344_ReverseString sol;

    @Before
    public void setUp() {
       sol = new LC344_ReverseString();
    }

    @After
    public void tearDown() {
        sol = null;
    }

    @Test
    public void testReverseEmptyString() {
        String res = sol.reverseString("");
        assertEquals(res, "");
    }

    @Test
    public void testReverseNotEmptyString() {
        String res = sol.reverseString("abc");
        assertEquals(res, "cba");
    }

    @Test
    public void testReverseSingleCharacterString() {
        String res = sol.reverseString("a");
        assertEquals(res, "a");
    }
}
