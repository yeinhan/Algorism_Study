package LeetCode.LC11;

public class Solution {
	
	//시간 제한 초과...함수가 짱
	 public int maxArea(int[] height) {
		 int answer =0;
		 
		 for(int i=0; i<height.length; i++) {
			 for(int j=i+1; j<height.length; j++) {
				 int min=height[j]; 	//기준을 j로 한다.
				 
				 for(int k=i; k< j; k++) {	//최솟값 찾기
					 if(min>height[k]) {
						 min = height[k];
					 }
					 
//					 System.out.print("i:"+i+" j:"+j+" k:" +k+ " min:" +min+" ++ ");
					 if(answer < ((j-i) * min)) {
						 answer = ((j-i) * min);
					 }
//					 System.out.println(" an:"+ (j-i) * min);
				 }
				 
				 
			 }
		 }
		 
		 
	        return answer;
	    }
	
	
	/*
	 * 
	 * Runtime: 672 ms
	 * */
//	public int maxArea(int[] height) {
//		 int answer =0;
//		 
//		 for(int i=0; i<height.length; i++) {
//			 for(int j=i+1; j<height.length; j++) {
//				 answer = Math.max(answer, Math.min(height[i], height[j])*(j-i));
//			 }
//		 }
//		 
//		 
//	        return answer;
//	    }
//	 
	 
	 
	 public static void main(String[] args) {
		int[] h = {4,3,2,1,4};
		 
		Solution s = new Solution();
		
		System.out.println(s.maxArea(h));
	}
}
