package test.lc_medium;

import main.lc_medium.LC526_BeautifulArrangement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/9/2017.
 */
class LC526_BeautifulArrangementTest {

    LC526_BeautifulArrangement sol;

    @BeforeEach
    void setUp() {
        sol = new LC526_BeautifulArrangement();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void countArrangement() {
        int n = 2;
        assertEquals(2, sol.countArrangement(n));
    }

}