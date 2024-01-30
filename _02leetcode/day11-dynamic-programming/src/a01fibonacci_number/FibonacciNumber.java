package a01fibonacci_number;

/**
 * @author jocularchao
 * @date 2024-01-10 17:44
 * @description 斐波那契数
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * F(0) = 0，F(1) = 1 F(n) = F(n - 1) + F(n - 2)，其中 n > 1 给你n ，请计算 F(n) 。
 * F(2) = 1
 * F(3) = 2
 * F(4) = 3
 */
public class FibonacciNumber {
    //1 动态规划
    /*
    1. 确定dp数组（dp table）以及下标的含义  F(n)
    2. 确定递推公式       F(n) = F(n - 1) + F(n - 2)
    3. dp数组如何初始化    F(0) = 0，F(1) = 1
    4. 确定遍历顺序       dp[i]是依赖 dp[i - 1] 和 dp[i - 2]，那么遍历的顺序一定是从前到后遍历的
    5. 举例推导dp数组     0 1 1 2 3 5 8 13 21 34 55
    */
    public static int fib1(int n){
        if (n<2){
            return n;
        }
        int a = 0 , b = 1 , c = 0;

        //从F（2）开始看 加一次就行了 所以 i初始值为1 遍历一次
        for (int i = 1; i < n; i++) {
            //求得数
            c = a+b;
            // 各个位置进一位
            a =b;
            b= c;
        }
        return c;

    }

    //2 非压缩状态
    public static int fib2(int n){
        if (n<2){
            return n;
        }
        //确定dp数组
        int[] dp = new int[n+1];
        //初始化
        dp[0] = 0;
        dp[1] =1;
        //数组内存最小从2 开始
        for (int index = 2;index <= n;index++) {
            dp[index] = dp[index-1]+dp[index-2];
        }
        return dp[n];

    }

    //3 递归
    public static int fib3(int n){
        if (n<2){
            return n;
        }
        return fib3(n-1)+fib3(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fib1(10));
        System.out.println(fib2(10));
        System.out.println(fib3(10));
    }



}
