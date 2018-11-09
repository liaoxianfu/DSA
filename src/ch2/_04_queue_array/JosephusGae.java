package ch2._04_queue_array;

/***
 * 一群小孩围成一圈，有一个刚出锅的山芋在他们之间
 * 传递。其中一个孩子负责数数，每数一次，拿着山芋的孩子就把山芋转交给右边的邻居。一旦数到
 * 某个特定的数，拿着山芋的孩子就必须退出，然后重新数数。如此不断，最后剩下的那个孩子就是
 * 幸运者。
 *
 *
 */

public class JosephusGae {

    public static Object Josephus(Queue Q, int K) {
        if (Q.isEmpty())
            return null;
        while (Q.getSize() > 1) {
            for (int i = 1; i < K; i++)
                Q.enQueue(Q.deQueue());
            Object o = Q.deQueue();
            System.out.println(o + "退出");
        }
        return Q.deQueue();

    }


    public static Queue initQueue(Object[] o) {
        Queue Q = new QueueArray(o.length);
        for (Object anO : o) {
            Q.enQueue(anO);
        }
        return Q;
    }


    public static void main(String[] args) {
        String[] kid = {"Alice", "Bob", "Cindy", "Doug", "Ed",
                "Fred", "Gene", "Hope", "Irene", "Jack",
                "Kim", "Lance", "Mike", "Nancy", "Ollie"};

        Queue queue = initQueue(kid);

        Object josephus = Josephus(queue, 5);
        System.out.println("幸运者是" + josephus);
    }

}
