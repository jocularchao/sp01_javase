package chao.a07type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/1 11:54
 * @Description 强制类型转换
 */
public class TypeDemo3 {
    public static void main(String[] args) {
        //1可能造成数据溢出
        int a=20;
        //        byte b=a;//类型范围大的数据或者变量；不能直接赋值给类型范围小的变量，会报错
        //此时 可以强行将范围大的变量、数据赋值给类型范围小的变量
        byte b= (byte) a;
        System.out.println(a);
        System.out.println(b);

        int a1=200;
        byte b1=(byte) a1;
        System.out.println(a1);
        System.out.println(b1);
        /*
        原理 java中的变量都是以补码的形式保存
        a  32位 00000000 00000000 00000000 00010100
        b  8位                             00010100

        a1 32位 0 0000000 00000000 00000000 11001000   200

        强制类型转换时 实际上是求出补码后截掉24个0后
                                           1 1001000
        符号位为1此时求补码
                                           1 0110111
                                           1 0111000

        b1  8位                            1 0111000   -56

         */
        //2浮点型强转成整型，直接都掉小数部分，保留整数部分返回
        double score=99.5;
        int it = (int) score;
        System.out.println(it);
    }
}
