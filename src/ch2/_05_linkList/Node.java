package ch2._05_linkList;

public class Node {
    private Object elem;
    private Node next;


    public Node() {

    }

    public Node(Object o, Node n) {
        elem = o;
        next = n;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElem() {
        return elem;
    }

    public Node getNext() {
        return next;
    }

}
