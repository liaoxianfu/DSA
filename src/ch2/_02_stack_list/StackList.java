package ch2._02_stack_list;

import ch2._01_stack_array.ExceptionStackEmpty;

/**
 * 通过链表的方式创建栈
 * 不需要先指定空间的大小
 */

public class StackList implements Stack {
    private int size = 0;
    private Node top;
    private static final String STACK_ERR = "Stack is Empty！";

    public StackList() {
        top = null;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        if (isEmpty()) {

            throw new ExceptionStackEmpty(STACK_ERR);
        }

        return top.getElem();
    }

    @Override
    public void push(Object elem) {
        top = new Node(elem, top);
        size++;
    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        if (isEmpty()) {
            throw new ExceptionStackEmpty(STACK_ERR);
        }
        Object elem = top.getElem();
        top = top.getNext();
        return elem;
    }

}
