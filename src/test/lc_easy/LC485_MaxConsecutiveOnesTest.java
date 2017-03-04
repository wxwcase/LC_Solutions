package test.lc_easy;

import main.lc_easy.LC485_MaxConsecutiveOnes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wxwcase on 3/3/17.
 */
class LC485_MaxConsecutiveOnesTest {

    LC485_MaxConsecutiveOnes sol;

    @BeforeEach
    void setUp() {
        sol = new LC485_MaxConsecutiveOnes();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findMaxConsecutiveOnesThree() {

        int[] n = {1, 1, 0, 1, 1, 1};

        assertEquals(3, sol.findMaxConsecutiveOnes(n));
    }

    @Test
    void findMaxConsecutiveOnesFive() {

        int[] n = {1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1};

        assertEquals(5, sol.findMaxConsecutiveOnes(n));
    }

    @Test
    void findMaxConsecutiveOnesFour() {

        int[] n = {0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1};

        assertEquals(4, sol.findMaxConsecutiveOnes(n));
    }
}