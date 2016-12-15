package test.lc_easy;

import main.lc_easy.LC283_MoveZeros;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/15/2016.
 */
class LC283_MoveZerosTest {

    LC283_MoveZeros sol;

    @BeforeEach
    void setUp() {
        sol = new LC283_MoveZeros();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void moveZerosExample1() {
        int[] a = {0, 1, 0, 3, 12}, b = {1, 3, 12, 0, 0};
        sol.moveZeros(a);
        assertArrayEquals(b, a);
    }

}