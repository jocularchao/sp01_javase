package top.jocularchao.l03queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/21 18:38
 * @Description 双端队列
 */
public class Deque01LinkedList {
    public static void main(String[] args) {
        //栈
        Deque<String> deque = new LinkedList<>();
        deque.push("AAA");
        deque.push("BBB");

        System.out.println(deque.poll());
        System.out.println(deque.poll());

        //迭代器
        System.out.println(deque);
        deque.addLast("BBB");
        deque.addLast("SSS");

        //正向迭代器
        Iterator<String> iterator = deque.iterator();
        System.out.println(iterator.next());

        //反向迭代器
        Iterator<String> descendingIterator = deque.descendingIterator();
        System.out.println(descendingIterator.next());

    }
}
