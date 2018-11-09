package ch2._02_stack_list;

public class Main {
    public static void main(String[] args) {
        StackList stackList = new StackList();
        boolean empty = stackList.isEmpty();
        System.out.println(empty);
        for (int i = 0; i <10 ; i++) {
            stackList.push(i);

        }

        int size = stackList.getSize();
        System.out.println(size);
        for (int i = 0; i <10 ; i++) {
            Object pop = stackList.pop();
            System.out.println(pop);
        }

    }

}
