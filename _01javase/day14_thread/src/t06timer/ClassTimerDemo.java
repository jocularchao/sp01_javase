package t06timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/28 19:14
 * @Description java提供了定时器对象
 */
public class ClassTimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();  //创建定时器对象

        timer.schedule(new TimerTask() {  //注意这个是一个抽象类，不是接口，无法使用lambda表达式简化，只能使用匿名内部类
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 1000);
    }
}
