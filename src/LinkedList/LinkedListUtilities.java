package LinkedList;

public class LinkedListUtilities {

	/*
	 * This function is to print Linked List
	 */
	public static void printList(Node n)
	{
		
		if(n==null)
		{
			return;
		}
		Node temp=n;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.println(" ");
	}
	
	/* This function is to insert nodes at tail
	 * 2 -->NULL
		2 --> 3 --> NULL
	 */
	public static Node insertNodeAtTail(Node head,Node node)
	{
		if(head==null)
		{
			head=node;
			return head;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
		return head;
	}
	/*
	 * This function is to insert Node at Head
	 */
	public static Node insertNodeAtHead(Node head,Node node)
	{
		if(head==null)
		{
			head=node;
			return head;
		}
		
		node.next=head;
		head=node;
		return head;
		
	}
	
	//insert a Node at specific position
	public static Node insertNodeAtPosition(Node head,int data, int position)
	{
		if(head==null)
		{
			return head;
		}
		Node node=new Node(data);
		
		Node temp=head;
		while(position!=0)
		{
			temp=temp.next;
			position--;
		}
		
		node.next=temp.next;
		temp.next=node;
		
		return head;
	}
	
}
