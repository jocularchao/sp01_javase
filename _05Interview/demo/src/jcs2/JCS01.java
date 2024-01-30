package jcs2;

import java.util.Scanner;

/**
 * @author jocularchao
 * @date 2024-01-05 18:14
 * @description 输入字符串 输出长度最长的回文字符串
 */
public class JCS01 {

    public static String test(String str){
        //
        int count = 0;
        String left ="";
        String right = "";
        for (int i = 0; i < str.length()-1; i++) {  //遍历
            for (int j = str.length()-1; j >i ; j--) {
                if (str.charAt(i) != str.charAt(j)){   //判断回文字
                    count = 0;
                }else {
                    count++;
                    i++;
                }
            }
            left=str.substring(i,i+count-1);
        }
        for (int i = str.length()-1; i >0 ; i--) {  //遍历
            for (int j = 0; j <i ; j++) {
                if (str.charAt(i) != str.charAt(j)){   //判断回文字
                    count = 0;
                }else {
                    count++;
                }
            }
            right=str.substring(count+1-i,i);
        }
        if (left.length()>=right.length()){
            System.out.println(left);
            return left;
        }else {
            System.out.println(right);
            return right;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        String s = sc.next();

        test(s);

    }
}
