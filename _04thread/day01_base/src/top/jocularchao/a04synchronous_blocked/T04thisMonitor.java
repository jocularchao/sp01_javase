package top.jocularchao.a04synchronous_blocked;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 21:18
 * @description:
 */
public class T04thisMonitor {

    public synchronized void method1() {
        System.out.println(currentThread().getName() + " enter to method1");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*public synchronized void method2()
    {
        System.out.println(currentThread().getName() + " enter to method2");
        try
        {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }*/
    public void method2() {

        synchronized (this){

            System.out.println(currentThread().getName() + " enter to method2");
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        T04thisMonitor thisMonitor = new T04thisMonitor();

        new Thread(thisMonitor::method1, "T1").start();
        new Thread(thisMonitor::method2, "T2").start();
    }
}
