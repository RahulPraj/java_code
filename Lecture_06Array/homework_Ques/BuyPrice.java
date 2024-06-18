package Lecture_06Array.homework_Ques;

public class BuyPrice {
    public static int buyStock(int prices[])
    {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,4,5,6,3,1};
        System.out.println(buyStock(prices));

    }
}
