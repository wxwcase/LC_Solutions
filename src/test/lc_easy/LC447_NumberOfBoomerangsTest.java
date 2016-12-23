package test.lc_easy;

import main.lc_easy.LC447_NumberOfBoomerangs;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/23/2016.
 */
class LC447_NumberOfBoomerangsTest {

    LC447_NumberOfBoomerangs sol;

    @BeforeEach
    void setUp() {
        sol = new LC447_NumberOfBoomerangs();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void numberOfBoomerangs() {
        int[][] a = {
                {0, 0},
                {0, 1},
                {0, 2}
        };
        assertEquals(2, sol.numberOfBoomerangs(a));
    }

}