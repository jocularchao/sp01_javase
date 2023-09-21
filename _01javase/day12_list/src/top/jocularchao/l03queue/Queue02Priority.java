package top.jocularchao.l03queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/21 18:43
 * @Description 优先级队列
 */
public class Queue02Priority {
    public static void main(String[] args) {
        //PriorityQueue来实现优先级队列
        Queue<Object> queue = new PriorityQueue<>();

        queue.offer(10);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.poll());  //4
        System.out.println(queue.poll());  //5
        System.out.println(queue.poll());  //10

        //我们明明插入顺序是10/4/5，出队顺序却按照优先级来的
        //但优先级队列并不是队列中所有的元素都是按照优先级排放的，优先级队列只能保证出队顺序是按照优先级**进行的
        //所以我们要自定义比较规则，
        Queue<Integer> queue1 = new PriorityQueue<>((a,b) -> b-a);
        queue1.offer(10);
        queue1.offer(4);
        queue1.offer(5);
        System.out.println(queue1);

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
    }
}
