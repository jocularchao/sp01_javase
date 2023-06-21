package _00intro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/15 23:38
 * @description: 输入一个 int 型整数，按照从右向左的阅读顺序，
 * 返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 */
public class Hj009_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int target = sc.nextInt();

            Set<Integer> set = new HashSet<>();
            while (target != 0) {

                int temp = target % 10;
                if (set.add(temp)) {
                    System.out.print(temp);
                }
                target = target / 10;
            }
            System.out.println();


        }


    }
}
