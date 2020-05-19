package Algo.LinkedList;

public class RotateList {

	public static void main(String[] args)
	{
		
		Node head=getList();
		/*head=rotateList(head, 2);
		LinkedListUtilities.printList(head);*/
		head=rotateList2(head, 51);
		LinkedListUtilities.printList(head);
	}
	
	
	
	static Node rotateList2(Node head,int n)
	{
		
		Node sizetemp=head;
		Node lastnode = null;
		int size=0;
		while(sizetemp.next!=null)
		{
			sizetemp=sizetemp.next;
			size++;
			if(sizetemp.next==null)
			{
				lastnode=sizetemp;
			}
		}
		
		System.out.println("list size "+size);
		
		Node temp=head;
		int count=0;
		n=n%(size+1);
		System.out.println("n ="+n);
		while(count!=(size-n))
		{
			temp=temp.next;
			count++;
		}
		
		lastnode.next=head;
		head=temp.next;
		temp.next=null;;
		
		return head;
		
	}
	
	static Node rotateList(Node head,int n)
	{
		Node curr=head;
		Node prev=null;
		while(n!=0)
		{
		//	System.out.println( " n= "+n);
			//System.out.println(" curr data "+ curr.data);
			while(true)
			{
			prev=curr;
			curr=curr.next;
			if(curr.next==null)
			{
				curr.next=head;
				prev.next=null;
				head=curr;
				break;
			}
		   }
			
			n--;
		}
		
		return curr;
	}
	
	
	public static Node getList()
	{
		Node a=new Node(38);
		Node p=new Node(83,a);
		Node q=new Node(18,p);
		Node r=new Node(34,q);
		Node head=new Node(91,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
