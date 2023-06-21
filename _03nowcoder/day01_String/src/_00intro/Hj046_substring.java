package _00intro;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/16 22:15
 * @description: 输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
 */
public class Hj046_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        String newStr = str.substring(0,k);
        System.out.println(newStr);
    }
}
