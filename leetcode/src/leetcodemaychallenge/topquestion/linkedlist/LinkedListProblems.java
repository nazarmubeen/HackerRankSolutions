package leetcodemaychallenge.topquestion.linkedlist;

public class LinkedListProblems {

    public static void main(String[] args){

        ListNode head=new ListNode(4);

        ListNode f=new ListNode(2);
        head.next=f;
        ListNode s=new ListNode(1);
         f.next=null;
        ListNode t=new ListNode(9);
        s.next=t;

        removeNthFromEnd(head,1);
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;
        ListNode del=head;
        ListNode prev=null;

        while(n>0){
            temp=temp.next;
            n--;
        }

        while(temp!=null){
            temp=temp.next;
            prev=del;
            del=del.next;

        }

        if(del.next!=null){
            del.val=del.next.val;
            del.next=del.next.next;
        }
        else if(del==head){
            head=null;
        }
        else{
            prev.next=null;
        }
        return head;

    }


    public ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }

        ListNode prev=null;
        ListNode current=head;
        ListNode next=head.next;

        while(next!=null){

            current.next=prev;
            prev=current;
            current = next;
            next = next.next;

        }

        current.next = prev;
        head = current;
        return head;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;

        ListNode result = head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode connectNode = head.next;

        while (p1 != null && p2 != null) {
            ListNode t = p2.next;
            if (t == null)
                break;

            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = connectNode;

        return result;

    }
}

