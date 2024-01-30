package top.jocularchao.l03queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/21 18:27
 * @Description
 * 我们可以直接将一个LinkedList当做一个队列来使用
 */
public class Queue01LinkedList {
    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<>(); //当做队列使用，还是很方便的

        queue.offer("AAA");
        queue.offer("BBB");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
