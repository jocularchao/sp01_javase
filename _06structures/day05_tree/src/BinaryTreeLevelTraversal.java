import java.util.NoSuchElementException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/12/5 16:19
 * @Description 层序遍历
 *     a b c d e f 一层一层从做到右顺序打印每个结点
 *     用队列来实现层序遍历，首先将根结点存入队列中，接着循环  进行出队操作，得到的结点将此结点的左右孩子依次入队
 */
public class BinaryTreeLevelTraversal {


    private static <E> void levelOrder(BinaryTree<E> root){
        LinkedQueue<BinaryTree<E>> queue = new LinkedQueue<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            BinaryTree<E> node = queue.poll();
            System.out.print(node.e+" ");
            if (node.left != null) queue.offer(node.left);
            if (node.right!= null) queue.offer(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree<Character> a = new BinaryTree<>('A');
        BinaryTree<Character> b = new BinaryTree<>('B');
        BinaryTree<Character> c = new BinaryTree<>('C');
        BinaryTree<Character> d = new BinaryTree<>('D');
        BinaryTree<Character> e = new BinaryTree<>('E');
        BinaryTree<Character> f = new BinaryTree<>('F');

        a.left =b;
        a.right = c;
        b.left = d;
        b.right =e;
        c.left = f;
        levelOrder(a);
    }
}
class LinkedQueue<E> {

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

    public boolean isEmpty(){   //这里多写了一个判断队列为空的操作，方便之后使用
        return head.next == null;   //直接看头结点后面还有没有东西就行了
    }
}
