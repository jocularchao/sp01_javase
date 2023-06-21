package _01easy;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/15 21:54
 * @description: 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
 * （注：字符串末尾不以空格为结尾）
 */
public class Hj001_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
