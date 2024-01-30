package chao.a06operator;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/12 20:21
 * @description:  二元运算符
 * 1 算术运算符
 * + - * /  %<br />
 * 2 加号 + 连接符<br />
 * 3 自增 自减  ++ --<br />
 * 4 赋值运算符 += -= *= /= <br />
 * 5 关系运算符 > >= == < <= !=
 * 6 逻辑运算符 & | ! ^ && ||
 */
public class Operator01Binary {
    public static void main(String[] args) {
        //1 算术运算符
        int a=10;
        int b=3;
        System.out.println(a / b);  //3.33333   ==>3  两个整数做除法结果一定是整数因为最高类型是整数。0不能做除数
        //要求得出小数
        System.out.println(3 * 1.0 / 2); //1.5
        System.out.println(3 / 2 * 1.0); //1.0
        System.out.println(a * 1.0 / b); //3.3333333333333335

        //2 连接符
        //字符串和数字拼接
        System.out.println("abc"+a);
        System.out.println("abc"+'a');
        System.out.println(5 + a);
        System.out.println("abc" + 5 + 'a');
        System.out.println(15 + "abc0" + 15);

        //能算则算
        System.out.println(a + 'a');
        //a+""  连成字符了
        System.out.println(a+""+'a');
        System.out.println(a + 'a' + "itheima");
        System.out.println("itheima" + a + 'a');
        System.out.println("itheima" + (a + 'a'));

        //3 自增 自减


        //4 赋值运算符 隐含了强制数据类型转换
        int j=10;
        double k= 200.0;
        j+=k;
        //j = (int)(j+k)
        System.out.println(j);

    }
}