package ch2._04_queue_array;

public class Main {

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(101);
        for (int i = 0; i < 100; i++) {
            queueArray.enQueue(i);
        }
        for (int i = 0; i <50 ; i++) {
            queueArray.deQueue();
        }
        for (int i = 0; i <50 ; i++) {
            queueArray.enQueue(i+100);
        }
        queueArray.traversal();
//        for (int i = 0; i <100 ; i++) {
//            Object o = queueArray.deQueue();
//            System.out.println(o);
//        }
    }
}
