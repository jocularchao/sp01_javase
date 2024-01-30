package chao.a03exercise;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 18:42
 * @description: 手机号屏蔽
 */
public class Demo3 {
    public static void main(String[] args) {
        //1、输入手机号
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();

        //2、找到确定位置替换为*   截取前三  后四
        String before = phone.substring(0, 3);
        String after = phone.substring(7 );
        String newPhone = before+"****"+after;

        System.out.println(newPhone);
    }
}
