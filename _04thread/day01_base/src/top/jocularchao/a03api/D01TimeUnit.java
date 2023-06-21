package top.jocularchao.a03api;

import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 15:36
 * @description: JDK引入了一个枚举TimeUnit，其对sleep方法提供了很好的封装，使用它可以省去时间单位的换算步骤
 *
 */
public class D01TimeUnit {
    public static void main(String[] args) throws InterruptedException {

    Thread.sleep(12257088L);
    TimeUnit.HOURS.sleep(3);
    TimeUnit.MINUTES.sleep(24);
    TimeUnit.SECONDS.sleep(17);
    TimeUnit.MILLISECONDS.sleep(88);
    }
}
