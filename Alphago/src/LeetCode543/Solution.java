package LeetCode543;

/*
 * depth: 루트 노드에서 자식노드까지 가는 길이
 * 
 * */


public class Solution {
	public int getLenth(TreeNode node, int[] max) {
		int left =0;
		int right = 0;
		
		if(node.left != null) {
			left = getLenth(node.left, max);
		}
		
		
		if(node.right != null) {
			right = getLenth(node.right, max);
		}
		
		int dimeter = left+right;
		
		if(dimeter > max[0]) {
			max[0] = dimeter;
		}
		
		return Math.max(left, right) + 1;	//최대 길이 구하기
	}
	
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) return 0;
		int[] max = {0};
		getLenth(root, max);
		
		return max[0];
		
	}
	
	public class TreeNode {
		int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
	}
	
	
	
}
