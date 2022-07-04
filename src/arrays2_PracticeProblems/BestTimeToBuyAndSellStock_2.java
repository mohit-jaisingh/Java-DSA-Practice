package arrays2_PracticeProblems;

public class BestTimeToBuyAndSellStock_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can buy and sell stock. Can hold only 1 at a time.
		int[] prices = {1,2,3,4,5};
		System.out.println(maxProfit(prices));
	}
	
	static int maxProfit(int[] prices) {
		int profit = 0;
        
        int buyPrice =-1;
        int sellPrice = -1;
        int n= prices.length;
        
        for(int i=0; i<n; i++){
            if((buyPrice==-1 || (prices[i-1] > prices[i])) && (i==n-1 || prices[i]<prices[i+1])  ){
                buyPrice = prices[i];
                System.out.println("bought at " + buyPrice);
            }
            
            if(buyPrice>-1 &&  (i==n-1 || prices[i+1]<prices[i])){
                sellPrice = prices[i];
                profit += sellPrice - buyPrice;
                buyPrice = -1;
            }
        }
        return profit;
	}

}
