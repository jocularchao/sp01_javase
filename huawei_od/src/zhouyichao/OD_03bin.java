package zhouyichao;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/18 10:50
 * @description: 不含101 [r,l]
 */
public class OD_03bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int l = sc.nextInt();
        int sum  = l-r+1;
        int[] arr = new int[sum];
        for (int i = 0; i < sum; i++) {
            arr[i]=r+i;
        }
        /*for (int i = 0; i < sum; i++) {
            System.out.print(arr[i]+" ");
        }*/

        int count= 0;
        for (int i = 0; i < sum; i++) {
            if (Integer.toBinaryString(arr[i]).contains("101")){
                count++;
            }
        }
        System.out.println(sum-count);

    }

}
