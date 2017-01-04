package test.lc_easy;

import main.lc_easy.LC441_ArrangingCoins;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 1/4/2017.
 */
class LC441_ArrangingCoinsTest {

    LC441_ArrangingCoins sol = new LC441_ArrangingCoins();

    @Test
    void arrangeThreeCoins() {
        int n = 3;
        assertEquals(2, sol.arrangeCoins(n));
    }

    @Test
    void arrangeZeroCoins() {
        int n = 0;
        assertEquals(0, sol.arrangeCoins(n));
    }

    @Test
    void arrangeOneCoins() {
        int n = 1;
        assertEquals(1, sol.arrangeCoins(n));
    }

    @Test
    void arrangeEightCoins() {
        int n = 8;
        assertEquals(3, sol.arrangeCoins(n));
    }

    @Test
    void arrangeFiveCoins() {
        int n = 5;
        assertEquals(2, sol.arrangeCoins(n));
    }

    @Test
    void arrangeALargeNumberOfCoins() {
        int n = 1804289383;
        assertEquals(60070, sol.arrangeCoins(n));
    }
}