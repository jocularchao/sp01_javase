package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/19 19:15
 * @description: 字符串
 * 从概念上讲，java字符串就是Unicode字符序列。 串"Java\u2122"。
 * java没有内置的字符串类型，而是在标准java类库中提供了一个预定义类，很自然地叫String。
 * *****每个双引号括起来的字符串都是String类的一个实例。
 */
public class String01basis {
    public static void main(String[] args) {
        String a = "Hello";

        //1、分割字符串
        String a1 = a.substring(0, 3);      //[0,3)  Hel   length = 3-0

        //2、字符串拼接  用+
        String s = a + a1;

        System.out.println(a1); //Hel
        System.out.println(s);  //HelloHel


        //3、分隔符join
        String s1 = String.join("/", a, a1, s);

        System.out.println(s1); //Hello/Hel/HelloHel


        //4、不可变字符串
        //String类中没有用于修改字符串的方法。即字符串不可变
        // 那如何修改字符串，    分割 拼接 替换        编程另外一个字符串
        String a3 = a.substring(0, 3) + "p!";
        System.out.println(a3); //help!
        //但这样做，效率并不高。编辑器可以让字符串共享。


        //so，可以看成  吧各种字符串放在一个公共的存储池中，如何要复制一个字符串变量，原始字符串与复制字符串共享相同字符

        //例外：将来自与文件或键盘的单个字符或较短的字符串汇集成字符串，为此，java提供了一个独立的类  *****StringBuilder

        //5、equals
        System.out.println(a.equals(a1));   //检测两个字符串是否相等
        System.out.println(a.equalsIgnoreCase("hello"));   //检测两个字符串是否相等不区分大小写

        //只有字符串常量时共享的，所以不能用==

        //6、空串和null串

        //空串：长度为0内容为空
        //null串：存了个null
        //有时要检查一个字符串既不是null串又不是空串,要先检查null，在null值上调用方法，会出现错误
        if (a != null && a.length()!=0) System.out.println(1);

    }
}
