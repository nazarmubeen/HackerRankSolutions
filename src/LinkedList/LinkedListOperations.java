package LinkedList;

import java.util.HashMap;

public class LinkedListOperations {

	
	/*
	 * You’re given the pointer to the head nodes
	 *  of two linked lists. Compare the data in the
	 *   nodes of the linked lists to check if they are
	 *    equal. The lists are equal only if they have 
	 *    the same number of nodes and corresponding nodes
	 *     contain the same data. Either head pointer
	 *      given may be null meaning that the 
	 *      corresponding list is empty.
	 */
	
	public static int CompareLists(Node head1,Node head2)
	{
		if(head1==null && head2==null)
		{
			return 1;
		}
		if(head1==null || head2==null)
		{
			return 0;
		}
		int size=listSize(head1);
		if(size!=listSize(head2))
		{
			return 0;
		}
		Node temp1=head1;
		Node temp2=head2;
		for(int i=0;i<size;i++)
		{
			if(temp1.data==temp2.data)
			{
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else{
				return 0;
			}
		}
		
		return 1;
	}
	
	
	
	/*You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in
	 *  ascending order. Delete as few nodes as possible so that the list does not
	 *  contain any value more than once. 
	 *  The given head pointer may be null indicating that the list is empty.
	 */
	
	
	//function to remove duplicates
	public static Node RemoveDuplicates(Node head)
	{
		if(head==null)
		{
			return head;
		}
		
		Node current=head;
		Node previous=current;
		while(current!=null)
		{
			if(previous.data==current.data)
			{
				previous.next=current.next;
				current=null;
				current=previous.next;
			}
			else{
			previous=current;
			current=current.next;
			
			}
		}
		
		return head;
	}
	
	//A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
	
	//function to check cycle
	public static boolean hasCycle(Node head) {
		
		if(head==null)
		{
			return false;
		}
		
		Node slowtemp=head;
		Node fasttemp=head;
		
		while(slowtemp!=null && fasttemp!=null && fasttemp.next!=null)
		{
			slowtemp=slowtemp.next;
			fasttemp=fasttemp.next.next;
			if(slowtemp==fasttemp)
			{
				return true;
			}
			
		}
		

		return false;
	}
	
	
	
	/*
	 * Given pointers to the head nodes of two linked lists that merge together at some 
	 * point, find the Node where the two lists merge. It is guaranteed that the two 
	 * head Nodes will be different, and neither will be NULL.
	 */
	
	public static int FindMergeNode(Node head1, Node head2)
	{
		int data = 0;
		Node temp1=head1;
		Node temp2=head2;
		Node temp;
		
		int size1=listSize(head1);
		int size2=listSize(head2);
		int diff;
		
		if(size1>size2)
		{
			diff=size1-size2;
			while(diff!=0)
			{
				temp1=temp1.next;
				diff--;
			}
			temp=temp1;
		}
		else{
			diff=size2-size1;
			while(diff!=0)
			{
				temp2=temp2.next;
				diff--;
			}
			temp=temp1;
		}
		
		while(temp!=null)
		{
			temp1=temp1.next;
			temp2=temp2.next;
			if(temp1==temp2)
			{
				return temp1.data;
			}
		}
		
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//function to get the size of list
	public static int listSize(Node head)
	{
		if(head==null)
		{
			return 0;
		}
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			temp=temp.next;
			c++;
		}
		return c;
	}
	
	
}
