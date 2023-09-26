package t04synchronized;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 19:56
 * @Description 同步问题
 * 当两个线程同时读取value的时候，可能会同时拿到同样的值，而进行自增操作之后，也是同样的值，
 * 再写回主内存后，本来应该进行2次自增操作，实际上只执行了一次
 */
public class Synchronized01LockProblem {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                value++;
            }
            System.out.println("thread t1 end");
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                value++;
            }
            System.out.println("thread t2 end");
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);  //主线程停止1秒，保证两个线程执行完
        System.out.println(value);
    }
}
