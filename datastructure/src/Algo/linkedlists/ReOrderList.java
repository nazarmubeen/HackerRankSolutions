package algo.linkedlists;

public class ReOrderList {

    public static void main(String[] args) {
        LNode head = getList();
        head = reorderList(head);
        LinkedListUtilities.printList(head);

    }

    public static LNode reorderList(LNode a) {

        LNode head = a;

        LNode middle = getMiddleOfList(head);

        middle = reverseList(middle);

        LinkedListUtilities.printList(middle);
        return reorderList(head, middle);


    }

    static LNode reorderList(LNode head, LNode middle) {
        LNode temp = head;
        LNode temp2 = middle;

        while (temp != null && temp2 != null && temp != temp2 && temp.next != temp2) {
            System.out.println("temp1 data" + temp.data);
            System.out.println("temp2 data" + temp2.data);
            LNode t = temp2;
            temp2 = temp2.next;
            t.next = temp.next;
            temp.next = t;
            temp = t.next;
        }


        return head;

    }


    //function to get the size of list
    public static LNode getMiddleOfList(LNode head) {
        if (head == null) {
            return null;
        }


        LNode slowptr = head;
        LNode fastptr = head;


        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        System.out.println(" slow ptr data " + slowptr.data);

        return slowptr;


    }


    public static LNode reverseList(LNode head) {
        LNode prev = null;
        LNode curr = head;
        LNode next = head.getNext();

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null)
                next = next.next;
        }

        head = prev;
        return head;
    }

    public static LNode getList() {
        LNode x = new LNode(53);
        LNode m = new LNode(50, x);
        LNode a = new LNode(38, m);
        LNode p = new LNode(83, a);
        LNode q = new LNode(18, p);
        LNode r = new LNode(34, q);
        LNode head = new LNode(91, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
