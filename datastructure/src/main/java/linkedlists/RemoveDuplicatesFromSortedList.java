package main.java.linkedlists;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        LNode a = getList();
        a = deleteDuplicates(a);
        LinkedListUtilities.printList(a);

    }

    public static LNode deleteDuplicates(LNode a) {

        LNode current = a.next;
        LNode prev = a;

        while (current != null) {
            int data = prev.data;
            if (current.data == data) {

                prev.next = current.next;
                current = prev.next;
            } else {
                prev = prev.next;
                current = current.next;
            }
        }

        return a;
    }


    public static LNode getList() {
        LNode a = new LNode(4);
        LNode p = new LNode(3, a);
        LNode q = new LNode(3, p);
        LNode r = new LNode(2, q);
        LNode head = new LNode(1, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
