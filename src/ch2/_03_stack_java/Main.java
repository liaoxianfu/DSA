package ch2._03_stack_java;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        boolean empty = integers.empty();
        System.out.println(empty);
        integers.push(1);
        integers.push(45);
        Integer pop = integers.pop();
        System.out.println(pop);
        int search = integers.search(1);
        System.out.println(search);
    }


}
