package Algo.LinkedList;

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
	
	//insert a Node in sort
		public static Node insertNodeInSort(Node head,Node node)
		{
			if(head==null)
			{
				return head;
			}
			Node temp=head;
			
			while(!(temp.next.data>node.data))
			{
				temp=temp.next;
			}
			
			node.next=temp.next;
			temp.next=node;
			
			return head;
		}
		
	//delete a Node in LinkedList
	public static Node deleteNode(Node head,int data)
	{
		
		
		if(head==null)
		{
			return head;
		}
		Node temp=head;
		if(head.data==data)
		{
			
			head=head.next;
			temp=null;
			return head;
			
		}

		
		while(temp.next!=null)
		{
			if(temp.next.data==data)
			{
				Node tempnext=temp.next;
				temp.next=tempnext.next;
				tempnext=null;
			}
			temp=temp.next;
		}
	return head;	
	}
	
	//function to print linked list in reverse order
	public static void printReverseList(Node head)
	{
		if(head==null)
		{
			return;
		}
		Node node=head;
		 if (node != null) {
			 printReverseList(node.next);
		        System.out.print("  " + node.data);
		    }
	}
	
	//function to reverse linked list 
	public static Node  reverseList(Node head)
	{
		if(head==null)
		{
			return null;
		}
		
		Node current=head;
		Node prev=null;
		Node next;
		
		while(current!=null)
		{
			next=current.next;
			current.next = prev;   
		    prev = current;
		    current = next;
		}
		
			head=prev;
		 return head;
	}
	
}
