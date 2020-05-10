package main.java.trees;

public class Node {

	Node left;
	Node right;
	int data;
	
	public Node(Node left, Node right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public Node(int data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
	}
	
	
	
}
