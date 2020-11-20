package LeetCode121;

public class Solution {
	
	public static int maxProfit(int[] prices) {
//		int buy = 0;
//		int sell = 0;
//		
//		int min = Integer.MAX_VALUE;
//		
//		for(int i=0; i<price.length; i++) {
//			if(min>price[i]) {		//배열의 최소값 찾음 (사는날)
//				min = price[i];
//				buy =i;
//			}
//		}
//		
//		int max = price[buy];
//		
//		for(int j=buy; j<price.length-buy; j++) {
//			if(max<price[j]) {		//파는 날 구하기
//				max = price[j];
//				sell=j;
//			}
//		}
//		
//		System.out.println("buy="+buy);
//		System.out.println("sell=" + sell);
//		System.out.println("max = " +max);
//		System.out.println("min= "+min);
//		
//		
//		if(buy == price.length-1) {
//			return 0;
//		}
//		else {
//		
//			int result = max-min;
//			
//			return result;
//			
//		}
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i< prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
			}else if(prices[i]-min > max) {
				max = prices[i]-min;
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int price[] = {7,1,5,3,6,4};
		int price[] = {7,6,4,3,1};
		System.out.println(maxProfit(price));

	}

}
