package top.jocularchao.a03api;

import java.util.stream.IntStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 15:39
 * @description: 提醒调度器我愿意放弃当前的CPU资源，如果CPU的资源不紧张，则会忽略这种提醒
 *
 * 调用yield方法会使当前线程从RUNNING状态切换到RUNNABLE
 * 不太常用
 */
public class D02yield {
    public static void main(String[] args) {
        IntStream.range(0, 2).mapToObj(D02yield::create)
                .forEach(Thread::start);
    }

    private static Thread create(int index)
    {
        return new Thread(() ->
        {
            //①注释部分
            if (index == 0)
                Thread.yield();
            System.out.println(index);
        });

    //sleep会导致当前线程暂停指定的时间，没有CPU时间片的消耗。
    //·yield只是对CPU调度器的一个提示，如果CPU调度器没有忽略这个提示，它会导致线程上下文的切换。
    //·sleep会使线程短暂block，会在给定的时间内释放CPU资源。
    //·yield会使RUNNING状态的Thread进入RUNNABLE状态（如果CPU调度器没有忽略这个提示的话）。
    //·sleep几乎百分之百地完成了给定时间的休眠，而yield的提示并不能一定担保。
        //·一个线程sleep另一个线程调用interrupt会捕获到中断信号，而yield则不会。
    }
}
