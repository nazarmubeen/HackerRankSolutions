package Algo.LinkedList;

public class LinkedListUtilities {

    /*
     * This function is to print Linked List
     */
    public static void printList(LNode n) {

        if (n == null) {
            return;
        }
        LNode temp = n;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println(" ");
    }

    /* This function is to insert nodes at tail
     * 2 -->NULL
        2 --> 3 --> NULL
     */
    public static LNode insertNodeAtTail(LNode head, LNode node) {
        if (head == null) {
            head = node;
            return head;
        }

        LNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    /*
     * This function is to insert Node at Head
     */
    public static LNode insertNodeAtHead(LNode head, LNode node) {
        if (head == null) {
            head = node;
            return head;
        }

        node.next = head;
        head = node;
        return head;

    }

    //insert a Node at specific position
    public static LNode insertNodeAtPosition(LNode head, int data, int position) {
        if (head == null) {
            return head;
        }
        LNode node = new LNode(data);

        LNode temp = head;
        while (position != 0) {
            temp = temp.next;
            position--;
        }

        node.next = temp.next;
        temp.next = node;

        return head;
    }

    //insert a Node in sort
    public static LNode insertNodeInSort(LNode head, LNode node) {
        if (head == null) {
            return head;
        }
        LNode temp = head;

        while (!(temp.next.data > node.data)) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        return head;
    }

    //delete a Node in LinkedList
    public static LNode deleteNode(LNode head, int data) {


        if (head == null) {
            return head;
        }
        LNode temp = head;
        if (head.data == data) {

            head = head.next;
            temp = null;
            return head;

        }


        while (temp.next != null) {
            if (temp.next.data == data) {
                LNode tempnext = temp.next;
                temp.next = tempnext.next;
                tempnext = null;
            }
            temp = temp.next;
        }
        return head;
    }

    //function to print linked list in reverse order
    public static void printReverseList(LNode head) {
        if (head == null) {
            return;
        }
        LNode node = head;
        if (node != null) {
            printReverseList(node.next);
            System.out.print("  " + node.data);
        }
    }

    //function to reverse linked list
    public static LNode reverseList(LNode head) {
        if (head == null) {
            return null;
        }

        LNode current = head;
        LNode prev = null;
        LNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }

}
