package Programmers.plussort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*	두개 뽑아서 더하기 */
/*
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요
 */
public class Solution {
/*
 * 테스트 1 〉	통과 (0.32ms, 52.5MB)
테스트 2 〉	통과 (0.34ms, 53MB)
테스트 3 〉	통과 (0.36ms, 52.4MB)
테스트 4 〉	통과 (0.35ms, 52MB)
테스트 5 〉	통과 (0.54ms, 52MB)
테스트 6 〉	통과 (0.70ms, 54.2MB)
테스트 7 〉	통과 (2.61ms, 52.8MB)
테스트 8 〉	통과 (1.37ms, 52.6MB)
테스트 9 〉	통과 (1.75ms, 52.8MB)
 * */
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
	 
	 /*
	  * 테스트 1 〉	통과 (0.29ms, 51.9MB)
테스트 2 〉	통과 (0.35ms, 53.1MB)
테스트 3 〉	통과 (0.31ms, 54MB)
테스트 4 〉	통과 (0.35ms, 51.8MB)
테스트 5 〉	통과 (0.41ms, 52.3MB)
테스트 6 〉	통과 (1.32ms, 52.4MB)
테스트 7 〉	통과 (11.51ms, 52.9MB)
테스트 8 〉	통과 (3.71ms, 52.2MB)
테스트 9 〉	통과 (2.24ms, 53MB)
	  * */
	 public int[] solution2(int[] numbers) {
		 int[] anwer = {};
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
		 for(int i=0; i<numbers.length; i++) {
			 for(int j=i+1; j<numbers.length; j++) {
				 int temp = numbers[i]+numbers[j];
				 
				 if(!list.contains(temp)) {			//list 안에 temp가 있지지 확인
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
		int[] test = s.solution2(t);
		System.out.println(Arrays.toString(test));
		
		}
}
