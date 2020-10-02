package Algo.LinkedList;

public class PallindromeList {

    public static void main(String[] args) {

        LNode head = CreateList.getList();
        System.out.println("final result " + lPalin(head));
        //	Node newhead=reverseList(head);
        //LinkedListUtilities.printList(newhead);
    }


    public static int lPalin(LNode A) {

        if (A == null) {
            return 0;
        }

        if (A.next == null) {
            //only element is pallindrome
            return 1;
        }

        LNode slowptr = A;
        LNode fastptr = A;

        int count = 1;
        while (fastptr != null && fastptr.getNext() != null) {
            slowptr = slowptr.getNext();
            fastptr = fastptr.getNext().getNext();
            count++;
            if (fastptr == null) {
                count--;
            }
        }

        System.out.println(slowptr.getData());
        System.out.println("count " + count);
        if (count % 2 != 0 && count > 1) {
            slowptr = slowptr.next;
        }
        LNode reverseptr = slowptr;
        reverseptr = reverseList(reverseptr);

        // System.out.println(reverseptr.data);
        LNode currptr = A;
        while (reverseptr != null) {
            System.out.println(reverseptr.getData());
            System.out.println(currptr.getData());
            if (currptr.data != reverseptr.data) {
                System.out.println("not equal");
                return 0;
            }
            reverseptr = reverseptr.next;
            currptr = currptr.next;
        }

        return 1;

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


}

