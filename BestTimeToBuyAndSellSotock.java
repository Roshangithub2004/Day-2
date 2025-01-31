
public class BestTimeToBuyAndSellSotock {
    public static int stockProfit(int prices[]){
        int maxProfit = 0;
        int currentPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < currentPrice){
                currentPrice = prices[i];
            }
            int profit = prices[i]- currentPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices ={7,1,5,3,6,4};
        System.out.println(stockProfit(prices));
    }
    
}
