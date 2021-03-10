package Programmers.TriangularSnail;
/*
 * 테스트 1 〉	통과 (0.02ms, 55.5MB)
테스트 2 〉	통과 (0.02ms, 53.3MB)
테스트 3 〉	통과 (0.02ms, 52.3MB)
테스트 4 〉	통과 (0.48ms, 54.6MB)
테스트 5 〉	통과 (0.49ms, 53.6MB)
테스트 6 〉	통과 (0.52ms, 53.5MB)
테스트 7 〉	통과 (39.06ms, 112MB)
테스트 8 〉	통과 (38.86ms, 114MB)
테스트 9 〉	통과 (61.90ms, 114MB)
 * */

/* 삼각 달팽이 */

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int N = n*(n+1)/2;
        
        answer = new int[N];
        
        int[][] arr = new int[n][n];
        int count = 1;	// 배열 값
        int row = -1; //세로
        int col = 0; //갸로
        
        int answerIdx = 0;
        
        while(true) {
        	//row 
        	for(int i=0; i<n; i++) {
        		row += 1;
        		arr[row][col] = count;
        		count ++;
        	}
        	
        	n--;
        	if(n == 0)
        		break;

        	//col
        	for(int i=0; i<n; i++) {
        		col += 1;
        		arr[row][col] = count;
        		count ++;
        	}
        	
        	n--;
        	if(n==0)
        		break;
        	
        	//대각선
        	for(int i=0; i<n; i++) {
        		row -= 1;
        		col -= 1;
        		arr[row][col] = count; 
        		count++;
        	}
        	
        	n--;
        	if(n==0)
        		break;
        }
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		if(arr[i][j] == 0)
        			break;
        		
        		answer[answerIdx] = arr[i][j];
            	answerIdx++;
        	}
        	
        }
        		
        return answer;
    }
}
