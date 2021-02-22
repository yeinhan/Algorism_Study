package LeetCode.LC22;

/*
 * Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
 */

/*
 * Runtime: 1 ms, faster than 84.43% of Java online submissions for Generate Parentheses.
 * 
 * 유툽 참고
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> arr = new ArrayList<String>();

		print(arr,"", 0, 0, n);
		
		return arr;
	}
	
	public void print(List<String> arr, String current, int open, int close, int max) {
		if(current.length() == max*2) {
			arr.add(current);
			return;
		}
		
		if(open< max)
			print(arr, current + "(", open+1, close, max);
		if(close < open )	// ) 닫아줌
			print(arr, current + ")", open, close+1, max);
		
	}
}
