package chao.c02math;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 19:06
 * @Description 在Math类中，为了达到最快的性能，所有的方法都是用计算机浮点单元中的例程。
 * 如果得到一个完全可预测的结果比运算速度更重要的话，那么就应该使用StrictMath类。
 * 它使用“自由发布的Math库”（fdlibm）实现算法，以确保在所有平台上得到相同的结果。
 * <a href="http://www.netlib.org/fdlibm">源码</a>
 */
public class MathDemo2StrictMath {
    public static void main(String[] args) {
        StrictMath.abs(-1);
    }

}
