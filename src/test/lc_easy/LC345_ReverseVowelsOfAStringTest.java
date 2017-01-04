package test.lc_easy;

import main.lc_easy.LC345_ReverseVowelsOfAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/4/2017.
 */
class LC345_ReverseVowelsOfAStringTest {

    LC345_ReverseVowelsOfAString sol = new LC345_ReverseVowelsOfAString();

    @Test
    void reverseVowelsNormalStringThatContainsMoreThanOneVowels() {
        String s = "hello";
        assertEquals("holle", sol.reverseVowels(s));
    }

    @Test
    void reverseVowelsZeroLengthString() {
        String s = "";
        String s2 = null;
        assertEquals("", sol.reverseVowels(s));
        assertEquals("", sol.reverseVowels(s2));
    }

    @Test
    void reverseVowelsOneVowelString() {
        String s = "hell";
        assertEquals("hell", sol.reverseVowels(s));
    }

}