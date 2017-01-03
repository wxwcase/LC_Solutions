package test.lc_easy;

import main.lc_easy.LC461_HammingDistance;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/21/2016.
 */
class LC461_HammingDistanceTest {

    LC461_HammingDistance sol;

    @BeforeEach
    void setUp() {
        sol = new LC461_HammingDistance();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void hammingDistanceDifferentInputs() {
        int x1 = 1, y1 = 4, r1 = 2;
        int x2 = 3, y2 = 89, r2 = 4;
        assertEquals(r1, sol.hammingDistance(x1, y1));
        assertEquals(r2, sol.hammingDistance(x2, y2));
    }

    @Test
    void hammingDistanceSameInputs() {
        int x = 4, y = 4, r = 0;
        assertEquals(r, sol.hammingDistance(x, y));
    }

}