package zhouyichao;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/5/18 11:13
 * @description:
 */
public class OD_01que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //3
        int[] arr = new int[n];

        int startIndex = 0;
        int endIndex = startIndex+1;
        while (sc.hasNext()) {
            String s = sc.next();

            if (s.contains("head add")) {
                headAdd(s, arr, startIndex);

            } else if (s.contains("tail add")) {
                tailAdd(s, arr, endIndex);
            } else if (s.contains("remove")) {
                remove(arr,startIndex);
            }
        }

    }

    public static void headAdd(String s, int[] arr, int startIndex) {
        int i = Integer.parseInt(s.substring(s.length()));
        arr[startIndex] = i;


    }

    public static void tailAdd(String s, int[] arr, int endIndex) {
        int j = Integer.parseInt(s.substring(s.length()));
        arr[endIndex] = j;
        endIndex++;

    }

    public static void remove(int[] arr, int startIndex) {
        int count = 0;
        if (arr[startIndex] > arr[startIndex + 1]) {
            count += 1;
            int temp = arr[startIndex];
            arr[startIndex] = arr[startIndex + 1];
            arr[startIndex + 1] = temp;
            System.out.println(count);
        }
    }
}
