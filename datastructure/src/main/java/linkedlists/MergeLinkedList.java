package main.java.linkedlists;

public class MergeLinkedList {
    /*
     * You�re given the pointer to the head nodes of two sorted
     *  linked lists. The data in both lists will be sorted in
     *   ascending order. Change the next pointers to obtain a
     *   single, merged linked list which also has data in
     *   ascending order. Either head pointer given may be null
     *    meaning that the corresponding list is empty.
     *
     *
     */
//using dummy pointer
    public static LNode MergeLists2(LNode list1, LNode list2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        LNode p1 = list1;
        LNode p2 = list2;

        LNode fakeHead = new LNode();
        LNode p = fakeHead;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }

            p = p.next;
        }

        if (p1 != null)
            p.next = p1;
        if (p2 != null)
            p.next = p2;

        return fakeHead.next;
    }

    //using sorted technique
    public static LNode MergeLists(LNode head1, LNode head2) {
        LNode head = null;
        if (head1 == null && head2 == null) {
            return null;
        } else if (head1 == null && head2 != null) {
            return head2;
        } else if (head1 != null && head2 == null) {
            return head1;
        }

        if (LinkedListOperations.listSize(head1) > LinkedListOperations.listSize(head2))
            head = merge(head1, head2);
        else {
            head = merge(head2, head2);
        }

        return head;
    }

    public static LNode merge(LNode head1, LNode head2) {
        LNode temp1 = head1;
        LNode temp2 = head2;
        LNode temp;

        while (temp2 != null) {
            temp = temp2.next;
            while (!(temp1.next.data > temp2.data)) {
                temp1 = temp1.next;
            }
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp2 = temp;
        }
        return head1;
    }


}
