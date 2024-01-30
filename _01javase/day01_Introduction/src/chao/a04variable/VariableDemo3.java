package chao.a04variable;

import java.math.BigInteger;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 17:50
 * @Description 如果基本的整数和浮点数精度布恩那个满足需求，那么可以使用可以使用这俩各类：
 * BigDecimal 和  BigInteger
 * 任意精度浮点数 和 任意精度整数
 */
public class VariableDemo3 {
    public static void main(String[] args) {
        //使用静态valueOf方法将普通的数值转换为大数值
        int m = 100;
        BigInteger n = BigInteger.valueOf(m);
        System.out.println(n);

        //计算时不能使用算术运算符 ，应该使用add multiply 方法
        BigInteger a = n.add(BigInteger.valueOf(3));
        BigInteger d = a.multiply(n); // 100 * 103
        System.out.println(d);


        //add subtract multiply divide mod compareTo valueOf
    }
}
