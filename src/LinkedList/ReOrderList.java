package LinkedList;

public class ReOrderList {

	public static void main(String[] args)
	{
		Node head=getList();
		head=reorderList(head);
		LinkedListUtilities.printList(head);
	
	}
	
	public static Node reorderList(Node a) {
		
		Node head=a;
		
		Node middle=getMiddleOfList(head);
		
		middle=reverseList(middle);
		
		LinkedListUtilities.printList(middle);
		return reorderList(head,middle);
		
		 
		
		
	}
	
	static Node reorderList(Node head,Node middle)
	{
		Node temp=head;
		Node temp2=middle;
		
		while(temp!=null && temp2!=null && temp!=temp2 && temp.next!=temp2)
		{
			System.out.println("temp1 data"+temp.data);
			System.out.println("temp2 data"+temp2.data);
			Node t=temp2;
			temp2=temp2.next;
			t.next=temp.next;
			temp.next=t;
			temp=t.next;
		}
		
		
		return head;
		
	}
	
	

	//function to get the size of list
	public static Node getMiddleOfList(Node head)
	{
		if(head==null)
		{
			return null;
		}
		
		
		Node slowptr=head;
		Node fastptr=head;
		
		
		while(fastptr!=null && fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		System.out.println(" slow ptr data "+slowptr.data);
		
		return slowptr;


	}
	
	
	public static Node reverseList(Node head)
	 {
		 Node prev=null;
		 Node curr=head;
		 Node next=head.getNext();
		 
		 while(curr!=null)
		 { 
			 curr.next=prev;
			 prev=curr;
			 curr=next;
			 if(next!=null)
			 next=next.next;
		 }

		 head=prev;
		 return head;
	 }
	
	public static Node getList()
	{
		Node x=new Node(53);
		Node m=new Node(50,x);
		Node a=new Node(38,m);
		Node p=new Node(83,a);
		Node q=new Node(18,p);
		Node r=new Node(34,q);
		Node head=new Node(91,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
