package test.lc_easy;

import main.lc_easy.LC448_FindAllNumsDisappearedInAnArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/21/2016.
 */
class LC448_FindAllNumsDisappearedInAnArrayTest {

    LC448_FindAllNumsDisappearedInAnArray sol;

    @BeforeEach
    void setUp() {
        sol = new LC448_FindAllNumsDisappearedInAnArray();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findDisappearedNumbers() {

        int[] x = {4, 3, 2, 7, 8, 2, 3, 1}, r = {5, 6};

        List<Integer> lst = sol.findDisappearedNumbers(x);
        int[] res = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            res[i] = lst.get(i);
        }
        Arrays.sort(res);
        Arrays.sort(r);

        assertArrayEquals(r, res);
    }

}