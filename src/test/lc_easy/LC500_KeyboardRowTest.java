package test.lc_easy;

import main.lc_easy.LC500_KeyboardRow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/3/2017.
 */
class LC500_KeyboardRowTest {

    LC500_KeyboardRow sol;

    @BeforeEach
    void setUp() {
        sol = new LC500_KeyboardRow();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findWords() {
        String[] s1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] r1 = {"Alaska", "Dad"};
        assertArrayEquals(r1, sol.findWords(s1));
    }

}