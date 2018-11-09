package ch2._04_queue_array;

/***
 * 实现循环队列
 *
 */

public class QueueArray implements Queue {
    private static final int CAPACITY = 1024; // 默认开辟数组的大小
    private int capacity = 0; //实际数组的大小
    private Object[] Q; //数组
    private final static String EMPTY_ERR = "Queue is Empty!";
    private int font = 0; //记录队首的位置
    private int tail = 0; //记录队尾的位置


    /**
     * 默认构造函数 队列的大小为1024
     */
    public QueueArray() {
        capacity = CAPACITY;
        Q = new Object[capacity];
    }

    /***
     * 自定义队列的大小
     * @param size 数据大小
     */
    public QueueArray(int size) {
        this.capacity = size + 1;
        Q = new Object[capacity];
    }


    private boolean full() {
        return getSize() == capacity - 1;
    }

    @Override
    public int getSize() {
        return (tail - font + capacity) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return font == tail;
    }


    @Override
    public Object front() throws ExceptionQueueException {
        if (isEmpty()) {
            throw new ExceptionQueueException(EMPTY_ERR);
        }

        return Q[font];
    }

    @Override
    public void enQueue(Object elem) {
        if (full()) {
            throw new RuntimeException("full");
        }
        Q[tail] = elem;
        tail = (++tail) % capacity;
    }

    @Override
    public Object deQueue() throws ExceptionQueueException {
        if (isEmpty()) {
            throw new ExceptionQueueException(EMPTY_ERR);
        }
        Object e = Q[font];
        Q[font] = null;
        font = (font + 1) % capacity;
        return e;
    }

    @Override
    public void traversal() {
        // 利用StringBuilder 效率更高
        StringBuilder queue_format = new StringBuilder("[");
        for (int i = 0; i < getSize(); i++) {
            int position = (font + i) % capacity;
            queue_format.append(Q[position]).append(",");
        }
        queue_format.append("]");
        System.out.println(queue_format);

    }
}
