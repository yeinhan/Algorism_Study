package Programmers.biggestNum;

/*
 * 
 테스트 1 〉	통과 (1808.04ms, 359MB)
테스트 2 〉	통과 (694.00ms, 355MB)
테스트 3 〉	통과 (2953.89ms, 362MB)
테스트 4 〉	통과 (27.17ms, 61.2MB)
테스트 5 〉	통과 (1485.96ms, 357MB)
테스트 6 〉	통과 (1193.50ms, 357MB)
테스트 7 〉	통과 (2.44ms, 52.8MB)
테스트 8 〉	통과 (1.50ms, 51.8MB)
테스트 9 〉	통과 (2.26ms, 54.5MB)
테스트 10 〉	통과 (2.96ms, 53.3MB)
테스트 11 〉	통과 (4.33ms, 52.6MB)
 * */

/*
 * 	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 * 
 * */
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	 public String solution(int[] numbers) {
	        String answer = "";
//	        String o1, o2 = "";
	        
	        String[] str_num = new String[numbers.length];
	        
	        for(int i=0; i<numbers.length; i++) {
	        	str_num[i] = String.valueOf(numbers[i]);
	        }
	        
	        
	        Arrays.sort(str_num, new Comparator<String>() {
	        	//내림차순을 위한 
	    		public int compare(String o1, String o2) {
	    			return (o2+o1).compareTo(o1+o2);
	    		}
	    	});
	        
	        if(str_num[0].startsWith("0")) { 
	    		answer += "0";
	    	} else {
	    		for(int j=0; j<str_num.length; j++) {
	    			answer += str_num[j];
	    		}
	    	}
	        
	        System.out.println(answer);
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		int[] s = {6, 10, 2};
		
		Solution s1 = new Solution();
		
		s1.solution(s);
	}
	 
	
}
