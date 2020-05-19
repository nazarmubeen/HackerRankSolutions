package Algo.LinkedList;

public class MergeTwoSortedList {

	public static void main(String[] args)
	{
		Node first=getListA();
		Node second=getListB();
		
		Node mergelist=mergeTwoList(first,second);
		LinkedListUtilities.printList(mergelist);
	}
	
	
	static Node mergeTwoList(Node a , Node b)
	{
			
		Node head = null;
		if(a==null)
		{
			return b;
		}
		
		else if(b==null){
			return a;
		}
		else{
			if(a.data<=b.data)
			{
				head=a;
				a=a.next;
			}
			else{
				head=b;
				b=b.next;
			}
		head=compareSortedData(a,b,head);
		
		}
		
		return head;
	}
	
	
	public static Node compareSortedData(Node a,Node b,Node head)
	{
		Node current=head;
		while(a!=null && b!=null)
		{
		
			/*System.out.println(" a data "+a.data);
			System.out.println(" b data "+b.data);
			System.out.println(" current data "+current.data);*/
			
		if(a.data<=b.data)
		{
			current.next=a;
			a=a.next;
		}
		else{
			current.next=b;
			b=b.next;
		}
		current=current.next;
		}
		
		if(a==null && b!=null)
		{
			current.next=b;
		}
		
		if(b==null && a!=null)
		{
			current.next=a;
		}
		
		
	

		return head;
		
	}
	
	
	public static Node getListA()
	{
		Node a=new Node(9);
		Node p=new Node(4,a);
		Node q=new Node(3,p);
		Node r=new Node(2,q);
		Node head=new Node(1,r);
		LinkedListUtilities.printList(head);
		return head;
	}
	
	public static Node getListB()
	{
		Node a=new Node(10);
		Node p=new Node(8,a);
		Node q=new Node(7,p);
		Node r=new Node(5,q);
		Node head=new Node(3,r);
		LinkedListUtilities.printList(head);
		return head;
	}
	
	
	
}
