package LeetCode.LC739;

import java.util.Arrays;

/*
 * Runtime: 1085ms
 * Memory Usage: 47.2MB
 * 
 * */

public class Solution {

	public int[] dailyTemperatures(int[] T) {
		int count = 0;
		int[] anw = new int[T.length];
		
		for(int i=0; i<T.length; i++) {
			count = 0;
			for(int j=i+1; j<T.length; j++) {
				count += 1;
				if(T[i] < T[j]) {	//핵심
					anw[i] = count;
					break;
				}
			}
			
		}
		
		return anw;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int s[] = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] asw = solution.dailyTemperatures(s);
		
		System.out.println(Arrays.toString(asw));
	}
}
