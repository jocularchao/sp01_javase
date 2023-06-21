package top.jocularchao.a03api;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 16:17
 * @description:
 * join A  B进入等待blocked  直到A结束生命周期或者A到达指定时间
 * public final void join（）
 * public final synchronized void join（long millis，int nanos）
 * public final synchronized void join（long millis）
 *
 */
public class D06join {
    public static void main(String[] args) throws InterruptedException {


        //1、定义两个线程并保存在threads中

        List<Thread> threads = IntStream.range(1, 3).mapToObj(D06join::create).collect(Collectors.toList());

        //2、启动这两个线程

        threads.forEach(Thread::start);
        //3、执行这两个线程的join方法

        for (Thread thread :
                threads) {
            thread.join();
        }

        //4、

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "#" + i);
            shortSleep();
        }

    }

    //构造简单的线程，每个线程只是简单的循环输出
    private static Thread create(int seq){
        return new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"#"+i);
                shortSleep();
            }
        },String.valueOf(seq));
    }

    private static void shortSleep(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
