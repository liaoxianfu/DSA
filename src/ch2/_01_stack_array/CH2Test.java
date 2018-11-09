package ch2._01_stack_array;

import org.junit.Test;


public class CH2Test {
    @Test
    public void demo1() {
        StackArray stackArray = new StackArray();
        for (int i = 0; i < 2048; i++) {
            stackArray.push(i);
        }

        for (int i = 0; i < 5; i++) {
            Object pop = stackArray.pop();
            System.out.println(pop);
        }

    }
}
