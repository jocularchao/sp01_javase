package top.jocularchao.o02temperature;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/20 21:37
 * @description:
 */
public class Temperature {
    public double toFahrenheit(double centigrade){
        double fahrenheit = 1.8*centigrade+32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("请输入要转换的温度(单位：摄氏度)");
        Scanner in = new Scanner(System.in);
        double centigrade = in.nextDouble();
        Temperature t = new Temperature();
        double fahrenheit = t.toFahrenheit(centigrade);

        System.out.println(fahrenheit);
    }
}
