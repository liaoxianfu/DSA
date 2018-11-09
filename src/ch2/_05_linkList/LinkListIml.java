package ch2._05_linkList;

import javax.print.attribute.standard.NumberUp;

public class LinkListIml implements LinkList {

    private Node font; //头结点
    private Node before; //当前节点前一个结点
    private Node tail; //尾结点


    @Override
    public Node init(Object elem) {
        font = new Node(elem, null);
        return font;
    }

    @Override
    public Node getFirstNode() {
        return font;
    }

    @Override
    public Node getTailNode() {
        Node node = font;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public Node addAsFirst(Object elem) {
        if (font == null) {
            return init(elem);
        }
        font = new Node(elem, font);
        return font;
    }

    @Override
    public Node delFirst() {
        Node node = font;
        font = font.getNext();
        Object o = node.getElem();
        node.setElem(null);
        node.setNext(null);
        return font;
    }

    @Override
    public Node addElem(Object elem) {
        Node tailNode = getTailNode();
        Node node = new Node(elem, null);
        tailNode.setNext(node);
        return font;
    }

    @Override
    public Node insertElem(Object elem1, Object elem2) {
        Node node = font;
        while (node != null) {
            if (node.getElem() == elem1) {
                Node node1 = new Node(elem2, node.getNext());
                node.setNext(node1);
                return font;
            }

            node = node.getNext();
        }
        throw new NoElemException("没有找到元素" + elem1 + "\n");
    }

    @Override
    public Node delElem(Object elem) {
        Node pre = null, cur;
        cur = font;
        if (font.getElem() == elem) {
            font = delFirst();
            return font;
        }
        while (cur != null) {
            if (cur.getElem() == elem) {
                pre.setNext(cur.getNext());
                cur.setElem(null);
                cur.setNext(null);
                return font;
            }
            pre = cur;
            cur = cur.getNext();
        }
        throw new NoElemException("没有找到元素" + elem + "\n");
    }

    @Override
    public Node delLastEem() {
        Node node = font;
        if (node.getNext() == null) {
            font = delFirst();
            return font;
        }

        Node pre = null;
        while (node.getNext() != null) {
            pre = node;
            node = node.getNext();
        }
        assert pre != null;
        pre.getNext().setElem(null);
        pre.setNext(null);
        return font;
    }


}
