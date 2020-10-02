package Algo.LinkedList;

public class LinkedList {
	
	
	
	public static void main(String[] args)
	{
            LNode p = new LNode(5);
            LNode q = new LNode(10, p);
            LNode r = new LNode(7, q);
            LNode head = new LNode(15, r);
            // 15->7->10->5
            LinkedListUtilities.printList(head);
            //
            LNode tail = new LNode(12);
            head = LinkedListUtilities.insertNodeAtTail(head, tail);
            // 15->7->10->5->12
            LinkedListUtilities.printList(head);
            LNode newhead = new LNode(81);
            head = LinkedListUtilities.insertNodeAtHead(head, newhead);
            // 81->15->7->10->5->12
            LinkedListUtilities.printList(head);
            head = LinkedListUtilities.insertNodeAtPosition(head, 27, 2);
            // 81->15->7->27->10->5->12
            LinkedListUtilities.printList(head);
            head = LinkedListUtilities.deleteNode(head, 7);
            // 81->15->27->10->5->12
            LinkedListUtilities.printList(head);
            // 12->5>10->27->15->81
            head = LinkedListUtilities.reverseList(head);
            ;
            // 81->15->27->10->5->12
            LinkedListUtilities.printList(head);
            LinkedListUtilities.printReverseList(head);


    }
	
}
