package algo.linkedlists;

public class AddTwoNumberInList {

    public static void main(String[] args) {
        LNode head1 = getList1();
        LNode head2 = getList2();

        LNode head = addTwoLists(head1, head2);
        LinkedListUtilities.printList(head);
    }

    static LNode addTwoLists(LNode head1, LNode head2) {
        LNode head = null;
        LNode curr = head;
        LNode temp1 = head1;
        LNode temp2 = head2;

        int carry = 0;
        int sum = 0;
        while (temp1 != null && temp2 != null) {
            sum = temp1.data + temp2.data + carry;
            System.out.println("sum " + sum);
            if (sum > 9) {
                carry = sum / 10;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            if (head == null) {
                head = new LNode(sum);
                curr = head;
            } else {
                LNode temp = new LNode(sum);
                curr.next = temp;
                curr = temp;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }

        if (temp1 == null && temp2 != null) {
            while (temp2 != null) {
                sum = temp2.data + carry;
                System.out.println("sum in temp2 " + sum);
                if (sum > 9) {
                    carry = sum / 10;
                    sum = sum % 10;
                } else {
                    carry = 0;
                }
                LNode temp = new LNode(sum);
                //		System.out.println(" temp data "+temp.data);
                curr.next = temp;
                curr = temp;
                temp2 = temp2.next;
            }

        }
        if (temp1 != null && temp2 == null) {

            while (temp1 != null) {
                sum = temp1.data + carry;
                System.out.println("sum in temp1" + sum);
                if (sum > 9) {
                    carry = sum / 10;
                    sum = sum % 10;
                } else {
                    carry = 0;
                }
                LNode temp = new LNode(sum);
                curr.next = temp;
                curr = temp;
                temp1 = temp1.next;
            }

        }

        if (carry == 1) {
            LNode temp = new LNode(carry);
            curr.next = temp;
        }

        return head;

    }


    public static LNode getList1() {
		
		/*Node q=new Node(3);
		Node r=new Node(4,q);*/
        LNode head = new LNode(1);
        LinkedListUtilities.printList(head);
        return head;
    }

    public static LNode getList2() {
        LNode q = new LNode(9);
        LNode r = new LNode(9, q);
        LNode head = new LNode(9, r);
        LinkedListUtilities.printList(head);
        return head;
    }
}