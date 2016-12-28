package main.lc_easy;

/**
 * Created by wwang on 12/28/2016.
 */
public class LC121_BestTime2BuySellStock {

    /**
     * DP solution: recursive, need improvement.
     * Beat 4% LC
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        return helper(prices, 0, prices.length);
    }

    private int helper(int[] prices, int start, int end) {

        int max = 0;

        // base case
        if (end - start < 2)
            return 0;

        // sub-problem
        int mid = (end + start) / 2;

        // left half
        int left = helper(prices, start, mid);

        // right half
        int right = helper(prices, mid, end);

        // cross
        int cross = 0;
        int leftmin = prices[start];
        int rightmax = prices[mid];
        for (int i = start; i < mid; i++) {
            if (prices[i] < leftmin)
                leftmin = prices[i];
        }
        for (int i = mid; i < end; i++) {
            if (prices[i] > rightmax)
                rightmax = prices[i];
        }
        cross = rightmax - leftmin > 0 ? rightmax - leftmin : 0;

        // combine
        int tmp = Math.max(left, right);
        return Math.max(tmp, cross);
    }


    /**
     * DP solution 2: non-recursive.
     * Beat 48.57% lC
     * @param prices
     * @return
     */
    public int maxProfitDP(int[] prices) {

        int s = 0, m = 0;
        int len = prices.length;

        if (len < 1)
            return 0;

        int cache = 0;

        for (int i = 1; i < len; i++) {
            if (prices[i] <= prices[s]) {
                s = i;
                m = i;
            } else if (prices[i] > prices[m]) {
                if (prices[i] - prices[s] > cache) {
                    cache = prices[i] - prices[s];
                }
                m = i;
            }
        }

        return cache;
    }

    /**
     * Solution from web.
     * @param prices
     * @return
     */
    public int maxProfitDPWeb(int[] prices) {

        int profit = 0;

        if (prices.length == 0)
            return profit;

        int bought = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > bought) {
                if (prices[i] - bought > profit)
                    profit = prices[i] - bought;
            } else {
                bought = prices[i];
            }
        }
        return profit;
    }

    /**
     * Brute force solution
     * @param prices
     * @return
     */
    public int maxProfitBF(int[] prices) {

        int max = 0;

        if (prices == null || prices.length < 2)
            return max;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }

        return max;
    }

}
