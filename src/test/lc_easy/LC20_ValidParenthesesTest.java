package test.lc_easy;

import main.lc_easy.LC20_ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/10/2017.
 */
class LC20_ValidParenthesesTest {

    LC20_ValidParentheses sol = new LC20_ValidParentheses();

    @Test
    void isValidNoNesting() {
        String s = "()[]{}";
        assertTrue(sol.isValid(s));
    }

    @Test
    void isValidNesting() {
        String s = "([]){}[{()}]";
        assertTrue(sol.isValid(s));
    }

    @Test
    void isNotValid() {
        String s = "[{]}";
        assertFalse(sol.isValid(s));
    }

}