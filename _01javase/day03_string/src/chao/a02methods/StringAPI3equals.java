package chao.a02methods;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/24 18:26
 * @description:
 */
public class StringAPI3equals {
    public static void main(String[] args) {
        //1、正确的用户名、密码
        String username = "jocularchao";
        String password = "123456";

        //2、输入用户名密码
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String pwd = sc.next();


        //3、进行比较
        if (username.equals(name) && password.equals(pwd)){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
    }


}
