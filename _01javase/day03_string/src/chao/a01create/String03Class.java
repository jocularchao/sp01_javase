package chao.a01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/4/23 20:22
 * @description: public String() 创建一个空白字符串对象，不含有任何内容
 * public String(String original) 根据传入的字符串内容，来创建字符串对象
 * public String(char[] chs) 根据字符数组的内容，来创建字符串对象
 * public String(byte[] chs) 根据字节数组的内容，来创建字符串对象
 */
public class String03Class {
    public static void main(String[] args) {
        String s = "111";


        //1  public String() 创建一个空白字符串对象，不含有任何内容
        String s1 = new String();

        System.out.println(s1);

        //2  public String(String original) 根据传入的字符串内容，来创建字符串对象
        String s2 = new String("我是中国人");
        System.out.println(s2);

        //3  public String(char[] chs) 根据字符数组的内容，来创建字符串对象

        char[] chars = {'a', 'b', 'z'};
        String s3 = new String(chars);
        System.out.println(s3);

        //4  public String(byte[] chs) 根据字节数组的内容，来创建字符串对象
        byte[] bytes = {1, 2, 3, 4};
        String s4 = new String(bytes);
        System.out.println(s4);


        //以“”方式给出的字符串对象，在字符串常量池中存储，而且相同内容只会在其中存储一份。
        String ss = "111";
        System.out.println(ss == s);


        //通过构造器new对象，每new一次都会产生一个新对象，放在堆内存中。
        String ss1 = new String();

        System.out.println(ss1 == s1);


        //实际上创建了两个对象
        String s22 = new String("abc");
        String s11 = "abc";
        System.out.println(s11 == s22);  //false


        String s33 = "abc";
        String s44 = "ab";
        String s55 = s44 + "c";
        System.out.println(s55 == s33);  //false


        //Java存在编译优化机制，程序在编译时： “a” + “b” + “c” 会直接转成 "abc"
        String s6 = "abc";
        String s7 = "a" + "b" + "c";
        System.out.println(s6 == s7);//true


    }
}
