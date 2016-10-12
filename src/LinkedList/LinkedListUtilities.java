package LinkedList;

public class LinkedListUtilities {

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
	
	
}
