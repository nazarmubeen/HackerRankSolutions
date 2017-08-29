package LinkedList;

/*Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.*/

public class PartitionList {

	public static void main(String[] args)
	{
		Node head=getList();
//		/partitionList(head,1);
		Node newHead=partitionList(head,1);
		LinkedListUtilities.printList(newHead);
	}
	
	
	static Node partitionList(Node head,int data)
	{
		
		Node smallHead=null;
		Node currptrsmall = null;
		Node largeHead=null;
		Node currptrlarge = null;
		
		Node temp=head;
		
	
		
		while(temp!=null)
		{
			System.out.println("current node "+temp.data);
			if(temp.data<data)
			{
				System.out.println("smaller");
				if(smallHead==null)
				{
					smallHead=temp;
					currptrsmall=smallHead;
				}
				else{
				currptrsmall.next=temp;
				currptrsmall=currptrsmall.next;
				}
				
				temp=temp.next;
				currptrsmall.next=null;
			}
			else{
				System.out.println("greater");
				if(largeHead==null)
				{
					largeHead=temp;
					currptrlarge=largeHead;
				}
				else{
				currptrlarge.next=temp;
				currptrlarge=currptrlarge.next;
				}
				
				temp=temp.next;
				currptrlarge.next=null;
			}
			
		}
		
		if(currptrsmall!=null)
		currptrsmall.next=largeHead;
		
		
		if(smallHead!=null)
		return smallHead;
		else{
			return largeHead;
		}
		
	}
	
	
	public static Node getList()
	{
		Node m=new Node(6);
		Node a=new Node(5,m);
		Node p=new Node(4,a);
		Node q=new Node(3,p);
		Node r=new Node(2,q);
		Node head=new Node(1,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
