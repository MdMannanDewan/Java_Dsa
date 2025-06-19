import java.util.*;

public class BuyAndSellStocks {
    public static int getMaxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int buyingPrice = prices[0], sellingPrice = prices[1], maxProfit = sellingPrice - buyingPrice;
        for (int i = 2; i < prices.length; i++) {
            buyingPrice = Math.min(buyingPrice, prices[i - 1]);
            maxProfit = Math.max(maxProfit, prices[i] - buyingPrice);
        }
        return maxProfit < 0 ? 0 : maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int buyingPrice = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice > prices[i]) {
                buyingPrice = prices[i];
            } else if (prices[i] - buyingPrice > profit) {
                profit = prices[i] - buyingPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int stocks[] = { 7, 8 };
        int maxProfit = getMaxProfit(stocks);
        System.out.println(maxProfit);
    }
}
