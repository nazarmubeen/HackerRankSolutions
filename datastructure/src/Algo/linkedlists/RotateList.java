package algo.linkedlists;

public class RotateList {

    public static void main(String[] args) {

        LNode head = getList();
		/*head=rotateList(head, 2);
		LinkedListUtilities.printList(head);*/
        head = rotateList2(head, 51);
        LinkedListUtilities.printList(head);
    }


    static LNode rotateList2(LNode head, int n) {

        LNode sizetemp = head;
        LNode lastnode = null;
        int size = 0;
        while (sizetemp.next != null) {
            sizetemp = sizetemp.next;
            size++;
            if (sizetemp.next == null) {
                lastnode = sizetemp;
            }
        }

        System.out.println("list size " + size);

        LNode temp = head;
        int count = 0;
        n = n % (size + 1);
        System.out.println("n =" + n);
        while (count != (size - n)) {
            temp = temp.next;
            count++;
        }

        lastnode.next = head;
        head = temp.next;
        temp.next = null;
        ;

        return head;

    }

    static LNode rotateList(LNode head, int n) {
        LNode curr = head;
        LNode prev = null;
        while (n != 0) {
            //	System.out.println( " n= "+n);
            //System.out.println(" curr data "+ curr.data);
            while (true) {
                prev = curr;
                curr = curr.next;
                if (curr.next == null) {
                    curr.next = head;
                    prev.next = null;
                    head = curr;
                    break;
                }
            }

            n--;
        }

        return curr;
    }


    public static LNode getList() {
        LNode a = new LNode(38);
        LNode p = new LNode(83, a);
        LNode q = new LNode(18, p);
        LNode r = new LNode(34, q);
        LNode head = new LNode(91, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
