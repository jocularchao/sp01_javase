package jcs3;

import java.util.Scanner;

/**
 * @author jocularchao
 * @date 2024-01-10 19:58
 * @description 输入任意字符串，找出最长回文子串，并返回它的长度
 *用动态规划
 * ababa
 *
 */
public class JCS01 {
    /*
    1. 确定dp数组（dp table）以及下标的含义
        因为要分别从字符串两端进行判断 创建二维数组 dp[i][j]正好遍历整个字符串 需要判断 dp[i][j] dp[i+1][j-1]
    2. 确定递推公式
        s[i]!=s[j]-----dp[i][j]一定是false。
        s[i] =s[j]-----
            i = j true
            j = i+1 true
            else  递归判断
    3. dp数组如何初始化
        false
    4. 确定遍历顺序
        若bab 为回文串 ，那么ababa一定为回文串，要从里往外判断
    5. 举例推导dp数组
        a aba ababa b bab a aba b a
    */

    //奇数情况
    public static String maxLengthPalindrome(String s){
        int len = s.length();

        //长度小于2, 肯定是回文数
        if (len<2){
            return s;
        }
        //最大字符串长度
        int maxLength = 1;

        //最长字符串的左边界
        int begin = 0;

        //1 创建dp数组 dp[i][j]表示 i....j是否为回文数
        boolean[][] dp = new boolean[len][len];

        //2 初始化 len为1 都为回文子串  即 i==j
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        //转换成字符数组 便于取值
        char[] charArray = s.toCharArray();

        //3 遍历

        for (int n = 2; n <=len ; n++) {    //先遍历子串长度 ，最小为二
            //遍历dp[i]的 i ,再由子串长度找到对应的dp[j]的 j
            for (int i = 0; i < len; i++) {
                int j = n+i -1;
                //越界判断
                if (j>=len){
                    break;
                }

                //递推公式
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {        //判断长度为2
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                //获取最大长度的子串
                if (dp[i][j] && j-i+1 >maxLength){
                    maxLength = j-i+1;
                    begin = i;
                }

            }


        }
        return s.substring(begin,begin+maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(maxLengthPalindrome(s));
    }


}
