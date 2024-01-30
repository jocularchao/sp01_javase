package chao.b01branch;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @Author: zwking
 * @E-mail: zwyc16@163.com
 * @Date: 2022-01-10 12:03
 * @Description: 根据月份判断他的天数
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        //用户输入月份可以展示该月份的天数
        //1、3、5、7、8、10、12是31天
        //2月份闰年是29天，分闰年是28天
        //4、6、9、11月份是30天
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");

        int month = scanner.nextInt();
        //代码冗余
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月是30天");
                break;
            case 2:
                System.out.println(month+"月闰年是29天，非闰年是28天");
                break;
            default:
                System.out.println("数据有误");
        }

    }
}
