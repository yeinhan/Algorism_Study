package Programmers.PhoneBook;
/*
 * 
 * 정확성  테스트
테스트 1 〉	통과 (0.03ms, 53.6MB)
테스트 2 〉	통과 (0.02ms, 52.4MB)
테스트 3 〉	통과 (0.03ms, 52.8MB)
테스트 4 〉	통과 (0.07ms, 51.8MB)
테스트 5 〉	통과 (0.02ms, 53.2MB)
테스트 6 〉	통과 (0.02ms, 52.9MB)
테스트 7 〉	통과 (0.02ms, 53.1MB)
테스트 8 〉	통과 (0.02ms, 52.6MB)
테스트 9 〉	통과 (0.03ms, 52.5MB)
테스트 10 〉	통과 (0.03ms, 52.9MB)
테스트 11 〉	통과 (0.02ms, 52.2MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)  흠...
 * 
 * */


public class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++) {
        	String str = phone_book[i];
        	
        	for(int j=0; j<phone_book.length; j++) {
        		if(i==j) {
        			continue;
        		}
        		else if(phone_book[j].startsWith(str)) {
        			answer = false;
        		}
        	}
//        	break; test8,9실패로 빼니까 통과
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] test = {"123", "456", "789"};
//		String[] test = {"119", "97674223", "1195524421"};
//		for(int i=0; i<test.length; i++) {
//			String str = test[i];
//			
//			for(int j=0; j<test.length; j++) {
//				System.out.println("Star:"+str+", test["+j+"]:"+test[j]+" = "+test[j].startsWith(str));
//			}
//		}
		
		Solution s = new Solution();
		System.out.println(s.solution(test));
	}
}
