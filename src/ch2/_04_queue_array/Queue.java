package ch2._04_queue_array;

public interface Queue {
    int getSize();
    boolean isEmpty();
    Object front() throws ExceptionQueueException; //取出队列中的队头元素但是不删除

    void enQueue(Object elem);

    Object deQueue() throws ExceptionQueueException;
    void traversal(); //遍历

}
