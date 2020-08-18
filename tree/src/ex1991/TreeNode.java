package ex1991;

public class TreeNode {
	public Node root; // 트리의 시작점

	public void setRoot(Node node) { // getter & setter
		this.root = node;
	}

	public Node getRoot() {
		return root;
	}

	public void makeNode(char data, char left, char right) { // node만들어 주는 함수

//		node.data = data;
//		node.left = left;
//		node.right = right;
//
//		return node;
		
		if(root==null) {
			if(data != '.') {
				root = new Node(data);
			}
			if(left != '.') {
				root.left = new Node(left);
			}
			if(right != '.') {
				root.right = new Node(right);
			}
			
		}
		else search(root, data, left, right);

	}
	
	//이미 노드들이 있는 상태이면 들어온 데이터를 어디에 넣어야하는지 탐색
	private void search(Node root, char data, char left, char right) {

		if(root==null) return;
		
		else if(root.data==data) {
			if(left != '.') {
				root.left = new Node(left);
			}
			if(right!='.') {
				root.right = new Node(right);
			}
		}
		else {
			search(root.left, data, left, right);
			search(root.right, data, left , right);
		}
	}

	public void inorder(Node root) {
		if (root != null) { // node가 null이 아닐때까지 재귀호출
			inorder(root.left); // 왼쪽 재귀호출을 다 돌고오면
			System.out.print(root.data+"\t"); // 나 자신을 호출
			inorder(root.right);
			
		}
	}

	public void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data+"\t"); // 나 자신을 호출
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+"\t"); // 나 자신을 호출
		}
	}
}
