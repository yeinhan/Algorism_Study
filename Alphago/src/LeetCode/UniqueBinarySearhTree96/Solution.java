package LeetCode.UniqueBinarySearhTree96;
/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.*/

public class Solution {
	 public int numTrees(int n) {
			int[] node = new int[n + 1];
			
			if(n==0)
				return 1;
			if(n==1)
				return 1;
			
			node[0] = 1;
			node[1] = 1;
			for (int i = 2; i <= n; i++) {
				for (int j = 1; j <= i; j++)
					node[i] += node[j - 1] * node[i - j];
			}
			return node[n];
	    }
}
/*
 *
 *루트의 왼쪽에는 루트보다 작은 수, 오른쪽에는 큰수만 올 수 있다
n=2, node[2]=node[0]*node[1] 
            + node[1]*node[0]
n=2일떄. 가장 작은 수(1)이 오면 오른쪽에만 2가 올 수 있다.
		2가 나오면 왼쪽에만 1이 올 수 있다
		--경우의 수는 2--

n=3, node[3]=node[0]*node[2] 
            + node[1]*node[1]
            + node[2]*node[0] 
n=3일때, 가장 작은 수 가 먼저오면 나머지 두수는 오른쪽으로만 갈 수 있다. node[0]*node[2]
		그 다음수(2)가 오면 왼쪽에 1, 오른쪽에 3
		가장 큰 수(3)이 오면 왼쪽에만 나머지 두수가 갈 수 있다.
 * 
 * 
 * */
 