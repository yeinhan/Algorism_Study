package Programmers.DoublepriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
/*
 * 정확성  테스트
테스트 1 〉	통과 (11.99ms, 53.8MB)
테스트 2 〉	통과 (10.52ms, 53.5MB)
테스트 3 〉	통과 (10.83ms, 52.8MB)
테스트 4 〉	통과 (11.18ms, 52.8MB)
테스트 5 〉	통과 (16.92ms, 53.5MB)
테스트 6 〉	통과 (16.27ms, 52.2MB)
 */
public class Solution {
	 public int[] solution(String[] operations) {
	        int[] answer = new int[2];
	        
	        Queue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());//내림차순
	        Queue<Integer> minQueue = new PriorityQueue<Integer>();	//오름차순
	        
	        for(int i=0; i<operations.length; i++) {
	        	String[] temp = operations[i].split(" ");
	        	
	        	if(temp[0].equals("I")) {
	        		maxQueue.offer(Integer.parseInt(temp[1]));
	        		minQueue.offer(Integer.parseInt(temp[1]));
	        	}else {
	        		if(temp[1].equals("1")) {
	        			minQueue.remove(maxQueue.peek());
	        			maxQueue.poll();
	        		}else {
	        			maxQueue.remove(minQueue.peek());
	        			minQueue.poll();
	        		}
	        	}
	        }
	        if(maxQueue.isEmpty()) {
	        	answer[0] = 0;
	        }else {
	        	answer[0] = maxQueue.peek();
	        }
	        
	        if(minQueue.isEmpty()) {
	        	answer[1] = 0;
	        }else {
	        	answer[1] = minQueue.peek();
	        }
	        
	        System.out.println(answer[0]+" " +answer[1]);
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 String[] q = {"I 16","D 1"};
//		 String[] q = {"I 7", "I 5", "I -5", "D -1"};
		 
		 Solution s = new Solution();
		 System.out.println(s.solution(q).toString());
	}
}
