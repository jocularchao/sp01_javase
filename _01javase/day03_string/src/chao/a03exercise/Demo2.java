package chao.a03exercise;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 18:41
 * @description: 模拟用户登录
 */
public class Demo2 {
    public static void main(String[] args) {
        // 1、正确登录名和密码
        String okLoginName = "admin";
        String okPassword = "123456";

        // 2、请您输入登录名称和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("登录名称：");
            String name = sc.next();
            System.out.println("登录密码：");
            String password = sc.next();

            // 3、判断用户输入的登录名称和密码与正确的内容是否相等。
            if (okLoginName.equals(name) && okPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("用户名或者密码错误了！");
            }
        }
    }
}
