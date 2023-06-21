package top.jocularchao.a04synchronous_blocked;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 21:00
 * @description:
 */
public class T02TicketWindow1 implements Runnable{
    private int index = 1;
    private final static int MAX = 50000;

    private final static Object MUTEX = new Object();

    @Override
    public void run() {
        synchronized (MUTEX){
            while (index<=MAX){
                System.out.println(Thread.currentThread()+"的号码是:"+(index++));
            }
        }
    }

    public static void main(String[] args) {
        final T02TicketWindow1 task = new T02TicketWindow1();

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
