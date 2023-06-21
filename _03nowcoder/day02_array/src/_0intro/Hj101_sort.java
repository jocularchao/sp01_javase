package _0intro;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/16 22:34
 * @description: 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 第一行输入数组元素个数
 * 第二行输入待排序的数组，每个数用空格隔开
 * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
 */
public class Hj101_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            switch (sc.nextInt()){
                case 0:
                    Arrays.sort(arr);
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 1:
                    Arrays.sort(arr);
                    for (int i = n-1; i >=0 ; i--) {
                        System.out.print(arr[i]+" ");
                    }
            }
            System.out.println();
        }
    }
}
