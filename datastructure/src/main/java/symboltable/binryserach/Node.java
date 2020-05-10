package main.java.symboltable.binryserach;

public class Node<Key ,Value> {

	private Key key;
	private Value value;
	private Node left,right;
	
	public Node(Key key,Value value)
	{
		this.key=key;
		this.value=value;
	}

}
