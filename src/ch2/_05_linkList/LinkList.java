package ch2._05_linkList;

public interface LinkList {
    /**
     * 添加元素作为头结点
     *
     *
     * @param elem  元素
     * @return 头结点
     */
    Node addAsFirst(Object elem);

    /**
     * 删除头结点
     *
     * @return
     */
    Node delFirst();


    /**
     * 添加元素
     *
     *
     * @param elem  元素
     * @return 头结点
     */
    Node addElem(Object elem);


    /**
     * 插入元素
     *
     * @param elem2
     * @param elem1
     * @return
     */
    Node insertElem(Object elem1, Object elem2);

    /**
     * 删除指定的元素
     *
     *
     * @param elem
     * @return
     */
    Node delElem(Object elem);

    /***
     * 删除最后一个元素
     *
     *
     * @return
     */
    Node delLastEem( );

    /**
     * 初始化创建头结点
     *
     * @param elem
     * @return
     */
    Node init(Object elem);

    /**
     * 获取头结点
     *
     * @return
     */
    Node getFirstNode();


    Node getTailNode();

}
