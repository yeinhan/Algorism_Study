package Programmers.plussort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 문제 설명
정수 배열 numbers가 주어집니다. 
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * 
 * */
public class Solution {
	 public int[] solution(int[] numbers) {
		 	int[] answer = {};
	        Set<Integer> set = new HashSet<>();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i=0; i<numbers.length; i++) {
	        	for(int j=i+1; j<numbers.length; j++) {
	        		set.add(numbers[i]+numbers[j]);
	        	}
	        }
	        
	        Iterator<Integer> iter = set.iterator();
	        
	        while(iter.hasNext()) {
	        	list.add(iter.next());
	        }
	        
	        Collections.sort(list);
	        
	        int size=0;
	        answer = new int[list.size()];
	        for(int num : list) {
	        	answer[size++] = num;
	        }
	        
	        return answer;
	        
	    }
	 
	 public int[] solution2(int[] numbers) {
		 int[] anwer = {};
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 for(int i=0; i<numbers.length; i++) {
			 for(int j=i+1; j<numbers.length; j++) {
				 int temp = numbers[i]+numbers[j];
				 
				 if(!list.contains(temp)) {
					 list.add(temp);
				 }
			 }
		 }
		 
		 Collections.sort(list);
		 
		 int size=0;
		 anwer = new int[list.size()];
		 for(int num: list) {
			 anwer[size++] = num;
		 }
		 
		 
		 return anwer;
		 
	 }

	public static void main(String[] args) {
		int[] t = {2,1,3,4,1};
		
		Solution s = new Solution();
		int[] test = s.solution(t);
		System.out.println(Arrays.toString(test));
		
		}
	

}
