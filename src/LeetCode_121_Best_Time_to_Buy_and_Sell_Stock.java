public class LeetCode_121_Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            if ((prices[i] - minPrice) > profit)
                profit = prices[i] - minPrice;
        }
        return profit;
    }
}
