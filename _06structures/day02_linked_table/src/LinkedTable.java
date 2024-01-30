/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/10/15 18:12
 * @Description 带头结点非循环单向链表
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
        //考虑索引位置是否合法
        if(index<0 || index>size) {
            throw new IndexOutOfBoundsException("插入位置非法");
        }
        //创建前驱节点，并找到索引位置
        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        //到达索引位置后，创建要插入新结点
        Node<E> node = new Node<>(element);

        //索引是从第一个有内容的结点 为 0 开始的，所以prev到的位置是，索引位置的上一位
        node.next = prev.next;
        prev.next = node;
        //容量+1
        size++;
    }

    //删除结点
    public E del(int index) {
        //判断index是否合法
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("索引非法");
        }

        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        E e = prev.next.element;
        prev.next = prev.next.next;

        //容量-1
        size -- ;
        return e;
    }

    //打印单链表
    @Override
    public String toString() {
        //创建可变字符串对象，用于保存并打印链表
        StringBuilder builder = new StringBuilder();

        //新建结点用于遍历
        Node<E> node = head.next;
        while (node != null){
            builder.append(node.element).append(" ");
            node = node.next;
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        LinkedTable<Integer> linkedTable = new LinkedTable<>();

        linkedTable.add(10,0);
        linkedTable.add(30,0);
        linkedTable.add(20,1);

        System.out.println(linkedTable.toString());

        linkedTable.del(2);
        System.out.println(linkedTable);

    }

}
