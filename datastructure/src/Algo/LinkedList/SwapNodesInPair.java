package Algo.LinkedList;

public class SwapNodesInPair {

	public static void main(String[] args)
	{
		Node head=getList();
		head=swapNodes(head);
		LinkedListUtilities.printList(head);
	}
	
	static Node swapNodes(Node head)
	{
		Node curr=head;
		Node temp=curr;
		Node prev=null;
		
		
		while(curr!=null &&  curr.next!=null && temp!=null)
		{
			
			prev=curr.next;
			if(curr==head)
			{
				head=prev;
			}
	
			temp.next=prev;
			temp=curr;
			curr=curr.next.next;
			prev.next=temp;
			temp.next=curr;
			
		}
		
		return head;
		
	}
	
	public static Node getList()
	{
		Node m=new Node(50);
		Node a=new Node(38,m);
		Node p=new Node(83,a);
		Node q=new Node(18,p);
		Node r=new Node(34,q);
		Node head=new Node(91,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
