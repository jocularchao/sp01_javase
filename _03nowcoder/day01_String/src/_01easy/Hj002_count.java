package _01easy;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/15 22:47
 * @description:
 */
public class Hj002_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();

        char str2 = sc.next().toLowerCase().charAt(0);

        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)-str2==0){
                count+=1;
            }
        }

        System.out.println(count);


    }
}
