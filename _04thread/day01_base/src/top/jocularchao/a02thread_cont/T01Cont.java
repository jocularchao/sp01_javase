package top.jocularchao.a02thread_cont;

import java.util.stream.IntStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 10:59
 * @description: 线程的默认命名
 *
 * 如果没有为线程显式地指定一个名字，
 * 那么线程将会以“Thread-”作为前缀与一个自增数字进行组合，这个自增数字在整个JVM进程中将会不断自增：
 */
public class T01Cont {

    public static void main(String[] args) {

        //IntStream
        //range static IntStream 返回有序的顺序 IntStream从 startInclusive （含）至 endExclusive通过增量步骤（独家） 1
        //boxed Stream<Integer> 返回一个Stream由该流的盒装方式的元素，每个元素的Integer
        //map 返回由给定函数应用于此流的元素的结果组成的流
        IntStream.range(0, 5).boxed().map(i -> new Thread(
                ()-> System.out.println(Thread.currentThread().getName()))
        ).forEach(Thread::start);
    }

}
