package algo.stack;

import algo.linkedlist.ListNode;

import java.util.Stack;

public class Subtract {
	
	
	
	
	public static void main(String[] args)
	{
		ListNode head=getList();

		head=subtract(head);
		printList(head);
	}
	
	public static void printList(ListNode n)
	{
		
		if(n==null)
		{
			return;
		}
		ListNode temp=n;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
			
		}
		System.out.println(" ");
	}

	public static ListNode subtract(ListNode a) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		ListNode temp=a;
		int c=0;
		while(temp!=null)
		{
			stack.push(temp.val);
			c++;
			temp=temp.next;
			
		}
		
		System.out.println(" size "+c);
		 temp=a;
		
		 int half=(int) Math.floor(c/2);
		 System.out.println("Half ="+half);
		 c=1;
		 while(c<=half)
		 {
			 System.out.println(" temp current val "+temp.val);
			 System.out.println("stack top data"+stack.peek());
			 temp.val=stack.pop()-temp.val;
			 System.out.println(" updated "+temp.val);
			 temp=temp.next;
			 c++;
		 }
		return a;
	}
	
	public static ListNode getList()
	{
		ListNode a=new ListNode(1);
		ListNode a2=new ListNode(2);
		ListNode a3=new ListNode(3);
		ListNode a4=new ListNode(4);
		ListNode a5=new ListNode(5);
		a.next=a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		
		return a;
		
	}
}
