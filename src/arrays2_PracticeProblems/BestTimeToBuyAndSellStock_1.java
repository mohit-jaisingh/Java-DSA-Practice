package arrays2_PracticeProblems;

public class BestTimeToBuyAndSellStock_1 {

	public static void main(String[] args) {
		//buy once sell once for max profit.
		int prices[] = {2,2,5};
		System.out.println(findMaxProfit(prices));
	}
	
	static int findMaxProfit(int prices[]) {
//		int buyIndex = -1;
//      int sellIndex = -1;
        int buyPrice = -1, sellPrice = -1;
        int maxProfit = 0;
        int profit = 0;
        
        int n = prices.length;
        
        for(int i=0; i<n; i++){
            if( i<n-1 && prices[i] < prices[i+1]  && (i==0 || prices[i] <= prices[i-1])){
            	//if( we are within last price but 1, and current price is less than next 
            	// and if( it is the first price we are checking(safety for[i-1] or
            	// current price is less than prev price, then buy.
            	if(buyPrice > prices[i] || buyPrice == -1) {
            		buyPrice = prices[i];
//                    buyIndex = i;
                    System.out.println("bought at " + prices[i]);
            	}     
            }
            // can't sell at first price && price greater than prev && ( it is last price ||
            // current price is greater than next price. ( local maxima), then sell
            if( i>0 && prices[i] >= prices[i-1] && (i==n-1 || prices[i] > prices[i+1])){
                sellPrice = prices[i];
//                sellIndex = i;
                if(buyPrice>-1) {
                	profit = sellPrice - buyPrice;
//                    System.out.println("buyPrice = " + buyPrice + ", sellPrice = " + sellPrice
//                    		+ " profit = " + profit);
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
                
            }
        }
      
        
        return (maxProfit);
	}

}
