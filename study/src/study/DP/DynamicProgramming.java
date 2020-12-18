package study.DP;

public class DynamicProgramming {
	
	//0,1,1,2,3,5,8,13,21,34,55,89,144,233...
	
	//피보나치   O(2^n)
	public int fibonacci(int n) {
		if(n == 0)
			return 0;
		if(n==1 || n==2)
			return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	//동적 계획법 	O(n)
	/* Bottom Up
	 * 1.문제를 부분 문제로 나눈다.
	 * 2.가장 작은 문제를 해를 구한 뒤, 테이블에 저장한다.
	 * 3.테이블에 저장되어있는 데이터로 전체의 문제의 해를 구한다.
	 * */
	
	public int fiboDp(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			int[] arr = new int[n];
			arr[0]= 0;
			arr[1] = 1;
			for(int i=2; i<n; i++) {
				arr[i] = arr[i-2] + arr[i-1];
			}
			return arr[n-1];
		}
		
	}
	
	public static void main(String[] args) {
		int n=898;
		DynamicProgramming dp = new DynamicProgramming();
		
		long start = System.currentTimeMillis();
		System.out.println(dp.fiboDp(n));
		long end = System.currentTimeMillis();
		System.out.println("실행시간:"+(end-start)/1000.0);
	}
}
