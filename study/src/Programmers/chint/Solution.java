package Programmers.chint;
/*
 * 문자열 그대로 정수로 바꾸기
 * */


public class Solution {
	 public int solution(String s) {
	       
	        return Integer.parseInt(s);
	    }
	public static void main(String[] args) {
		String s = "-1234";
		
		Solution s1 = new Solution();
		System.out.println(s1.solution(s));
	}

}
