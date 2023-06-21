package top.jocularchao.a02thread_cont;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 12:13
 * @description: 守护线程
 */
public class T08DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        //① main线程开始
        Thread thread = new Thread(() ->
        {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true); //②将thread设置为守护线程

        thread.start();  //③ 启动thread线程
        Thread.sleep(2_000L);
        System.out.println("Main thread finished lifecycle.");
        //④ main线程结束
    }
}
