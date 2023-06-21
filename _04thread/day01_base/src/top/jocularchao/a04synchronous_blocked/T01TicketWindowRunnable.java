package top.jocularchao.a04synchronous_blocked;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 20:34
 * @description:
 */
public class T01TicketWindowRunnable implements Runnable{

    private int index = 1;
    private final static int MAX= 500;
    @Override
    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread()+"的号码是:"+(index++));
        }
    }

    public static void main(String[] args) {
        final T01TicketWindowRunnable task = new T01TicketWindowRunnable();
        Thread thread1 = new Thread(task, "一号窗口");
        Thread thread2 = new Thread(task, "二号窗口");
        Thread thread3 = new Thread(task, "三号窗口");
        Thread thread4 = new Thread(task, "四号窗口");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    //出现问题
    //1、某个号码被略过没有出现

    /*线程的执行是由CPU时间片轮询调度的，假设此时线程1和2都执行到了
    index=2,线程2将index修改为3之后未输出之前，
    cpu调度器将执行权利交给线程1线程1直接累加到4
    ，3就被忽略了
    */
    //2、某个号码被多次显示

    /*
        A执行index+1，然后cpu执行权落入B，A并没有给index赋值index+1，因此B index+1的结果不变
    */

    //3、号码超过了最大值500

    /*
         同上类比
    */
}
