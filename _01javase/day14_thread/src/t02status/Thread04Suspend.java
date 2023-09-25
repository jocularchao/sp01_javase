package t02status;


/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/25 18:43
 * @Description 暂停线程
 *
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
