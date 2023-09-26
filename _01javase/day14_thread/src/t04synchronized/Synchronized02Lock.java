package t04synchronized;


/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 20:02
 * @Description 添加一个线程锁，
 */
public class Synchronized02Lock {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Synchronized02Lock s1 = new Synchronized02Lock();
        Synchronized02Lock s2 = new Synchronized02Lock();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (s1){  //使用synchronized关键字创建同步代码块
                    value++;
                }
            }
            System.out.println("thread t1 end");
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (s2){  //使用synchronized关键字创建同步代码块
                    value++;
                }
            }
            System.out.println("thread t2 end");
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);  //主线程停止1秒，保证两个线程执行完
        System.out.println(value);
    }
}
