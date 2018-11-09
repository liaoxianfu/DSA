package ch2._01_stack_array;

public interface Stack {
    int getSize();
    boolean isEmpty();
    Object top() throws ExceptionStackEmpty;
    void push(Object elem);
    Object pop() throws ExceptionStackEmpty;
}
