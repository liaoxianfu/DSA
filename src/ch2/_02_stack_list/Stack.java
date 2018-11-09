package ch2._02_stack_list;

import ch2._01_stack_array.ExceptionStackEmpty;

public interface Stack {
    int getSize();
    boolean isEmpty();
    Object top() throws ExceptionStackEmpty;
    void push(Object elem);
    Object pop() throws ExceptionStackEmpty;
}
