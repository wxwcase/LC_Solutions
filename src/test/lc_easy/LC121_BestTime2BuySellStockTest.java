package test.lc_easy;

import main.lc_easy.LC121_BestTime2BuySellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wwang on 12/28/2016.
 */
class LC121_BestTime2BuySellStockTest {

    LC121_BestTime2BuySellStock sol = new LC121_BestTime2BuySellStock();

    @Test
    void maxProfit() {
        int[] a1 = {7, 1, 5, 3, 6, 4};
        int[] a2 = {7, 6, 4, 3, 1};
        assertEquals(5, sol.maxProfit(a1));
        assertEquals(0, sol.maxProfit(a2));
    }

    @Test
    void maxProfitBF() {
        int[] a1 = {7, 1, 5, 3, 6, 4};
        int[] a2 = {7, 6, 4, 3, 1};
        assertEquals(5, sol.maxProfitBF(a1));
        assertEquals(0, sol.maxProfitBF(a2));
    }

    @Test
    void maxProfitDP2() {
        int[] a1 = {7, 1, 5, 3, 6, 4};
        int[] a2 = {7, 6, 4, 3, 1};
        int[] a3 = {2, 1, 2, 0, 1};
        assertEquals(5, sol.maxProfitDP(a1));
        assertEquals(0, sol.maxProfitDP(a2));
        assertEquals(1, sol.maxProfitDP(a3));
    }

    @Test
    void maxProfitDPWeb() {
        int[] a1 = {7, 1, 5, 3, 6, 4};
        int[] a2 = {7, 6, 4, 3, 1};
        int[] a3 = {2, 1, 2, 0, 1};
        assertEquals(5, sol.maxProfitDPWeb(a1));
        assertEquals(0, sol.maxProfitDPWeb(a2));
        assertEquals(1, sol.maxProfitDPWeb(a3));
    }

}