/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/15 18:12
 * @Description 带头结点的单链表实现
 */
public class LinkedTable <E>{

    //链表的头结点，用于连接之后的所有结点,头结点内容为null
    private final Node<E> head = new Node<>(null);

    private int size = 0;   //当前元素数量还是要存一下，方便后面的操作


    //内部静态结点类   只供内部使用
    private static class Node<E> {

        E element;      //每个节点都存放一个元素
        Node<E> next;   //指向下一个结点的引用

        public Node(E element) {
            this.element = element;
        }
    }

    //插入结点



}
