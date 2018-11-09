package ch2._05_linkList;

public class Main {
    public static void main(String[] args) {
        LinkListIml linkListIml = new LinkListIml();
        linkListIml.init(5);
        linkListIml.addAsFirst(6);
        Node node = linkListIml.addAsFirst(7);
        Node node1 = linkListIml.delFirst();
        Node node2 = linkListIml.addElem(51);
        node2 = linkListIml.insertElem(5, 89);


        while (node2 != null) {
            while (node2 != null) {
                System.out.println(node2.getElem());
                node2 = node2.getNext();

            }
            System.out.println("************");
            node2 = linkListIml.delLastEem();
        }

    }
}
