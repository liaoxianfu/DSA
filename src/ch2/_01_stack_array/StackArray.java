package ch2._01_stack_array;

/***
 * 基于数据创建栈
 */
public class StackArray implements Stack {
    private static final int CAPACITY = 1024;
    private int capacity = 0;
    private Object[] S;
    private int top = -1;
    private final static String EMPTY_ERR = "Stack is Empty!";

    /**
     * 数组扩展 扩展为原来的两倍
     *
     * @return arr
     */
    private Object[] extentionArr(Object[] arr) {
        capacity *= 2;
        Object[] objArr = new Object[capacity];
        System.arraycopy(arr, 0, objArr, 0, arr.length);
        return objArr;
    }


    StackArray() {
        capacity = CAPACITY;
        S = new Object[CAPACITY];
    }

    public StackArray(int size) {
        capacity = size;
        S = new Object[capacity];
    }

    @Override
    public int getSize() {

        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        if (isEmpty()) {

            throw new ExceptionStackEmpty(EMPTY_ERR);
        }

        return S[top];
    }

    @Override
    public void push(Object elem) {
        if (top >= capacity - 1) {

            S = extentionArr(S);
        }
        S[++top] = elem;
    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        if (isEmpty()) {
            throw new ExceptionStackEmpty(EMPTY_ERR);
        }
        return S[top--];
    }
}
