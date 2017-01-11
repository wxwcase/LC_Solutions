package test.lc_easy;

import main.lc_easy.LC475_Heaters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/11/2017.
 */
class LC475_HeatersTest {

    LC475_Heaters sol = new LC475_Heaters();

    @Test
    void findRadius1() {
        int[] s1 = {1, 2, 3}, t1 = {1};
        int r1 = 2;
        assertEquals(r1, sol.findRadius(s1, t1));
    }

    @Test
    void findRadius2() {
        int[] s2 = {1, 2, 3, 4}, t2 = {1, 4};
        int r2 = 1;
        assertEquals(r2, sol.findRadius(s2, t2));
    }

    @Test
    void findRadius3() {
        int[] s3 = {1, 2, 3, 5, 15}, t3 = {2, 30};
        int r3 = 13;
        assertEquals(r3, sol.findRadius(s3, t3));
    }
}