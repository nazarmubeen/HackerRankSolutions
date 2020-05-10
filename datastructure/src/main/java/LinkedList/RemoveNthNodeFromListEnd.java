package main.java.LinkedList;

public class RemoveNthNodeFromListEnd {

	public static void main(String[] args)
	{
		Node head=getList();
		head=removeNthNode(head, 3);
		LinkedListUtilities.printList(head);
	}
	
	
	static Node removeNthNode(Node head,int position)
	{
		
		Node sizetemp=head;
		
		int size=0;
		while(sizetemp.next!=null)
		{
			sizetemp=sizetemp.next;
			size++;
		}
		
		Node temp=head;
		int count=0;
		while(count!=(size-position))
		{
			count++;
			temp=temp.next;
		}
		
		Node temp1=temp.next;
		temp.next=temp1.next;
		temp1=null;
		
		
		
		return head;
		
	}
	
	public static Node getList()
	{
		Node a=new Node(4);
		Node p=new Node(7,a);
		Node q=new Node(3,p);
		Node r=new Node(2,q);
		Node head=new Node(1,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
