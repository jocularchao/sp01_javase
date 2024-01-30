package t04synchronized;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/26 11:15
 * @Description 等待与唤醒
 */
public class Thread07WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();

        Thread t1 = new Thread(()->{
            synchronized (o1) {
                try {
                    System.out.println("线程开始等待");
                    o1.wait(); //进入等待状态并释放锁
                    System.out.println("等待结束");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (o1) {
                System.out.println("线程开始唤醒");
                o1.notify();   //唤醒处于等待状态的锁
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }

                //唤醒后，依然需要等待这里的锁释放之前等待地线程才能继续
            }
        });

        t1.start();
        Thread.sleep(3000);
        t2.start();
    }
}
