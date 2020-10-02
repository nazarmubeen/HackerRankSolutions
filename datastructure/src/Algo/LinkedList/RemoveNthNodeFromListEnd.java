package Algo.LinkedList;

public class RemoveNthNodeFromListEnd {

    public static void main(String[] args) {
        LNode head = getList();
        head = removeNthNode(head, 3);
        LinkedListUtilities.printList(head);
    }


    static LNode removeNthNode(LNode head, int position) {

        LNode sizetemp = head;

        int size = 0;
        while (sizetemp.next != null) {
            sizetemp = sizetemp.next;
            size++;
        }

        LNode temp = head;
        int count = 0;
        while (count != (size - position)) {
            count++;
            temp = temp.next;
        }

        LNode temp1 = temp.next;
        temp.next = temp1.next;
        temp1 = null;


        return head;

    }

    public static LNode getList() {
        LNode a = new LNode(4);
        LNode p = new LNode(7, a);
        LNode q = new LNode(3, p);
        LNode r = new LNode(2, q);
        LNode head = new LNode(1, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
