package chao.test;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @Author: zwking
 * @E-mail: zwyc16@163.com
 * @Date: 2022-01-06 22:21
 * @Description:
 *
 * 请根据下列描述，选用合适的数据类型定义变量，并输出变量的值
 * 1、班级里有100个学员。
 *
 * 2、某商品价格55.55元。
 *
 * 3、地球已经诞生超过46亿年。
 *
 * 4、“5是偶数”这句话的描述是假的。
 */
public class Demo3 {

    public static void main(String[] args) {
        int student=100;
        double price = 55.5;
        double timeOver=4.6E9;
        System.out.println(student);
        System.out.println(price);
        System.out.println(timeOver);

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean isEven=false;
        if (i%2==0){
            isEven=true;
            System.out.println(isEven);
        }else{
            isEven=false;
            System.out.println(isEven);
        }
    }
}
