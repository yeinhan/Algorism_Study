package BackJun.ex11722;

public class Solution {

	
	public int Sequence(int num,int[] first) {
		 int[] seconds = new int[num];
		 seconds[0] = 1;
		 
		for(int i=0; i<num; i++) {
			if(first[i]>first[i+1]) {
				seconds[i+1] += seconds[i] +1;
			}else {
				seconds[i+1] = seconds[i];
			}
		}
		 
	        return seconds[num-1];
	    }
	
	
	public static void main(String[] args) {

		int ex[] = {10, 30, 10, 20, 20, 10};
		Solution s = new  Solution();
		
		System.out.println(s.Sequence(6, ex));
	}

}
