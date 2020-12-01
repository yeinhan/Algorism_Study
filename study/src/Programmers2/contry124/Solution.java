package Programmers2.contry124;

public class Solution {
	 public String solution(int n) {
	        String answer = "";
	        
	        int temp = 0;
	        
	        while(n>0) {
	        	temp = n % 3;
	        	n = n/3;
	        	
	        	
	        	if(temp == 0) {
	        		temp = 4;
	        		n -= 1;
	        	}
	        	
	        	System.out.println("n:"+n+" temp:"+temp+" ans:"+answer+ "==="+ temp+answer);
	        	answer = temp + answer;
	        }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 
		 Solution s = new Solution();
//		for(int i=1; i<=10; i++) {(i));
//			
//			System.out.println("i:"+i +" re:"+s.solution
//		}
		System.out.println(s.solution(10));
	}
}
