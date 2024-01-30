package jcs;

import java.util.Scanner;

/**
 * @author jocularchao
 * @date 2024-01-04 18:15
 * @description 递归判断回文数
 */
public class JCS01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入");
        String str = sc.next();
        if (isPalindrome(str)){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }

    }

    public static boolean isPalindrome(String str){
        // 0 1 特殊判断
        if (str.isEmpty() | str.length()==1)
            return true;

        //若首尾相同 剪切字符串递归判断
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
