package ex1991;
/*
 * Inorder (left, root, right) 중위
 * Preorder (root, left, right)  전위
 * Postorder (left, right, root) 후위
 * 
 * */
//class Node{
//	int data;
//	Node left;
//	Node right;
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//class Tree{
//	public Node root;	//트리의 시작점
//	
//	public void setRoot(Node node) {	//getter & setter
//		this.root = root;
//	}
//	public Node getRoot() {
//		return root;
//	}
//	public Node makeNode(Node left, int data, Node right) {	//node만들어 주는 함수
//		Node node = new Node();
//		node.data = data;
//		node.left = left;
//		node.right = right;
//		
//		return node;
//	}
//	
//	public void inorder(Node node) {	
//		if(node != null) {	//node가 null이 아닐때까지 재귀호출
//			inorder(node.left);	//왼쪽 재귀호출을 다 돌고오면 
//			System.out.println(node.data);	//나 자신을 호출
//			inorder(node.right);
//		}
//	}
//	public void preorder(Node node) {
//		if(node!= null) {
//			System.out.println(node.data);
//			preorder(node.left);
//			preorder(node.right);
//		}
//	}
//	public void postorder(Node node) {
//		if(node != null) {
//			postorder(node.left);
//			postorder(node.right);
//			System.out.println(node.data);
//		}
//	}
//
//}



public class tree {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
//		int i, n = Integer.parseInt(in.readLine());
		
		int num = sc.nextInt();
		TreeNode t = new TreeNode();
		
		
		
		char[] data = null;
		for(int  i=0; i<num; i++) {
			String str = sc.next();
			data = str.toCharArray();
			System.out.println(data);
//			data = in.readLine().replaceAll(" ", "").toCharArray();
			t.makeNode(data[0], data[1], data[2]);
		}
		
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
//		in.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		for(int i=0; i<num; i++) {
//			
//		}
//		
//		
//		TreeNode t = new TreeNode();
//		Node n4 = t.makeNode(null, 4, null);
//		Node n5 = t.makeNode(null, 5, null);
//		Node n2 = t.makeNode(n4, 2, n5);
//		Node n3 = t.makeNode(null, 3, null);
//		Node n1 = t.makeNode(n2, 1, n3);
//		
//		t.setRoot(n1); //root 지정
//		t.inorder(t.getRoot());
//		System.out.println();
//		t.preorder(t.getRoot());
//		System.out.println();
//		t.postorder(t.getRoot());
//		System.out.println();
	}
	
}
