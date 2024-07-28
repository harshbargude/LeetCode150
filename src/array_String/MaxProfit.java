package array_String;

import java.util.HashMap;

public class MaxProfit {

	public static void main(String[] args) {

//		prices = [7,1,5,3,6,4]
//				Output: 5
		
		int[] prices = {7,1,2,5,3,6,4};
		System.out.println(maxProfit(prices));
		
	}

	private static int maxProfit(int[] prices) {                                                    
		int LowP = Integer.MAX_VALUE;
		int maxP = 0;
		int profit = 0;
		
		for(int i = 0; i<prices.length; i++) {
			int temp = prices[i];
			if(temp<LowP) {
				LowP = temp;
			}
			profit = temp - LowP;
			if(profit > maxP) {
				maxP = profit;
				
			}
		}
		return maxP;
			                             
			
			                               
			                                                                                                 
			
			
			
//			for(int i = 0; i< prices.length-1; i++) {
//			if(byPrice>prices[i]) {
//				if(i == prices.length-1) {
//					profit = 0;
//					break;
//				}
//				result.put(prices[i], i);
//				byPrice = prices[i];
//				profit = byPrice ;
//			}
//			else
//				continue;
//		}
		
	}

}
