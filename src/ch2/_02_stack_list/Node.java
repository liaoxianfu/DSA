package ch2._02_stack_list;

/**
 * 创建node类
 */

public class Node {
    private Object elem;
    private Node next; //底层的node


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
