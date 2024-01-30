package chao.c03random;

import java.util.Random;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 19:15
 * @Description 随机数类 Random
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        //1、创建随机数对象
        Random random = new Random();
        //2、调用nextInt方法 可以返回一个整型的随机数
        //ctrl alt t
//        for (int i = 0;i<20;i++) {
//            int data = a03random.nextInt(10);//0-9
//            System.out.println(data);
//        }

        System.out.println("-------------------------");
        //1 - 10 ==>-1==>(0-9)+1
        int data = random.nextInt(10) + 1;
        System.out.println(data);
        //3 - 17 ==>-3==>(0-14)+1
        int data1 = random.nextInt(15) + 3;
        System.out.println(data1);
    }
}
