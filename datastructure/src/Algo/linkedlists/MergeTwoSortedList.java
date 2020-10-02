package algo.linkedlists;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        LNode first = getListA();
        LNode second = getListB();

        LNode mergelist = mergeTwoList(first, second);
        LinkedListUtilities.printList(mergelist);
    }


    static LNode mergeTwoList(LNode a, LNode b) {

        LNode head = null;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else {
            if (a.data <= b.data) {
                head = a;
                a = a.next;
            } else {
                head = b;
                b = b.next;
            }
            head = compareSortedData(a, b, head);

        }

        return head;
    }


    public static LNode compareSortedData(LNode a, LNode b, LNode head) {
        LNode current = head;
        while (a != null && b != null) {
		
			/*System.out.println(" a data "+a.data);
			System.out.println(" b data "+b.data);
			System.out.println(" current data "+current.data);*/

            if (a.data <= b.data) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        if (a == null && b != null) {
            current.next = b;
        }

        if (b == null && a != null) {
            current.next = a;
        }


        return head;

    }


    public static LNode getListA() {
        LNode a = new LNode(9);
        LNode p = new LNode(4, a);
        LNode q = new LNode(3, p);
        LNode r = new LNode(2, q);
        LNode head = new LNode(1, r);
        LinkedListUtilities.printList(head);
        return head;
    }

    public static LNode getListB() {
        LNode a = new LNode(10);
        LNode p = new LNode(8, a);
        LNode q = new LNode(7, p);
        LNode r = new LNode(5, q);
        LNode head = new LNode(3, r);
        LinkedListUtilities.printList(head);
        return head;
    }


}
