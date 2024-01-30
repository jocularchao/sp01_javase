package t07daemon;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/28 19:50
 * @Description 守护线程
 */
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (true) {
                try {
                    System.out.println("程序正常运行中");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.setDaemon(true);

        t1.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
    }
}
