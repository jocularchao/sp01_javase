/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/12/4 19:23
 * @Description 无头结点非循环单向链表
 */
public class HeadlessLinkedTable<E> {

    private Node<E> head ;

    private int size = 0;   //当前元素数量还是要存一下，方便后面的操作


    //内部静态结点类   只供内部使用
    private static class Node<E> {

        E element;      //数据域
        Node<E> next;   //指针域

        public Node(E element){
            this.element = element;
        }
    }

    //头插法插入结点



    //尾插法

}
