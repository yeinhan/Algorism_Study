package Programmers.printer;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    class Printer {
		int location;
		int prior;

		Printer(int location, int prior) {
			this.location = location;
			this.prior = prior;
		}
	}
    
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			q.offer(new Printer(i, priorities[i]));
		}

		while (!q.isEmpty()) {

			boolean flag = false;
			int com = q.peek().prior;
			for (Printer p : q) {
				if (com < p.prior) { 
					flag = true;
				}
			}

			if (flag) {
				q.offer(q.poll());
			} else {
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
				}
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		int[] s = {2,1,3,2};
		
		
		Solution s1 = new Solution();
		System.out.println(s1.solution(s, 2));
	}
    
}
