import java.util.NoSuchElementException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/12/3 17:34
 * @Description 用单链表实现队列
 * 用链表不用考虑容量问题
 */
public class LinkedQueue<E> {
    //头结点
    //因为是单链表，队首需要存放指向头结点的指针，因为需要的是前驱结点，队尾直接指向尾节点的指针即可
    private final Node<E> head = new Node<>(null);

    //入队
    public void offer(E element) {
        //创建新节点放在队尾，如何放到队尾？先放到队首进行判断
        Node<E> last = head;
        //判断last即队首的下一个节点是否为空，若为空，直接初始化下一个节点并赋值last.next，若不为空则继续判断
        while (last.next != null)
            last = last.next;
        last.next= new Node<>(element);

    }

    //出队
    public E poll(){
        //先判断，队列是否为空
        if (head.next == null)
            throw new NoSuchElementException("没有节点");
        //若不为空，则从队首取出，并保持链表完整
        E element = head.next.element;
        head.next=head.next.next;
        return element;
    }

    //创建指针类，用作标记节点
    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("111");
        queue.offer("222");
        queue.offer("333");

        System.out.println(queue.poll());   //111
        System.out.println(queue.poll());   //222
        System.out.println(queue.poll());   //333
    }
}
