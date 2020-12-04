package Programmers2.nextBignum;

public class Solution {
	public int solution(int n) {
		int answer = 0;

		String nBi = Integer.toBinaryString(n);
		String[] compare = nBi.split("");
		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < compare.length; i++) {
			if (compare[i].equals("1"))
				cnt++;

		}

		for (int i = n + 1;; i++) {
			System.out.println(i);
			if(cnt == cnt2) {
				break;
			}else{
				nBi = Integer.toBinaryString(i);
				compare = nBi.split("");

				for (int j = 0; j < compare.length; j++) {
					if (compare[j].equals("1"))
						cnt2++;

				}
					answer = i;
			}

		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(78));
	}
}
