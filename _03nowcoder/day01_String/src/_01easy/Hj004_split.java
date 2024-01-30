package _01easy;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/16 22:51
 * @description:
 * •输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
 *
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Hj004_split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.length()%8!=0) {
            int temp = 8-str.length()%8;
            for (int i = 0; i < temp; i++) {
                str.concat("0");
            }
        }

        int  n = str.length()/8;
        String [] arr = new String[n];
        for (int i = 0; i <= n; i++) {
            arr[i]=str.substring(i*8, (i+1)*8);
        }
        for (String newStr :
                arr) {
            System.out.println(newStr);
        }
    }
}
