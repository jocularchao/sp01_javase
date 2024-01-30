package _00intro;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/15 23:16
 * @description: 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
 *
 * 数据范围：保证输入的数字在 32 位浮点数范围内
 */
public class Hj007_range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();

        System.out.println((int)(d+0.5));

    }
}
