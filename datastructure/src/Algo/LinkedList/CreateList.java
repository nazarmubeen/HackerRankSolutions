package Algo.LinkedList;

public class CreateList {

    public static LNode getList() {
        LNode a = new LNode(3);
        //	Node p=new Node(2,a);
        //	Node q=new Node(3,p);
        //Node r=new Node(2,a);
        LNode head = new LNode(1, a);
        // 15->7->10->5
        LinkedListUtilities.printList(head);
        return head;
    }
}
