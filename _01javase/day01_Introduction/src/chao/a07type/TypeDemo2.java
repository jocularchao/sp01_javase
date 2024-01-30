package chao.a07type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/31 19:30
 * @Description 表达式的自动类型转换
 * 1、表达式的最终结果类型由表达式中的最高类型决定
 * 2、在表达式中，byte、short、char 是直接转换成int类型参与运算的
 */
public class TypeDemo2 {
        public static void main(String[] args) {
            //当用二元运算符进行计算时，会发生自动类型转换

        int a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);


        //面试题
        byte i = 10;
        byte j = 20;
//        byte k=i+j;   //加法运算 可能会导致数据溢出则不能赋值

    }

}
