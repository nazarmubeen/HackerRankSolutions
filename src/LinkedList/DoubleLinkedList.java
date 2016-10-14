package LinkedList;

public class DoubleLinkedList {

	/*
	 * You’re given the pointer to the head node of a sorted doubly linked list 
	 * and an integer to insert into the list. Create a node and insert it into
	 *  the appropriate position in the list such that its order is maintained.
	 *   The head node might be NULL to indicate that the list is empty.
	 */
	
	
	 public static DNode SortedInsert(DNode head, int data)
	 {
		 DNode node=new DNode(data);
		 if(head==null)
		 {
			 return head;
		 }
		 
		 
		 DNode current=head;
		 
		 while(null!=current.next && !(current.next.data>=data))
		 {
			 current=current.next; 
		 }
	 
		 node.previous=current;
		 node.next=current.next;
		 current.next=node;

		return head;
 
	 }
	
	 /*
	  * You’re given the pointer to the head node of a doubly linked list.
	  *  Reverse the order of the nodes in the list. The head node might be NULL to
	  *   indicate that the list is empty.
	  */
	 
	 public static DNode Reverse(DNode head)
	 {	 if(head==null)
	 {
		 return head;
	 }
	 
	 
	 DNode prev=null;
	 DNode current=head;
	 DNode next=current.next;

      //   System.out.println("prev");
       //  System.out.println("current"+current.data);
       //  System.out.println("next");

while(null!=next && current.next!=null)
	 {
		 current.next=prev;
		 current.previous=next;
		 prev=current;
		 current=next;
		 next=current.next;	 
       //  System.out.println("prev"+prev.data);
       //  System.out.println("current"+current.data);
       //  System.out.println("next"+next);
	 }
	 
       current.next=prev;
        head=current;

 return head;}
	 
	 
}
