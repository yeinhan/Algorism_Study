package LeetCode.LC48;
/*
 *Rotate Image
 *You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * */


public class Solution {

	
	 public void rotate(int[][] matrix) {
		    int n = matrix[0].length;
	        int rot = n%2==0 ? n/2 : n/2+1;		//짝수 홀수
	        int cnt = n-1;

	        for(int i = 0; i < rot; i++){
	            for(int j = 0; j < cnt; j++){

	                int temp1 = matrix[i][j+i];
	                matrix[i][j+i] = matrix[n-1-j-i][i];
	                matrix[n-1-j-i][i] = matrix[n-1-i][n-1-j-i];
	                matrix[n-1-i][n-1-j-i] = matrix[j+i][n-1-i];
	                matrix[j+i][n-1-i] = temp1;
	            }
	            cnt -= 2;	//안쪽 인덱스 rotate를 위한
	        }
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
