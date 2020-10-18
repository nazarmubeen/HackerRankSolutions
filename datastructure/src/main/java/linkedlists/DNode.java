package main.java.linkedlists;

public class DNode {

    int data;
    DNode previous;
    DNode next;

    public DNode(int data, DNode previous, DNode next) {
        super();
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public DNode() {
        this.data = 0;
        this.previous = null;
        this.next = null;
    }

    public DNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
