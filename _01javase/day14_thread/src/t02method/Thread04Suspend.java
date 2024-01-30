package t02method;


/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:43
 * @Description  suspend 暂停线程
 *
 * `suspend()`在使线程暂停的同时，并不会去释放任何锁资源。
 * 其他线程都无法访问被它占用的锁。直到对应的线程执行`resume()`方法后，被挂起的线程才能继续，
 * 从而其它被阻塞在这个锁的线程才可以继续执行。但是，如果`resume()`操作出现在`suspend()`之前执行，那么线程将一直处于挂起状态，
 * 同时一直占用锁，这就产生了死锁
 */
public class Thread04Suspend {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            System.out.println("thread start");

            Thread.currentThread().suspend(); //暂停
            System.out.println("线程继续执行");
        });

        t.start();

        try {
            Thread.sleep(5000);
            t.resume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
