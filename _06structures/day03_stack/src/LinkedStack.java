import java.util.NoSuchElementException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/12/3 18:37
 * @Description 用单链表实现栈
 * 直接将头结点指向栈顶结点，而栈顶结点连接后续的栈内结点
 */
public class LinkedStack<E> {
    //头结点
    private final Node<E> head = new Node<>(null);

    //入栈
    //新加入的节点放在头结点的下一个
    public void push(E element) {
        Node<E> node = new Node<>(element);     //创建新节点
        node.next = head.next;      //把原来的栈顶节点放在node的后面
        head.next = node;           //把node放在栈顶，完成插入操作
    }

    //出栈
    //将第一个元素移除
    public E pop() {
        //移除前需要判断链表是否为空
        if (head.next == null)
            throw new NoSuchElementException("栈为空");
        E element = head.next.element;  //取值
        head.next = head.next.next;

        return element;
    }

    //创建结点类
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("111");
        stack.push("222");
        stack.push("333");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
