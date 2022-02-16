package leetcode.array;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock {
    @Test
    public void test() {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 4, 2}));
    }



    private int maxProfit(int[] prices) {
        //keep track of lowest number
        int lowest = Integer.MAX_VALUE;
        //keep track of current profit
        int currentProfit = 0;
        int bestProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            }
            currentProfit = prices[i] - lowest;

            if (currentProfit > bestProfit) {
                bestProfit = currentProfit;
            }
        }

        return bestProfit;
    }
}
