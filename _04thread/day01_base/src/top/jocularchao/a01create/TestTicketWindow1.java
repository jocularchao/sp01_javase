package top.jocularchao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 10:44
 * @description:
 */
public class TestTicketWindow1 implements Runnable {
    private int index = 1; //不做static修饰

    private final static int MAX = 50;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread() + "的号码是" + (index++));

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        final TestTicketWindow1 task = new TestTicketWindow1();

        Thread thread1 = new Thread(task, "一号窗口");
        Thread thread2 = new Thread(task, "二号窗口");
        Thread thread3 = new Thread(task, "三号窗口");
        Thread thread4 = new Thread(task, "四号窗口");

         thread1.start();
         thread2.start();
         thread3.start();
         thread4.start();
    }
}
