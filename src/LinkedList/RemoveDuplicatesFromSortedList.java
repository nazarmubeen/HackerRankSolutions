package LinkedList;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args)
	{
		Node a=getList();
		a=deleteDuplicates(a);
		LinkedListUtilities.printList(a);
		
	}
	
	public static Node deleteDuplicates(Node a) {
	    
	    Node current=a.next;
	    Node prev=a;
	    
	    while(current!=null)
	    {
	        int data=prev.data;
	        if(current.data==data)
	        {
	            
	            prev.next=current.next;
	            current=prev.next;
	        }
	        else{
	            prev=prev.next;
	            current=current.next;
	        }        
	    }
	    
	    return a;
	}
	
	
	
	
	public static Node getList()
	{
		Node a=new Node(4);
		Node p=new Node(3,a);
		Node q=new Node(3,p);
		Node r=new Node(2,q);
		Node head=new Node(1,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}
