package s01stream;

import java.util.IntSummaryStatistics;
import java.util.Random;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/22 23:11
 * @Description random生成的流
 */
public class StreamDemoRandom {
    public static void main(String[] args) {
        // random支持直接生成随机数的流
        Random random = new Random();
        random
                .ints(-100,100) //生成-100~100之间的，随机int型数字（本质上是一个IntStream）
                .limit(2)//只获取前10个数字（这是一个无限制的流，如果不加以限制，将会无限进行下去！）
                .filter(i->i<0)// //只保留小于0的数字
                .sorted()
                .forEach(System.out::print);

        // Random是一个随机数工具类
        // 可以生成一个统计实例来帮助我们快速进行统计
        IntSummaryStatistics statistics = random
                .ints(0, 100)
                .limit(100)
                .summaryStatistics();//获取语法统计实例
        System.out.println(statistics.getMax());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getAverage());
    }
}
