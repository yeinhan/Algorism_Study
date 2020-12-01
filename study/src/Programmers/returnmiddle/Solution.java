package Programmers.returnmiddle;

public class Solution {
	 public String solution(String s) {
	        String answer = "";
	        
	        if(s.length() % 2==0) {
	        	int i = s.length() /2;
	        	
	        	answer = s.substring(i-1, i+1);
	        }else {
	        	int i = Math.round(s.length() /2);
	        	answer = s.substring(i,i+1);
	        	
	        }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		String s = "qwer";
		
		Solution s1  = new Solution();
		System.out.println(s1.solution(s));
	}
	 
	 
}
