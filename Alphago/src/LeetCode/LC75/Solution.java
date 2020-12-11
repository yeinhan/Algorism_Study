package LeetCode.LC75;

import java.util.Arrays;

public class Solution {
//	  public void sortColors(int[] nums) {
//	        Arrays.sort(nums);
//	        
//	        for(int i=0; i<nums.length; i++) {
//	        	System.out.println(nums[i]);
//	        }
//	        
//	    }
	  
	
	/*
	 * 최상,평균, 최약 모두 일정 n(n-1)/2
	 * */
	  public void sortColors(int[] nums) { 	//버블정렬
		  	
	     int tmp;
	     
	     for(int i=nums.length-1; i>0; i--) {
	    	 for(int j=0; j<i; j++) {
	    		 if(nums[j]>nums[j+1]) {
	    			 tmp = nums[j];
	    			 nums[j] = nums[j+1];
	    			 nums[j+1] = tmp;
	    		 }
	    	 }
	     }
	     
	        
	    }
	  
	  public static void main(String[] args) {
		int[] num = {0,2,1,0};
		
		Solution s = new Solution();
		
		s.sortColors(num);
	}
}
