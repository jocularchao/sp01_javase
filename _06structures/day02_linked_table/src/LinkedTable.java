/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/15 18:12
 * @Description 带头结点的单链表实现
 *
 */
public class LinkedTable <E>{

    //链表的头结点，用于连接之后的所有结点,头结点内容为null
    private final Node<E> head = new Node<>(null);

    private int size = 0;   //当前元素数量还是要存一下，方便后面的操作


    //内部静态结点类   只供内部使用
    private static class Node<E> {

        E element;
        Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }

    //插入结点
    public void add(E element,int index) {
        //创建前驱节点，并找到索引位置
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        //到达索引位置后，创建要插入新结点
        Node<E> node = new Node<>(element);

        prev = node.next;


    }

}
