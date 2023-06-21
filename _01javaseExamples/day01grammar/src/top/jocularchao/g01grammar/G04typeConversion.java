package top.jocularchao.g01grammar;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/14 20:58
 * @description: 自动类型转换和强制类型转换
 */
public class G04typeConversion {

    public static void main(String[] args) {

        byte b = 127;
        char c = 'W';
        short s = 23561;
        int i = 3333;
        long l = 400000000L;
        float f = 3.1415926F;
        double d = 54.236;

        //低类型向高类型自动转换

        System.out.println("累加byte等于"+b);
        System.out.println("累加char等于"+(b+c));
        System.out.println("累加short等于"+(b+c+s));
        System.out.println("累加int等于"+(b+c+s+i));
        System.out.println("累加long等于"+(b+c+s+i+l));
        System.out.println("累加float等于"+(b+c+s+i+l+f));
        System.out.println("累加double等于"+(b+c+s+i+l+f+d));
        //高类型向低类型强制转换

        System.out.println("long转int"+(int)l);
    }


}
