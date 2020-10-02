package Algo.LinkedList;

public class LNode {

    int data;
    LNode next;

    public LNode() {
        data = 0;
        next = null;
    }

    public LNode(int data, LNode next) {
        super();
        this.data = data;
        this.next = next;
    }

    public LNode(int data) {
        super();
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LNode getNext() {
        return next;
    }

    public void setNext(LNode next) {
        this.next = next;
    }

}
