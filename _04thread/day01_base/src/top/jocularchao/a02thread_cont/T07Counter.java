package top.jocularchao.a02thread_cont;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 12:09
 * @description: 虚拟机栈
 */
public class T07Counter extends Thread{
    final static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        try {
            while (true) {
                new T07Counter().start();
            }
        } catch (Throwable e) {
            System.out.println("failed At=>" + counter.get());
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("The " + counter.getAndIncrement() + " thread be created.");
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
