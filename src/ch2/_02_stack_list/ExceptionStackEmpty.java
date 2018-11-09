package ch2._02_stack_list;

/**
 * 定义如果栈为空的情况 就抛出异常
 */
public class ExceptionStackEmpty extends RuntimeException {
    public ExceptionStackEmpty(String err) {
        super(err);
    }

}
