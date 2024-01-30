package chao.c02math;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 18:21
 * @Description Math API
 */
public class MathDemo1 {
    public static void main(String[] args) {

        //1 常量近似值
        double a = Math.PI;  //3.14159265358979323846
        double a1 = Math.E;  //2.7182818284590452354

        //2 数值方法
        Math.abs(-1);            //1 绝对值
        Math.negateExact(2);     //-2 相反数
        Math.addExact(100, 100); //200 求和，溢出后若是int就抛出int；若是long就抛出long
        //floorMod方法
        //整数取余时，n%2。当n是负数时，表达式为-1。但余数总要>=0
        Math.floorMod(-3,2);     //1   若是-3%2,则结果为-1,并不对
        Math.cbrt(0);            //返回double值的多维数据集根  不懂

        Math.ceil(2);            //2.0 向上取整
        Math.floor(3.23);        //3.0 向下取整
        Math.floorDiv(4,-3);     //-2 正常来说是-1 但向下取整了返回的是小于或者等于结果的最大int值
        Math.floorMod(4, -3);    //-2 floorDiv(x, y) * y + floorMod(x, y) == x

        Math.copySign(89, -2);   //-89 使用第二个浮点参数的符号返 回第一个浮点参数
        Math.decrementExact(0);  //-1 返回一个递减1的参数，如果结果溢出int，则 int

        Math.max(1, 2);
        Math.min(1, 2);
        Math.multiplyExact(1, 2); //2 返回乘积，溢出返回最大值



        //3 次幂
        Math.sqrt(4);       //2 平方根
        Math.pow(4, 3);     //64 4的3次幂
        Math.exp(2);        //e的2次幂

        Math.hypot(2, 3);   //返回sqrt（ x 2 + y 2 ），没有中间溢出或下溢

        Math.log(Math.exp(2));//以e为底
        Math.log(100);      //以10为底


        //4 三角函数
        Math.sin(1);
        Math.cos(1);
        Math.tan(1);
        Math.atan(1);
        Math.atan2(1,2);
        //反三角
        Math.acos(1);
        Math.asin(1);
        Math.atan(1);
        Math.atan2(Math.PI/2,Math.PI);
        //双曲
        Math.cosh(Math.PI/4);



        //指数函数
        Math.exp(1);
        Math.log(1);
        Math.log10(1);









    }
}
