package test.lc_easy;

import main.lc_easy.LC476_NumberComplement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 3/3/2017.
 */
class LC476_NumberComplementTest {

    LC476_NumberComplement sol;

    @BeforeEach
    void setUp() {
        sol = new LC476_NumberComplement();
    }

    @AfterEach
    void tearDown() {
        sol = null;
    }

    @Test
    void findComplementLessThan10() {
        int n1 = 1;
        int n2 = 5;
        assertEquals(0, sol.findComplement(n1));
        assertEquals(2, sol.findComplement(n2));
    }

    @Test
    void findComplementBigNum() {
        int n = 2147483647; // Integer.MAX_VALUE;
        assertEquals(0, sol.findComplement(n));
    }

}