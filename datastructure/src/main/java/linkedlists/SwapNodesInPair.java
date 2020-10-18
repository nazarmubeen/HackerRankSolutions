package main.java.linkedlists;

public class SwapNodesInPair {

    public static void main(String[] args) {
        LNode head = getList();
        head = swapNodes(head);
        LinkedListUtilities.printList(head);
    }

    static LNode swapNodes(LNode head) {
        LNode curr = head;
        LNode temp = curr;
        LNode prev = null;


        while (curr != null && curr.next != null && temp != null) {

            prev = curr.next;
            if (curr == head) {
                head = prev;
            }

            temp.next = prev;
            temp = curr;
            curr = curr.next.next;
            prev.next = temp;
            temp.next = curr;

        }

        return head;

    }

    public static LNode getList() {
        LNode m = new LNode(50);
        LNode a = new LNode(38, m);
        LNode p = new LNode(83, a);
        LNode q = new LNode(18, p);
        LNode r = new LNode(34, q);
        LNode head = new LNode(91, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
