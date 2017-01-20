package main.lc_medium;

/**
 * Created by wwang on 1/20/2017.
 */
public class LC122_BestTime2BuySellStockII {

    /**
     * When going up, hold and wait for a drop then sell. Wait to drop wait for a up then buy.
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) profit += prices[i + 1] - prices[i];
        }
        return profit;
    }
}
