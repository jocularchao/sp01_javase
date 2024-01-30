package chao.a07type;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/31 19:30
 * @Description 理解自动类型转换   类型范围小的变量可以直接赋值给类型范围大的变量
 * byte 、 short 、 char ——> int  ——> long ——> float ——> double
 */
public class TypeDemo1 {

    public static void main(String[] args) {

        byte a = 20;
        int b = a;   //此时发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        /*a                            00010100
          b 00000000 00000000 00000000 00010100


          */

        int age =23;
        double db=age;  //自动类型转换

        System.out.println(db);  //23.0

        // char 类型的变量可以直接赋值给int 类型 二进制数据

        char ch = 'a';   //                  00000000 01100001
        int code = ch;   //00000000 00000000 00000000 01100001
        System.out.println(code);

        double db1=ch;
        System.out.println(db1);

    }
}
