package _00intro;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/16 22:20
 * @description: 输入n个整数，找出其中最小的k个整数并按升序输出
 */
public class Hj058_mix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
