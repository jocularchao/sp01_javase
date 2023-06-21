package top.jocularchao.a03api;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 13:28
 * @description:
 */
public class D01sleep {
    //public static void sleep（long millis）throws InterruptedException
    //public static void sleep（long millis，int nanos）throws InterruptedException

    //sleep方法会使当前线程进入指定毫秒数的休眠，暂停执行，虽然给定了一个休眠的时间，但是最终要以系统的定时器和调度器的精度为准
    public static void main(String[] args) {
        new Thread(() ->
        {
            long startTime = System.currentTimeMillis();
            sleep(2_000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms", (endTime - startTime)));
        }).start();

        long startTime = System.currentTimeMillis();
        sleep(3_000L);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Main thread total spend %d ms", (endTime - startTime)));

    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }


}
