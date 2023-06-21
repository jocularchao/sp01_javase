package top.jocularchao.a03api;

import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/5 15:58
 * @description: interrupt 中断
 * ·public void interrupt（）
 * ·public static boolean interrupted（）
 * ·public boolean isInterrupted（）
 *
 * 如下方法是线程进入阻塞，调用interrupt方法，打断阻塞
 * Object的wait方法。
 * Object的wait（long）方法。
 * Object的wait（long，int）方法。
 * Thread的sleep（long）方法。
 * Thread的sleep（long，int）方法。
 * Thread的join方法。
 * Thread的join（long）方法。
 * Thread的join（long，int）方法。
 * InterruptibleChannel的io操作。
 * Selector的wakeup方法。
 * 其他方法。
 *
 * 仅仅是打断了当前线程的阻塞状态
 * 旦线程在阻塞的情况下被打断，都会抛出一个称为InterruptedException的异常
 * 通知当前线程被打断了
 *
 *
 * isInterrupt 判断当前线程是否被中断
 */
public class D05interrupt {
    public static void main(String[] args) throws InterruptedException {



        /*创建了一个线程，并且企图休眠1分钟的时长，
        不过很可惜，大约在20秒之后就被主线程调用interrupt方法打断，
        程序的执行结果就是“interrupted”*/
        Thread thread = new Thread(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        });

        thread.start();

        System.out.println(thread.isInterrupted());
        TimeUnit.MILLISECONDS.sleep(20000);
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }

}
