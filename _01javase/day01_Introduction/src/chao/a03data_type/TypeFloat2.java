package chao.a03data_type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/9 17:52
 * @description: 浮点数详解
 *
 * 所有浮点数值计算都遵循IEEE 754 规范
 * 三个特殊的浮点数值
 *
 */
public class TypeFloat2 {
    public static void main(String[] args) {
        float f = 3.14F;    //4
        double d = 3.14D;   //8   没有后缀默认double

        //----------------------扩展--------------------------
        //1、用十六进制表示浮点数值
        double d1 = 0x1.0p-3;
        System.out.println(d1); //2的-3次方 0.125   p 表示指数


        //2、用于表示溢出和出错情况的三个特殊的浮点数值:正无穷大、负无穷大、NaN（0/0 不是一个数字）
        double t1 = Double.POSITIVE_INFINITY;     //正无穷大
        double t2 = Double.NEGATIVE_INFINITY;     //负无穷大
        double t3 = Double.NaN;                   //NaN
        double x1 = 3.0/0;
        double x2 = -3.0/0;
        double x3 = 0.0/0;
        //所有非数值的值都认为是相同的所以不能用简单if判断，要用isNaN();
        System.out.println(t3 == x3 ? true : false);
        System.out.println(Double.isNaN(x3) ? true : false);

        System.out.println(t1 == x1 ? true : false);
        System.out.println(Double.isInfinite(x1) ? true : false);

        System.out.println(t2 == x2 ? true : false);
        System.out.println(Double.isInfinite(x2) ? true : false);

        // 判断有限浮点数
        System.out.println(Double.isFinite(3.0/2.0));


        //3、浮点数值无法用于金融计算
        System.out.println(2.0 - 1.1);            //0.8999999999999999
        //主要原因：浮点数值采用二进制系统表示，而在二进制系统中无法精确地表示分数1/10，就比如十进制无法精确地表示分数1/3
        //所以应该用BigDecimal


    }
}
