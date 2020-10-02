package Algo.LinkedList;

/*Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.*/

public class PartitionList {

    public static void main(String[] args) {
        LNode head = getList();
//		/partitionList(head,1);
        LNode newHead = partitionList(head, 1);
        LinkedListUtilities.printList(newHead);
    }


    static LNode partitionList(LNode head, int data) {

        LNode smallHead = null;
        LNode currptrsmall = null;
        LNode largeHead = null;
        LNode currptrlarge = null;

        LNode temp = head;


        while (temp != null) {
            System.out.println("current node " + temp.data);
            if (temp.data < data) {
                System.out.println("smaller");
                if (smallHead == null) {
                    smallHead = temp;
                    currptrsmall = smallHead;
                } else {
                    currptrsmall.next = temp;
                    currptrsmall = currptrsmall.next;
                }

                temp = temp.next;
                currptrsmall.next = null;
            } else {
                System.out.println("greater");
                if (largeHead == null) {
                    largeHead = temp;
                    currptrlarge = largeHead;
                } else {
                    currptrlarge.next = temp;
                    currptrlarge = currptrlarge.next;
                }

                temp = temp.next;
                currptrlarge.next = null;
            }

        }

        if (currptrsmall != null)
            currptrsmall.next = largeHead;


        if (smallHead != null)
            return smallHead;
        else {
            return largeHead;
        }

    }


    public static LNode getList() {
        LNode m = new LNode(6);
        LNode a = new LNode(5, m);
        LNode p = new LNode(4, a);
        LNode q = new LNode(3, p);
        LNode r = new LNode(2, q);
        LNode head = new LNode(1, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}
