package top.jocularchao.a01create;

import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/2 22:17
 * @description: 01初建
 */
public class TryConcurrency extends Thread{
    public static void main(String[] args) {
        //永远听音乐
        //browseNews();
        //enjoyMusic();

        //并发运行交替输出
        /*new Thread(){
            @Override
            public void run(){
                enjoyMusic();
            }
        }.start();*/
        //简化

        new Thread(TryConcurrency::enjoyMusic).start();

        browseNews();

    }

    private static void browseNews(){
        for(;;){
            System.out.println("the good news.");
            sleep(1);
        }

    }

    private static void enjoyMusic(){
        for (;;){
            System.out.println("the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
