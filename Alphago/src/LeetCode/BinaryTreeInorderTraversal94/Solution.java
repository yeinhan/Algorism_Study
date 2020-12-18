package LeetCode.BinaryTreeInorderTraversal94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
1.루트에 단말까지 왼쪽 경로의 서브트리 루트 노드를 push
2.왼쪽 자식이 없는 노드를 만나면 pop, 방문한 노드의 오른쪽 자식이 있으면 push
3.스택이 비어있으면종료, 아니면 방문한 노드의 오른쪽 자식을 루트로 하는 서브트리에 대하여 1부터 반복

왼 루 오
*/

/*
LeetNode94 - Binary Tree Inorder Traversal
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
*/

public class Solution {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if(root == null)
			return list;
		
		TreeNode current = root;
		
		while(current != null || !stack.isEmpty()) {
			while(current!=null) {	//왼쪽 노드 순회
				stack.push(current);
				current = current.left;
			}	
			
			current = stack.pop();
			list.add(current.val);
			current = current.right;
			
		}
		return list;

	}
	/* 재귀호출 - 추천 안함
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	if(root!=null) {
    		inorderTraversal(root.left);
    		System.out.println(root.val + "");
    		inorderTraversal(root.right);
    	}
    	
        return list;
    }
    */
    
	
    public static void main(String[] args) {
		Solution s = new Solution();
		
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
//		TreeNode t2 = new TreeNode(3);
		
		root.left = t1;
//		root.right = t1;
//		t1.left = t2;
		
		for(int i : s.inorderTraversal(root)) {
			System.out.println(i+" ");
		}
		
	}
}
