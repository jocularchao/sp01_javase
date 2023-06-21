package _01easy;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/17 17:27
 * @description: 质数因子
 */
public class Hj006_zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int target = sc.nextInt();
            int y = 2;
            while (target != 1) {
                if (target % y == 0) {
                    System.out.print(y + " ");
                    target /= y;
                } else {
                    if (y > target / y) y = target;
                    else y++;
                }

            }
        }
    }
}
