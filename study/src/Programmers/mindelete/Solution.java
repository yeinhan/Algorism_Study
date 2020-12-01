package Programmers.mindelete;
/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
*/

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> solution(int[] arr) {
        int num = 0;
        int min  = Integer.MAX_VALUE;
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        
        if(arr.length == 1) {
        	list.add(-1);
        	return list;
        }
        
        
        for(int a: arr) {
        	list.add(a);
        	
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]<min) {
        		min = arr[i];
        		num = i;
        	}
        		
        }
        
        list.remove(num);
        
//        int[] answer = new int[list.size()];
//        
//        int size = 0;
//        for(int a: list) {
//        	answer[size++] = a;
//        }
        

        
        
        return list;
    }
	
	public static void main(String[] args) {
		int[] i = {1,2,3,4};
		
		Solution s = new Solution();
		System.out.println(s.solution(i));
		
		int n=6;
		System.out.println(n/3);
	}
}
