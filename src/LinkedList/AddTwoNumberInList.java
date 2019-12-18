package LinkedList;

public class AddTwoNumberInList {

	public static void main(String[] args)
	{
		Node head1=getList1();
		Node head2=getList2();
		
		Node head=addTwoLists(head1,head2);
		LinkedListUtilities.printList(head);
	}
	
	static Node addTwoLists(Node head1,Node head2)
	{
		Node head=null;
		Node curr=head;
		Node temp1=head1;
		Node temp2=head2;
	
		int carry=0;
		int sum=0;
		while(temp1!=null && temp2!=null)
		{
			sum=temp1.data+temp2.data+carry;
			System.out.println("sum "+sum);
			if(sum>9)
			{
				carry=sum/10;
				sum=sum%10;
			}
			else{
				carry=0;
			}
			if(head==null)
			{
				head=new Node(sum);
				curr=head;
			}
			else{
				Node temp=new Node(sum);
				curr.next=temp;
				curr=temp;
			}
			temp1=temp1.next;
			temp2=temp2.next;
				
		}
		
		if(temp1==null && temp2!=null){
				while(temp2!=null){
				sum=temp2.data+carry;
				System.out.println("sum in temp2 "+sum);
				if(sum>9)
				{
					carry=sum/10;
					sum=sum%10;
				}
				else{
					carry=0;
				}
				Node temp=new Node(sum);
		//		System.out.println(" temp data "+temp.data);
				curr.next=temp;
				curr=temp;
				temp2=temp2.next;
			}
			
		}
			if(temp1!=null && temp2==null){
		    
			while(temp1!=null){
				sum=temp1.data+carry;
				System.out.println("sum in temp1"+sum);
				if(sum>9)
				{
					carry=sum/10;
					sum=sum%10;
				}
				else{
					carry=0;
				}
				Node temp=new Node(sum);
				curr.next=temp;
				curr=temp;
				temp1=temp1.next;
			}
			
		}
		
		if(carry==1)
		{
			Node temp=new Node(carry);
			curr.next=temp;
		}
		
		return head;
		
	}
	
	
	public static Node getList1()
	{
		
		/*Node q=new Node(3);
		Node r=new Node(4,q);*/
		Node head=new Node(1);
		LinkedListUtilities.printList(head);
		return head;
	}
	
	public static Node getList2()
	{
		Node q=new Node(9);
		Node r=new Node(9,q);
		Node head=new Node(9,r);
		LinkedListUtilities.printList(head);
		return head;
	}
}