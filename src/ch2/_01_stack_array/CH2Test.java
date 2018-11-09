package ch2._01_stack_array;


public class CH2Test {

    public static void main(String[] args) {
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
