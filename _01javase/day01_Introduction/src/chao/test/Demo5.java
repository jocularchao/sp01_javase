package chao.test;

/**
 * Create with IntelliJ IDEA.
 *
 * @Author: zwking
 * @E-mail: zwyc16@163.com
 * @Date: 2022-01-12 12:20
 * @Description: 找错
 * <p>
 * // 片段1
 * int a = 10;
 * {
 * a = 20;
 * System.out.println(a);
 * }
 * <p>
 * // 片段2
 * {
 * int b = 20;
 * System.out.println(b);
 * }
 * b = 30;
 * System.out.println(b);
 */
public class Demo5 {

    public static void main(String[] args) {
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }
        //int b;
        //{
        //    int b = 20;
        //    System.out.println(b);
        //}
        //b = 30;
        //System.out.println(b);


    }
}
