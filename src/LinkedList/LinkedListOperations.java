package LinkedList;

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
