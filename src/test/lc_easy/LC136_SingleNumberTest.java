package test.lc_easy;

import main.lc_easy.LC136_SingleNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC136_SingleNumberTest {

    LC136_SingleNumber sol;

    @BeforeEach
    void setUp() {
        sol = new LC136_SingleNumber();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void singleNumberEmptyArray() {
        int[] nums = {};
        assertEquals(0, sol.singleNumber(nums));
    }

    @Test
    void singleNumberSingleElmenetArray() {
        int[] nums = {1};
        assertEquals(1, sol.singleNumber(nums));
    }

    @Test
    void singleNumberMoreThan1ElementArray() {
        int[] nums = {1, 2, 3, 2, 1};
        assertEquals(3, sol.singleNumber(nums));
    }

}