package test.lc_hard;

import main.lc_hard.LC305_NumberOfIslandsII;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/23/2017.
 */
class LC305_NumberOfIslandsIITest {

    LC305_NumberOfIslandsII sol;

    @BeforeEach
    void setUp() {
        sol = new LC305_NumberOfIslandsII();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void numIslands1() {
        int m = 2;
        int n = 2;
        int[][] pos = new int[3][2];
        pos[0][0] = 0;
        pos[0][1] = 0;
        pos[1][0] = 1;
        pos[1][1] = 1;
        pos[2][0] = 0;
        pos[2][1] = 1;
        List<Integer> r = new LinkedList<>();
        r.add(1);
        r.add(2);
        r.add(1);
        int c = 0;
        for (int i : sol.numIslands2(m, n, pos)) {
            assertEquals(i, (int)r.get(c++));
        }
    }

    @Test
    void numIsland2() {
        int m = 3;
        int n = 3;
        int[][] pos = new int[7][2];
        pos[0][0] = 0;
        pos[0][1] = 1;
        pos[1][0] = 1;
        pos[1][1] = 2;
        pos[2][0] = 2;
        pos[2][1] = 1;
        pos[3][0] = 1;
        pos[3][1] = 0;
        pos[4][0] = 0;
        pos[4][1] = 2;
        pos[5][0] = 0;
        pos[5][1] = 0;
        pos[6][0] = 1;
        pos[6][1] = 1;
        List<Integer> r = new LinkedList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(3);
        r.add(2);
        r.add(1);
        int c = 0;
        for (int i : sol.numIslands2(m, n, pos)) {
            assertEquals(i, (int)r.get(c++));
        }
    }

}