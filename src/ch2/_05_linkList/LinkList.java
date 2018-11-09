package ch2._05_linkList;

public interface LinkList {
    /**
     * 添加元素作为头结点
     * @param first 原头结点
     * @param elem 元素
     * @return 头结点
     */
    Node addAsFirst(Node first,Object elem);

    /**
     * 删除头结点
     * @return
     */
    Node dleFirst();


    /**
     * 添加元素
     * @param first 头结点
     * @param elem 元素
     * @return 头结点
     */
    Node addlElem(Node first,Object elem);


    /**
     * 插入元素
     * @param first
     * @param elem2
     * @param elem1
     * @return
     */
    Node insertElem(Node first,Object elem1,Object elem2);

    
}
