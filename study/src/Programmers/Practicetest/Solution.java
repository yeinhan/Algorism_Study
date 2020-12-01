package Programmers.Practicetest;
/*
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

 * 
 * */

import java.util.ArrayList;

public class Solution {

	  public ArrayList solution(int[] answers) {
	        int[] result =new int[3];
	        
	        int[] person1 = {1,2,3,4,5};
	        int[] person2 = {2,1,2,3,2,4,2,5};
	        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        for(int i=0; i<answers.length; i++	) {
	        	if(answers[i] == person1[i % 5]) {
	        		result[0] += 1;
	        	}
	        	if(answers[i] == person2[i % 8]) {
	        		result[1] +=1;
	        	}
	        	if(answers[i] == person3[i % 10]) {
	        		result[2] += 1;
	        	}
	        }
	        for(int i=0; i<3; i++) {
	        	System.out.println(result[i]);
	        }
	        
	       ArrayList list = new ArrayList();
	        
	       	        
	        int max = 0;
	        
	        for(int i=0; i<3; i++) {	//최댓값 구하기
	        	if(result[i] > max) {
	        		max = result[i];
	        	}
	        }
	        
	        for(int i=0; i<3; i++) {
	        	if(result[i] == max) {
	        		list.add(i+1);
	        	}
	        }
	       
	        
	        return list;
	    }
	  
	  
	public static void main(String[] args) {
		int[] an = {2,3,2,1,2,4,4,5,5};
		
//		int[] an = {0,0,0,0,0,0,0,0,0};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(an));


	}

}
