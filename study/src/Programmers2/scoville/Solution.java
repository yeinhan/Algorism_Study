package Programmers2.scoville;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * 스코빌
 * 
 * 우선순위큐 문제.
 * */
public class Solution {
//	public int solution(int[] scoville, int K) {
//        int answer = 0;
//        
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        
//        for(int a: scoville) {
//        	list.add(a);
//        }
//        
//        while(Collections.min(list)< K) {
//        	if(list.size() == 1) return -1;
//
//        	Collections.sort(list);
//      
//            int mix = (list.get(0) + (list.get(1) * 2));
//            
//            list.remove(0);
//            list.remove(0);
//            
//            
//            list.add(mix);
//            
//            answer ++;
//        }
//        
//        return answer;
//    }
	
	public int solution(int[] scoville, int K) {
		
		int answer = 0;
		
		Queue<Integer> que = new PriorityQueue<Integer>();
		
		for(int a : scoville) {
			que.offer(a);
		}
		
		while(que.peek()<K) {	//가장 작은 수 찾기
			if(que.size() == 1) return -1;
			
			que.offer(que.poll() + (que.poll()*2));
			answer ++;
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		int[] a = {12,9,8,7,6,5,4};
		
		Solution s = new Solution();
		
		int n = 12;
		
		String nBi = Integer.toBinaryString(n);
		System.out.println(nBi);
		
		System.out.println(s.solution(a, 7));
	}
	
}
