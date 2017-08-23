package LinkedList;

public class PallindromeList {

	public static void main(String[] args)
	{
		
		Node head=CreateList.getList();
		System.out.println("final result "+lPalin(head));
	//	Node newhead=reverseList(head);
		//LinkedListUtilities.printList(newhead);
	}
	
	
	 public static int lPalin(Node A) {
	  
		 if( A==null)
		 {
			 return 0;
		 }
			
		 if(A.next==null)
		 {
			 //only element is pallindrome
			 return 1;
		 }
		 
		 Node slowptr=A;
		 Node fastptr=A;
		 
		 int count=1;
		 while(fastptr!=null && fastptr.getNext()!=null )
		 {
			 slowptr=slowptr.getNext();
			 fastptr=fastptr.getNext().getNext();
			 count++;
			 if(fastptr==null)
			 {
				 count--;
			 }
		 }
		 
		 System.out.println(slowptr.getData());
		 System.out.println("count "+count);
		 if(count%2!=0 && count>1)
		 {
		 slowptr=slowptr.next;
		 }
		 Node reverseptr=slowptr;
		 reverseptr=reverseList(reverseptr);
		 
		// System.out.println(reverseptr.data);
		 Node currptr=A;
		 while(reverseptr!=null)
		 {
			 System.out.println(reverseptr.getData());
			 System.out.println(currptr.getData());
			if(currptr.data!=reverseptr.data)
			{
				System.out.println("not equal");
				return 0;
			}
			reverseptr=reverseptr.next;
			currptr=currptr.next;
		 }
		 
		 return 1;
		 
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


}

