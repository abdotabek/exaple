package org.example.leet;

/**Вам дан целочисленный массив prices, где prices[i] — это цена NeetCoin на i-й день.
 Вы можете выбрать один день, чтобы купить один NeetCoin, и выбрать другой день в будущем, чтобы продать его.
 Верните максимальную прибыль, которую вы можете получить. Вы можете не совершать никаких транзакций, в этом случае прибыль будет равна 0.*/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] test = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit.maxProfit(test));
        int[] tes1 = {1, 4, 8, 5, 4};
        System.out.println(maxProfit.maxProfit(tes1));
    }
}
