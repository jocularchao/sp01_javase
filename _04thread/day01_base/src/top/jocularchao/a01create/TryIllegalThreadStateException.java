package top.jocularchao.a01create;

import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/3 16:16
 * @description: 03IllegalThreadStateException异常
 */
public class TryIllegalThreadStateException extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
           try {
               TimeUnit.SECONDS.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });
        //一个线程生命周期结束，也就是到了TERMINATED状态，再次调用start方法是不允许的，也就是说TERMINATED状态是没有办法回到RUNNABLE/RUNNING状态的
        //启动
        thread.start();
        //再次启动
        //thread.start(); 1、重复启动,第二次启动是不允许,该线程是处于运行状态的
        //调整

        TimeUnit.SECONDS.sleep(2); //2、企图重新激活,此时没有线程
        thread.start();
    }
}
