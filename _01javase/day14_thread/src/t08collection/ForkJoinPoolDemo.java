package t08collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/28 19:59
 * @Description ForkJoinPool 实现了并行流，其实就是一个多线程执行的流
 */
public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 65, 78));

        list
                .parallelStream()  //获得并行流
                .forEach( i ->
                        System.out.println(Thread.currentThread().getName()+"->"+i));

        //利用.forEachOrdered使用单线程维持原本的顺序
        list
                .parallelStream()
                .forEachOrdered(System.out::println);


    }
}
