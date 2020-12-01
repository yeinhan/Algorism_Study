package Programmers.isdigist;

public class Solution {
	 public boolean solution(String s) {
	        boolean answer = true;
	        
	        if( s.length() >= 4 && s.length()<=6) {
	        	int tmp = 0;
	        	for(int i=0; i<s.length(); i++) {
	        		tmp = s.charAt(i);
	        		
	        		if(Character.isDigit(tmp)==false) {
	        			answer = false;
	        		}
	        	}
	        }else {
	        	return false;
	        }
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		String s = "1234";
		System.out.println(s.length());
		Solution s1 = new Solution();
		System.out.println(s1.solution(s));
	}

}
